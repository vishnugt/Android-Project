package vishnugt.gpstracker;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import android.net.Uri;
import android.os.Bundle;
import android.os.StrictMode;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
		StrictMode.setThreadPolicy(policy); 
		final String uri=null; 
		new Thread(new Runnable() { 
	            public void run(){
	            	int a=0;
	    while(true)
	    {	
	    	URL url = null;
			try {
				url = new URL("http://10.1.77.186/spidertask4/data.php");
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
	    	String encoding = con.getContentEncoding();
	    	encoding = encoding == null ? "UTF-8" : encoding;
	    	ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    	byte[] buf = new byte[8192];
	    	int len = 0;
	    	try {
				while ((len = in.read(buf)) != -1) {
				    baos.write(buf, 0, len);
   }
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    String body = null;
		try {
			body = new String(baos.toByteArray(), encoding);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   // TextView tv=(TextView)findViewById(R.id.textView1);
	    //	tv.setText(body);	

	    	
    		startActivity(new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(body)));

	    }    		
	        		   		
	            }
	    }).start();
		startActivity(new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(uri)));
		  
	
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
