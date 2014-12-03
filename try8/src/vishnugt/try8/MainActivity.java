package vishnugt.try8;

import android.app.Activity;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

		public void gooo(View v)
		{
		String mocLocationProvider = LocationManager.NETWORK_PROVIDER;
		String str = (String)findViewById(R.id.editText1).toString();
		String[] MockLoc = str.split(",");
		Location location = new Location(mocLocationProvider);            
		Double lat = Double.valueOf(MockLoc[0]);
		location.setLatitude(lat);
		Double longi = Double.valueOf(MockLoc[1]);
		location.setLongitude(longi);
		Double alti = Double.valueOf(MockLoc[2]);
		location.setAltitude(alti);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
