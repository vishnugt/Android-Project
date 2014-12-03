package vishnugt.editengine;

import java.io.IOException;
import java.net.URL;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity {

	int currentlayout;
	RadioButton radio1, radio2, radio3, radio4, radio5, radio6, radio7, radio8, radio9;
	RadioButton radio19, radio29,  radio39, radio49, radio59;
	Spinner dropdown;
	String[] items = new String[]{};
	String selectedoption;
	String maildatatoserver;
	EditText nameet, mailet, contactet, pageet, wordet;
	String[] items1= new String[]{"College Admission Essays", "Grad School Applications", "B.Tech/M.Tech Dissertations/Theses", "College Essays", "Research Papers", "Resume", "Scholarship Applications", "Articles", "Books", "Technical Reports", "PowerPoint Presentations", "Class Assignments", "Cover Letters", "Statement of purpose", "Letter of Recommendation"};
	String[] items2= new String[]{"Editing Nonfiction", "Essay Editing", "Journalism Editing", "Editing Memoirs", "Manuscript Editing", "Editing Query Letters", "Portfolio Editing", "Article Editing", "Fiction Editing"};
	String[] items3= new String[]{"Advertorials and Advertisement Editing", "Annual Report Editing", "Proofreading Brochures", "Business Letter Editing", "Business Plan Editing", "Editing Marketing Materials", "Proofreading PowerPoint Presentations", "Press Release Editing", "Editing Training Manuals and Guides", "Web Copy Editing"};
	String[] items4= new String[]{"Editing Abstracts and Conference Papers", "Dissertation Editing", "Editing Grant Proposals", "Academic Article Proofreading", "Lectures/Slides Proofreading", "Textbook Editing"};
	
	@Override
	public void onBackPressed() 
	{
		if(currentlayout==1)
			setContentView(R.layout.activity_main);
		
			
	}
	
	

	public void rb21func(View v)
	{
		
		//if(radio6.isChecked())radio6.setChecked(false);
		//if(radio7.isChecked())radio7.setChecked(false);
	}
	public void rb22func(View v)
	{
		if(radio5.isChecked())radio5.setChecked(false);
		if(radio7.isChecked())radio7.setChecked(false);
	}
	public void rb23func(View v)
	{
		if(radio6.isChecked())radio6.setChecked(false);
		if(radio5.isChecked())radio5.setChecked(false);
	}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		currentlayout = 0;
		radio1 = (RadioButton)findViewById(R.id.radioButton1);
		radio2 = (RadioButton)findViewById(R.id.radioButton2);
		radio3 = (RadioButton)findViewById(R.id.radioButton3);
		radio4 = (RadioButton)findViewById(R.id.radioButton4);
		
		dropdown = (Spinner)findViewById(R.id.spinner1);
		nameet = (EditText)findViewById(R.id.editText1);
		mailet = (EditText)findViewById(R.id.editText2);
		contactet = (EditText)findViewById(R.id.editText3);
		pageet = (EditText)findViewById(R.id.editText4);
		wordet = (EditText)findViewById(R.id.editText5);

      
	}
	
	public void btnfunction(View v)
	{
		if(nameet.getText().toString().matches("") || mailet.getText().toString().matches("") || contactet.getText().toString().matches("") || pageet.getText().toString().matches("") || wordet.getText().toString().matches("") )
		{
			Toast.makeText(getApplicationContext(), "Some of the fields are incomplete.  Make sure to fill all the fields.", Toast.LENGTH_SHORT).show();
			return ;
			
		}
				
		
		maildatatoserver = "Name  : " +nameet.getText().toString() +"\n\n Mail Id :" + mailet.getText().toString() +"\n\nContact No :"+ contactet.getText().toString() +"\n\nWork Description :"+ selectedoption + "\n\n No.of Pages :"+ pageet.getText().toString() +"\n\n No. of words :" +wordet.getText().toString(); 
    	Intent myIntent = new Intent(MainActivity.this, SecondActivity.class);
    	myIntent.putExtra("maildata", maildatatoserver); 
    //	myIntent.putExtra("fontsize",String.valueOf(np.getValue()));
    	//myIntent.putExtra("colors", setcolor);
    	//myIntent.putExtra("fontchosen", chosenfont);
    	MainActivity.this.startActivity(myIntent);
	}
	
		
	
	public void rb1func(View v)
	{
		if(radio2.isChecked())radio2.setChecked(false);
		if(radio3.isChecked())radio3.setChecked(false);
		if(radio4.isChecked())radio4.setChecked(false);
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, items1);
        dropdown.setAdapter(adapter);
        items = items1;
        
	}
	
	public void rb2func(View v)
	{
		if(radio1.isChecked())radio1.setChecked(false);
		if(radio3.isChecked())radio3.setChecked(false);
		if(radio4.isChecked())radio4.setChecked(false);
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, items2);
        dropdown.setAdapter(adapter);
        items = items2;
	}
	
	public void rb3func(View v)
	{
		if(radio2.isChecked())radio2.setChecked(false);
		if(radio1.isChecked())radio1.setChecked(false);
		if(radio4.isChecked())radio4.setChecked(false);
	
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, items3);
        dropdown.setAdapter(adapter);
        items = items3;
	}
	
	public void rb4func(View v)
	{
		if(radio2.isChecked())radio2.setChecked(false);
		if(radio3.isChecked())radio3.setChecked(false);
		if(radio1.isChecked())radio1.setChecked(false);
	
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, items4);
        dropdown.setAdapter(adapter);
        items = items4;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
		
	}

	public void onItemSelected(AdapterView<?> parent, View v, int position, long id) 
    {
    	selectedoption = items[position];
    }

}
