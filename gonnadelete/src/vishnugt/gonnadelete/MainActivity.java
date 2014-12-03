package vishnugt.gonnadelete;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {

	private TextView textTimer;
	private Button startButton;
	private Button pauseButton;
	private Button reset;
	private Handler myHandler = new Handler();
	long startTime = 0L;
	long time = 0L; 
	long timeSwap = 0L;
	long finalTime = 0L;
	List<String> tl= new ArrayList<String>();
	ListView l;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textTimer=(TextView) findViewById(R.id.textView1);
        startButton = (Button) findViewById(R.id.button1);
          l=(ListView) findViewById(R.id.listView1);       
        startButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				startTime = System.currentTimeMillis();
				myHandler.postDelayed(updateTimerMethod, 0); 
		}
		});
        
    	pauseButton = (Button) findViewById(R.id.button2);
    	pauseButton.setOnClickListener(new View.OnClickListener() {
    	public void onClick(View view) {
    	timeSwap += time;
    	myHandler.removeCallbacks(updateTimerMethod);

    	}
    	});
    	
    	reset= (Button) findViewById(R.id.button3);
    	reset.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				tl.add(textTimer.getText().toString());
				myHandler.removeCallbacks(updateTimerMethod);
				 startTime = 0L;
				 time = 0L; 
				 timeSwap = 0L;
				 finalTime = 0L;
				 textTimer.setText("0:00:000");

				 l.setAdapter(new myAdapter (MainActivity.this, android.R.layout.simple_dropdown_item_1line, R.id.textView1, tl));

			}
		});
    	
  
       
    }
    private Runnable updateTimerMethod = new Runnable() {

    	public void run() {
    	time = System.currentTimeMillis()-startTime;
    	finalTime = timeSwap + time;
    	int seconds = (int) (finalTime / 1000);
    	int minutes = seconds / 60;
    	seconds = seconds % 60;
    	int milliseconds = (int) (finalTime % 1000);
    	textTimer.setText(""+ minutes + ":"+ String.format("%02d", seconds) + ":"+ String.format("%03d", milliseconds));
    	myHandler.postDelayed(this, 0);
    	}

    	};

    	public class myAdapter extends ArrayAdapter<String>{

    		public myAdapter(Context context, int resource, int textViewResourceId, List<String> objects) {
    			super(context, resource, textViewResourceId, objects);
    			
    		}
    		
    		@Override
    		public View getView(int position, View convertView, ViewGroup parent) {
    			LayoutInflater  inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    			View row = inflater.inflate(R.layout.second, parent, false);
    			
    			ImageView iv = (ImageView) row.findViewById(R.id.imageView1);
    			TextView tv1 = (TextView) row.findViewById(R.id.textView1);
    			
    			if(position<tl.size()){
    				tv1.setText(tl.get(position));
    			}
    			
    			return row;
    		}
    	}
    	public boolean onCreateOptionsMenu(Menu menu) {
    		// Inflate the menu; this adds items to the action bar if it is present.
    		getMenuInflater().inflate(R.menu.main, menu);
    		return true;
    	}
}
