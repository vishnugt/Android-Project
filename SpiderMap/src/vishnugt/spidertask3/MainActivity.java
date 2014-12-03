package vishnugt.spidertask3;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends Activity {
	


	RadioButton radio1 = (RadioButton)findViewById(R.id.radioButton1);
	RadioButton radio2 = (RadioButton)findViewById(R.id.radioButton2);
	RadioButton radio3 = (RadioButton)findViewById(R.id.radioButton3);
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void first(View v){
		if(radio2.isChecked()) radio2.setChecked(false);
		if(radio3.isChecked()) radio3.setChecked(false);
	}
	
	public void second(View v){
		if(radio1.isChecked()) radio1.setChecked(false);
		if(radio3.isChecked()) radio3.setChecked(false);
	}
	
	public void third(View v){
		if(radio2.isChecked()) radio2.setChecked(false);
		if(radio1.isChecked()) radio1.setChecked(false);
	}
	
	public void mainfunc(View v){
		
		if(radio1.isChecked())
		{
			setContentView(R.layout.latitude);
		}
	}
}
