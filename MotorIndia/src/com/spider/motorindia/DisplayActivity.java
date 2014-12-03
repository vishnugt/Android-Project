package com.spider.motorindia;


import org.xmlpull.v1.XmlPullParser;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayActivity extends ActionBarActivity {

	int n=8;
	
	
	// test values 
	String[] head = {
		    "Growing markets will drive \n global CV industry \nprogress: Wissmann",
		      "Tata-DLT Market leader setting\n  new standards in Indian trailer industry",
		      "Bus, an attractive companion\n and CO2 champion",
		      "Meritor all set to power\n ahead in 2015",
		      "SAMIL eyeing pre-owned bus\n segment for business expansion",
		      "Caterpillar’s new 424B \n backhoe loader launched in Chennai",
		      "STFC continues strong run"
		  } ;
	
	String[] data = {
		    "Article1",
		      "Article2",
		      "Article3",
		      "New products development, the key growth driver\n\nAt the 2012 edition of Auto Expo, Meritor Commercial Vehicle India was out in full vigour, launching three new axles, much to the delight of its customers. The products delivering excellent field results were very well received in the market. But things soon took an adverse turn when the country’s commercial vehicle market entered one of its worst phases in its history – a slowdown which is yet to loosen its feverish grip on the industry. Meritor was quick to switch gears as it embarked upon a challenging journey with focus on sustained growth in the extremely tough market conditions which saw CV sales volumes fall by over 50 per cent. Similar to the raging bull in its logo, Meritor has managed to emerge strong from the vicious slowdown, courtesy an efficient overall management by its resolute workforce, spearheaded by Mr. N.P. Thimmaiah, Managing Director & CEO, Meritor India. We spoke to Mr. Thimmaiah to know more about Meritor’s strategy to buck the downtrend and what it has readied to offer the market in the foreseeable future."
		      +"Meritor India, operating as per an October to September financial year, expects to end the current year on a similar level to the last fiscal, though the latter was in itself a challenging one due to the sluggish market condition. However, buoyed by a change in the industry sentiment as a result of a positive general election outcome, Meritor anticipates a successful year ahead in 2015 when a slew of its new products will hit the market which, in turn, will receive more response than in the last couple of years."+
		      "Says Mr. Thimmaiah: “We will be ending the current year on similar levels as last year, though the market has dropped considerably. We have been able to maintain our share by focusing on certain key areas – increasing our penetration with our existing customers and introducing new products in the market, especially to fill up the gap in the product range. Our exports also grew significantly during this period. Overall, we feel we have hit the bottom and expect to see some growth after the turn of the year. Though the market sentiments are better, we will see the actual offtake only when projects for infrastructure development start, which is when people will go for new trucks. For us, Oct.’14 to Sept.’15 will be the real growth phase, and we look forward to it.”",
		      "Article5",
		      "Article6",
		      "Article7"
		  } ;

	  Integer[] imageId = {
	      R.drawable.article1,
	      R.drawable.article2,
	      R.drawable.article3,
	      R.drawable.article4,
	      R.drawable.article5,
	      R.drawable.article6,
	      R.drawable.article7
	  };
	  
	  TextView mRssFeed,heada,body;
	  private String finalUrl="http://www.motorindiaonline.in/feed/";
	  // our class handlexml
	  private HandleXML obj;
	  XmlPullParser p;
	  
	  
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display);
		String value = getIntent().getStringExtra("data");
		mRssFeed =(TextView)findViewById(R.id.textView1);
		//mRssFeed.setText("This is the "+value+"st Article");
		heada =(TextView)findViewById(R.id.textdisplay);
		body =(TextView)findViewById(R.id.textView2);
		body.setText(value);
		mRssFeed.setMovementMethod(new ScrollingMovementMethod());
		
		
		// Lets parse some xml page!! http://spider.nitt.edu/~adityap/resources/motorindia.xml
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.display, menu);
		return true;
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		int checkGooglePlayServices =    GooglePlayServicesUtil.isGooglePlayServicesAvailable(this);
	    if (checkGooglePlayServices != ConnectionResult.SUCCESS) { 
	        GooglePlayServicesUtil.getErrorDialog(checkGooglePlayServices, this, 1122).show();
	        
	    } else {
	        Toast.makeText(this, "Success!!! you have the latest google play services in your phone", Toast.LENGTH_LONG).show();
	    }
		
	}


	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	public void fetch(View view){
		TextView b =(TextView)findViewById(R.id.button1);
		b.setText("button clicked");
		
	      obj = new HandleXML(finalUrl, n);
	      
	      b.setText("start handler");
	      
	      obj.fetchXML();
	      
	      b.setText("start");
	      
	      while(obj.parsingComplete);
	      
	      b.setText("done");
	      
	      p=obj.getparse();
	      
	      
	      
	   }
	
	public void show(View v){

		obj.parseXMLAndStoreIt(p,n);
        body.setText(obj.getDescription());
        heada.setText(obj.getTitle());
        mRssFeed.setText(obj.getarticle());
        
        TextView t =(TextView)findViewById(R.id.button2);
        
     n++;
     String u = Integer.toString(n);
     t.setText(u);
	}
}

/*
public String getAndroidPitRssFeed(){
     InputStream in = null;
try{
        	// the location of the xml file, ie http://www.motorindiaonline.in/feed/ for now testing
            URL url = new URL("http://spider.nitt.edu/~adityap/resources/motorindia.xml");
            // get a handle in order to open a connection
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            // read bytes or arrays of bytes from the stream
            in = conn.getInputStream();
            // a handle to writing bytes or arrays of bytes to the stream
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            // a reference used while traversing
            byte[] buffer = new byte[1024];
            // read byte by byte
            for (int count; (count = in.read(buffer)) != -1; ) {
            	
                out.write(buffer, 0, count);
            }
            // write to the stream
            byte[] response = out.toByteArray();
            // get the rss feed as a string
            String rssFeed;
			try {
				rssFeed = new String(response, "UTF-8");
				return rssFeed;
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            return null;
            
        
}

private class GetAndroidPitRssFeedTask extends AsyncTask<Void, Void, String> {

    @Override
    protected String doInBackground(Void... voids) {
        String result = "";
        try {
            result = getAndroidPitRssFeed();
        	
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    protected void onPostExecute(String rssFeed) {
        mRssFeed.setText(rssFeed);
    }
}
*/

