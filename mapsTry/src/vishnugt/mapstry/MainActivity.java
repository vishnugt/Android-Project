package vishnugt.mapstry;


import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends Activity {
	
	// variables for latitude and longitude
	float lat=0;
	float lon=0;
	// the variable which is used to check if values have been recived 
	int checklatlan=0;
	
	//variables for storing the address
	String address; 
	// the variable which is used to check if address has been stored 
	int checkaddress=0;
	
	public void test()
	{
		//LocationManager lm = (LocationManager)getSystemService(Context.LOCATION_SERVICE); 
		Location location = lm.getLastKnownLocation(LocationManager.GPS_PROVIDER);
		lon = (float)location.getLongitude();
		lat = (float) location.getLatitude();

		getFragmentManager().beginTransaction()
		.replace(R.id.container, new PlaceholderFragment()).commit();
	}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// this is the empty veiw, we impose all the various fragments on this activity_main layout
		setContentView(R.layout.aactivity_main);
		
        //on the creation of the app itself we add the "placeholderfragment" which has the 3 radio buttons and thus acts as the main menu
		if (savedInstanceState == null) {
			getFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
			LocationManager lm = (LocationManager)getSystemService(Context.LOCATION_SERVICE); 
			

	}
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	// we define the before mentioned fragment 
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			// and thus for this main menu the layout used is 'fragment_main'
			View rootView = inflater.inflate(R.layout.activity_main, container,
					false);
			return rootView;
		}
	}
	
	//the following three functions just makes sure only a single radio button remains checked at a time
	
	//radio1 this is the radiobutton for entering lat/lan
	public void latlan(View v){
		//now we need to make sure no other radio button is checked
		RadioButton radio2 = (RadioButton)findViewById(R.id.radioButton2);
		RadioButton radio3 = (RadioButton)findViewById(R.id.radioButton3);
		if(radio2.isChecked()) radio2.setChecked(false);
		if(radio3.isChecked()) radio3.setChecked(false);
	}
	
	//radio2 this is the radiobutton for entering the address
	public void map(View v){
		//now we need to make sure no other radio button is checked 
		RadioButton radio1 = (RadioButton)findViewById(R.id.radioButton1);
		RadioButton radio3 = (RadioButton)findViewById(R.id.radioButton3);
		if(radio1.isChecked()) radio1.setChecked(false);
		if(radio3.isChecked()) radio3.setChecked(false);
	}
	
	//radio3 here this is to get the intent to the maps application started
	public void address(View v){
		//now we need to make sure no other radio button is checked
		RadioButton radio1 = (RadioButton)findViewById(R.id.radioButton1);
		RadioButton radio2 = (RadioButton)findViewById(R.id.radioButton2);
		if(radio2.isChecked()) radio2.setChecked(false);
		if(radio1.isChecked()) radio1.setChecked(false);
	}
	
	
	//go button, this button checks which of the 3 options the user wants to execute and does it accordingly
	public void go(View v){
		
		//first we establish the handles
		RadioButton radio1 = (RadioButton)findViewById(R.id.radioButton1);
		RadioButton radio2 = (RadioButton)findViewById(R.id.radioButton2);
		RadioButton radio3 = (RadioButton)findViewById(R.id.radioButton3);
		
		//now we need to call the maps using the appropriate intent or generate the ui elements depending on WHICH radiobutton was checked
		if(radio1.isChecked()){
			// we need to accept the lat/lan values, so we replace the existing PlaceholderFragment fragment which was
			//residing in the container with the LatLanFragment
			getFragmentManager().beginTransaction()
			.replace(R.id.container, new LatLanFragment()).commit();
		}
        //in the case user wants to proceed with the latest available info (lat,lon or address) and see it in the map
		else if(radio2.isChecked()){
			//check if lat lan is available and is the latest (you can enter both)
			if(checklatlan==1){
				// this is a implicit intent used to request that another capable app show a specified location on a map
				// the "geo:0,0?q=" tag is used to signify the next part is the query term (hence the q)
				final Intent myIntent = new Intent(
					    android.content.Intent.ACTION_VIEW,
					    Uri.parse( "geo:0,0?q=" + lat + "," + lon )
					);
				startActivity(myIntent);
			}
			//check if address is available and is the latest (you can enter both)
			else if(checkaddress==1){
				// this is a implicit intent used to request that another capable app show a specified location on a map
				// the "geo:0,0?q=" tag is used to signify the next part is the query term (hence the q)
				final Intent myIntent = new Intent(
					    android.content.Intent.ACTION_VIEW,
					    Uri.parse( "geo:0,0?q=" + address )
					);
				startActivity(myIntent);
			}
			else{
				// in the case no information is available 
				Context context = getApplicationContext();
				CharSequence text = "Sorry, You havent Entered the latitude and longitude and neither the Address";
				int duration = Toast.LENGTH_SHORT;

				Toast toast = Toast.makeText(context, text, duration);
				toast.show();
			}
		}
		// we need to accept the address as a string, so we replace the existing PlaceholderFragment fragment which was
		//residing in the container with the AddressFragment
		else if(radio3.isChecked()){
			getFragmentManager().beginTransaction()
			.replace(R.id.container, new AddressFragment()).commit();
		}
		// in the case none of the 3 radio buttons are checked,  we display the appropriate toast
		else{
			Context context = getApplicationContext();
			CharSequence text = "You Havent Selected Any of the 3 options!!";
			int duration = Toast.LENGTH_SHORT;

			Toast toast = Toast.makeText(context, text, duration);
			toast.show();
		}
		
	}
	
	// this function is called when the back of the lan/lon accepter fragment (LatLanFragment) is clicked
	public void back(View v){
		//establish handles
		EditText lat_edit = (EditText)findViewById(R.id.editText1);
		EditText lon_edit = (EditText)findViewById(R.id.editText2);
		
		//keep the exception handler for the case where nothing is entered
		try{
			lat=Float.valueOf(lat_edit.getText().toString());
			lon=Float.valueOf(lon_edit.getText().toString());
			// as info has been recieved we update the flag variable
			checklatlan=1;
		}
		catch(NumberFormatException e){
			e.printStackTrace();
		}
		// in the case the info hasnt been entered, we notify the user
		if(checklatlan==0){
			Context context = getApplicationContext();
			CharSequence text = "You havent Entered both the latitude and longitude";
			int duration = Toast.LENGTH_SHORT;

			Toast toast = Toast.makeText(context, text, duration);
			toast.show();
		}
		//else if the data HAS been recived
		else{
			Context context = getApplicationContext();
			CharSequence text = "Your lat/lon Values have been saved!";
			int duration = Toast.LENGTH_SHORT;

			Toast toast = Toast.makeText(context, text, duration);
			toast.show();
			// we have lat/lan as the LATEST data as of now, so even if address has been entered we have to change the
			// flag variable of address to 0, signifing that it was Old News ;)
			checkaddress=0;
		}
		//get back to the main fragment
		getFragmentManager().beginTransaction()
		.replace(R.id.container, new PlaceholderFragment()).commit();
	}
	
	// this is the function called when back is clicked inside of the AddressFragment
	public void backaddress(View v){
		//establish handles
		EditText address_edit = (EditText)findViewById(R.id.editText1);
		// get the address as a string
		address = address_edit.getText().toString();
		// assume the string is valid and not empty
		checkaddress=1;
		// check if he has entered anything 
		if(address.matches("")){
			Context context = getApplicationContext();
			CharSequence text = "You Havent Entered the Address!!";
			int duration = Toast.LENGTH_SHORT;

			Toast toast = Toast.makeText(context, text, duration);
			toast.show();
			//as our assumption is wrong reset the flag variable
			checkaddress=0;
		}
		else{
			Context context = getApplicationContext();
			CharSequence text = "Your address has been Saved";
			int duration = Toast.LENGTH_SHORT;

			Toast toast = Toast.makeText(context, text, duration);
			toast.show();
			//as the string has been recieved and is valid, the lan/lon info is Old news ;) so we update the flag variable for lan/lon
			checklatlan=0;
		}
		//get back to the main fragment
		getFragmentManager().beginTransaction()
		.replace(R.id.container, new PlaceholderFragment()).commit();
	
	}
	
	// we define the fragment which handles the input for the address
	public static class AddressFragment extends Fragment {

		public AddressFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.address, container,
					false);
			return rootView;
		}
		
		
	}
	
	// we define the fragment which handles the input for the lat/lon
	public static class LatLanFragment extends Fragment {

		public LatLanFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.latlan, container,
					false);
			return rootView;
		}
		
		
	}

}
