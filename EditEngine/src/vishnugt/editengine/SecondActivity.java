package vishnugt.editengine;

import java.io.IOException;
import java.net.URL;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import vishnugt.editengine.Mail;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class SecondActivity extends Activity {

	String value;
	String selected1, selected2;
	int presentlayout;
	EditText specialinstruct;
	RadioButton radio19, radio29, radio39, radio49, radio59;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		Intent intent = getIntent();
		value = intent.getStringExtra("maildata");
        

		radio19 = (RadioButton)findViewById(R.id.radioButton19);
		radio29 = (RadioButton)findViewById(R.id.radioButton29);
		radio39 = (RadioButton)findViewById(R.id.radioButton39);
		radio49 = (RadioButton)findViewById(R.id.radioButton49);
		radio59 = (RadioButton)findViewById(R.id.radioButton59);
		presentlayout=0;
		specialinstruct = (EditText)findViewById(R.id.editText11);

		StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
		StrictMode.setThreadPolicy(policy); 
	}
	public void stdlayout(View v)
	{

		presentlayout=1;
		setContentView(R.layout.standardlayout);
	}
	public void prelayout(View v)
	{
		presentlayout=1;
		setContentView(R.layout.premiumlayout);
		
	}
	public void advlayout(View v)
	{
		presentlayout=1;
		setContentView(R.layout.advancedlayout);
	}
	public void onBackPressed() 
	{
		if(presentlayout==1)
		{
			setContentView(R.layout.second);
			presentlayout=0;
		}
			else
		{
			Intent backIntent = new Intent(SecondActivity.this, MainActivity.class);
			SecondActivity.this.startActivity(backIntent);
		}
		
			
	}
	public void submitfunc(View v)
	{
		if(!radio19.isChecked() && !radio29.isChecked() && !radio39.isChecked())
		{
			Toast.makeText(getApplicationContext(), "Some of the fields are incomplete.  Make sure to fill all the fields.", Toast.LENGTH_SHORT).show();
			return;
		}
		if(!radio49.isChecked() && !radio59.isChecked())
		{
			Toast.makeText(getApplicationContext(), "Some of the fields are incomplete.  Make sure to fill all the fields.", Toast.LENGTH_SHORT).show();
			return;
		}
		String finalvalue = value  +"\n\n" + selected1+"\n\n"+selected2+"\n\n Special Instructions :" + specialinstruct.getText().toString();

	//	sendmail(finalvalue);//use this 
//		writedata(finaldata);//use this if u want to store the data as in php....the code is below
  Intent myIntent = new Intent(SecondActivity.this, SendEmail.class);
  	myIntent.putExtra("totaldata", finalvalue);
  SecondActivity.this.startActivity(myIntent);
		//setContentView(R.layout.finallayout);
		
	}
	public void radio19func(View v)
	{
		selected1 = "Standard Editing Service";
	//	Log.e("GT", "onCreate called");
		if(radio29.isChecked())radio29.setChecked(false);
		if(radio39.isChecked())radio39.setChecked(false);
		//setContentView(R.layout.standardlayout);
		
	}
	public void radio29func(View v)
	{
		selected1 = "Premium Editing Service";
		//Log.e("GT", "onCreate called");
		if(radio19.isChecked())radio19.setChecked(false);
		if(radio39.isChecked())radio39.setChecked(false);
		
	}
	public void radio39func(View v)
	{
		selected1="Advanced Editing Service";
	//	Log.e("GT", "onCreate called");
		if(radio29.isChecked())radio29.setChecked(false);
		if(radio19.isChecked())radio19.setChecked(false);
		
	}
	public void radio49func(View v)
	{
		selected2="Turn Around Time : Normal";
	//	Log.e("GT", "onCreate called");
		if(radio59.isChecked())radio59.setChecked(false);
		
	}
	public void radio59func(View v)
	{
		selected2="Turn Around Time  : Express";
	//	Log.e("GT", "onCreate called");
		if(radio49.isChecked())radio49.setChecked(false);
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second, menu);
		return true;
	}

	
	public void writedata(String dataabc)
	{
		try{
	        URL url= new URL("http://10.0.2.2/spidertask4/master.php?data="+ dataabc);
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


}
