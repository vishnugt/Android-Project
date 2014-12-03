package vishnugt.test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements LocationListener {


	public void go1(View v)
	{
		
		 EditText et1 = (EditText) findViewById(R.id.editText1);
		 EditText et2 = (EditText) findViewById(R.id.editText2);
		if(et1.getText().toString()=="" & et2.getText().toString()=="")
			
			Toast.makeText(getApplicationContext(), "If the values are null it will load your last viewed location", 
				   Toast.LENGTH_SHORT).show(); 
		String uri = "geo:"+ et1.getText().toString() + "," + et2.getText().toString();
		 new Thread(new Runnable() { 
	            public void run(){
	      try {
	    	  while(true){
	    

	    		  try {
					Thread.sleep(2000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

	    		  vishnu();}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}      }
	    }).start();
		//startActivity(new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(uri)));
	}

public void vishnau() throws IOException
{
	URL url = new URL("http://10.1.77.186/spidertask4/master.php?data=geo:" + latitude +","+longitude);
	URLConnection con = url.openConnection();
	InputStream in = con.getInputStream();
	String encoding = con.getContentEncoding();
	encoding = encoding == null ? "UTF-8" : encoding;
	ByteArrayOutputStream baos = new ByteArrayOutputStream();
	byte[] buf = new byte[8192];
	int len = 0;
while ((len = in.read(buf)) != -1) {
    baos.write(buf, 0, len);
}
String body = new String(baos.toByteArray(), encoding);
	//startActivity(new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(body)));
	}

public void vishnu() throws IOException
{
	URL url = new URL("http://192.168.42.51/spidertask4/data.php");
	URLConnection con = url.openConnection();
	InputStream in = con.getInputStream();
	String encoding = con.getContentEncoding();
	encoding = encoding == null ? "UTF-8" : encoding;
	ByteArrayOutputStream baos = new ByteArrayOutputStream();
	byte[] buf = new byte[8192];
	int len = 0;
while ((len = in.read(buf)) != -1) {
    baos.write(buf, 0, len);
}
String body = new String(baos.toByteArray(), encoding);
	startActivity(new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(body)));
	}

public void go2(View v) throws InterruptedException
	{

		
		 EditText et = (EditText) findViewById(R.id.editText3);

		if(et.getText().toString()=="")
		Toast.makeText(getApplicationContext(), "If the values are null it will load your last viewed location", 
				   Toast.LENGTH_SHORT).show(); 
		final Intent myIntent = new Intent(
			    android.content.Intent.ACTION_VIEW,
			    Uri.parse( "geo:0,0?q=" +  et.getText().toString())
			);
		
		startActivity(myIntent);

		}
	

	public RadioButton radio1, radio2, radio3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		radio1 = (RadioButton)findViewById(R.id.radioButton1);
		radio2 = (RadioButton)findViewById(R.id.radioButton2);
		radio3 = (RadioButton)findViewById(R.id.radioButton3);
		
		
		LocationManager lm = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
		lm.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, this);

		StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
		StrictMode.setThreadPolicy(policy); 
	
		LocationManager lam = (LocationManager)getSystemService(Context.LOCATION_SERVICE); 
		Location location = lam.getLastKnownLocation(LocationManager.GPS_PROVIDER);
		//longitude = location.getLatitude();
		//latitude = location.getLongitude();
}
	double latitude=321;
	double longitude=4564;
	
	public void somefunction(){
		LocationManager lam = (LocationManager)getSystemService(Context.LOCATION_SERVICE); 
		Location location = lam.getLastKnownLocation(LocationManager.GPS_PROVIDER);
		longitude = 321;
		latitude = 4564;
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		URL url = null;
		try {
			url = new URL("http://192.168.42.51/spidertask4/master.php?data=geo:"+latitude+","+longitude);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		URLConnection con = null;
		try {
			con = url.openConnection();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		InputStream in = null;
		try {
			in = con.getInputStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	

	
	public void first(View v)
	{

		if(radio2.isChecked()) radio2.setChecked(false);
		if(radio3.isChecked()) radio3.setChecked(false);
	}

	public void second(View v)
	{

		
		if(radio1.isChecked()) radio1.setChecked(false);
		if(radio2.isChecked()) radio2.setChecked(false);
	}
	
	public void third(View v) throws IOException
	{

		if(radio1.isChecked()) radio1.setChecked(false);
		if(radio3.isChecked()) radio3.setChecked(false);
		//somefunction();
		vishnau();

try{
        URL url= new URL("http://10.1.80.97/spidertask4/master.php?data=geo:" + latitude +","+longitude);
        SAXParserFactory factory =SAXParserFactory.newInstance();
        SAXParser parser=factory.newSAXParser();
        XMLReader xmlreader=parser.getXMLReader();
       // RssHandler theRSSHandler=new RssHandler();
       // xmlreader.setContentHandler(theRSSHandler);
        InputSource is=new InputSource(url.openStream());
        xmlreader.parse(is);
} catch (SAXException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (ParserConfigurationException e){
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}
	
	public void back (View v)
	{
		//Here I am restarting the application
		Intent i = getBaseContext().getPackageManager()
	             .getLaunchIntentForPackage( getBaseContext().getPackageName() );
	i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
	startActivity(i);
	}

	public void myfunction() throws IOException
	{
		URL url = new URL("http://10.1.80.97/spidertask4/master.php?data=" + "geo:"+lat1+lan1);
		URLConnection con = url.openConnection();
		InputStream in = con.getInputStream();
			
	}
	
	public void asdfunction()
	{
		 new Thread(new Runnable() { 
	            public void run(){
	      try {
	    	  while(true){
	    

	    		  try {
					Thread.sleep(2000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

	    			URL url = new URL("http://10.1.80.97/spidertask4/master.php?data=" + "geo:"+lat1+lan1);
	    			URLConnection con = url.openConnection();
	    			InputStream in = con.getInputStream();
	    		}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}      }
	    }).start();
	
	}
	Double lat1,lan1;
	@Override
	public void onLocationChanged(Location location) 
		{
		 lat1 = location.getLatitude();
		 lan1 = location.getLongitude();
		 try {
			myfunction();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	public void mainfunc(View v)
	{

		RadioButton radio1 = (RadioButton)findViewById(R.id.radioButton1);
		RadioButton radio2 = (RadioButton)findViewById(R.id.radioButton2);
		RadioButton radio3 = (RadioButton)findViewById(R.id.radioButton3);
		
		if(radio1.isChecked())
		{
			setContentView(R.layout.latlong);
			
		}
		if(radio2.isChecked())
		{
			setContentView(R.layout.location);
		}
		if(radio3.isChecked())
		{
			

			String uri = "geo:"+ lat1 + "," + lan1;
			startActivity(new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(uri)));

			somefunction();
		}
		
	}
	@Override
	public void onProviderDisabled(String arg0) {
		
	}
	@Override
	public void onProviderEnabled(String arg0) {
		
	}
	@Override
	public void onStatusChanged(String arg0, int arg1, Bundle arg2) {
		
	}

}
