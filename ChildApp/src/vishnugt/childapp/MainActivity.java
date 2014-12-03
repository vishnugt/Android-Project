package vishnugt.childapp;

import java.io.IOException;
import java.net.URL;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements LocationListener{

EditText et1, et2, et3;
TextView tv2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
		StrictMode.setThreadPolicy(policy); 

		//tv=(TextView)findViewById(R.id.textView1);
		//et1=(EditText)findViewById(R.id.editText1);
		//et2=(EditText)findViewById(R.id.editText2);
		//et3=(EditText)findViewById(R.id.editText3);

		tv2=(TextView)findViewById(R.id.textView5);
		
		LocationManager lam = (LocationManager)getSystemService(Context.LOCATION_SERVICE); 
		Location location = lam.getLastKnownLocation(LocationManager.GPS_PROVIDER);
	
		String lat1 = Double.toString(location.getLatitude());
		String lon1 = Double.toString(location.getLongitude());
		String towrite="geo:"+lat1+","+lon1; 
		//tv.setText(lat1+"\n"+lon1);
	
	 try{
		 URL url= new URL("http://testgt.hol.es/masterslave/master.php?data="+towrite);
		 //URL url= new URL("http://testgt.hol.es/masterslave/master.php?data="+towrite);
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

	public void signupfunction(View v)
	{
	}/*
		if(et1.getText().toString()==null || et2.getText().toString()==null || et3.getText().toString()==null)
		{
			//Toast.makeText(this, "Some or all of the fields are empty",Toast.LENGTH_SHORT).show();
			//tv2.setText("Some or all of the fields are empty");
			//return;
			
		}
	}
	/*	 try{
		        URL url= new URL("http://testgt.hol.es/masterslave/createaccount.php?data="+et1.getText().toString() + "*4" + et2.getText().toString()+ "*" +et3.getText().toString());
		        SAXParserFactory factory =SAXParserFactory.newInstance();
		        SAXParser parser=factory.newSAXParser();
		        XMLReader xmlreader=parser.getXMLReader();
		       // RssHandler theRSSHandler=new RssHandler();
		       // xmlreader.setContentHandler(theRSSHandler);
		        InputSource is=new InputSource(url.openStream());
		        xmlreader.parse(is);
		        tv2.setText("Request Successfully sent.  We will contact you in another 24 hours");
		        Toast.makeText(this, "Request Successfully sent.  We will contact you in another 24 hours",Toast.LENGTH_SHORT).show();
				
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
	}*/
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	String lat1,lon1;
	TextView tv;
	@Override
	public void onLocationChanged(Location location) 
		{
		 lat1 = Double.toString(location.getLatitude());
		 lon1 = Double.toString(location.getLatitude());
		 tv.setText("You just moved");
		}	

	@Override
	public void onProviderDisabled(String arg0) {
		// TODO Auto-generated method stub

		tv.setText("You just moved");
		}

	@Override
	public void onProviderEnabled(String arg0) {
		// TODO Auto-generated method stub

		tv.setText("You just moved");
		}

	@Override
	public void onStatusChanged(String arg0, int arg1, Bundle arg2) {
		// TODO Auto-generated method stub

		tv.setText("You just moved");
		}
}
