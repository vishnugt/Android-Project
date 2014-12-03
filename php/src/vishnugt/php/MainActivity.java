package vishnugt.php;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

	TextView tv;
	String url1 = "http://10.0.2.2/new/index.php?name=pleasedear sometime it is luck0u";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		tv=(TextView) findViewById(R.id.textView1);
		Log.i("sometag", "somemsg");
		tv.setText("Created");		
		try{
			URL url = new URL(url1);
			HttpClient client = new DefaultHttpClient();
			HttpGet request = new HttpGet();
			request.setURI(new URI(url1));
			HttpResponse response = client.execute(request);
			BufferedReader in = new BufferedReader
			(new InputStreamReader (response.getEntity().getContent()));
			StringBuffer sb = new StringBuffer("");
	           String line="";
	           while ((line = in.readLine()) != null) {
	              sb.append(line);
	              break;
	            }
	            in.close();
	            
		  int bytesRead=0;
		  String strFileContents = null; 
//		  while( (bytesRead = is.read(contents)) != -1){ 
//		     strFileContents = new String(contents, 0, bytesRead);               
//		  }
		  
	//	  String str = strFileContents;
		String str= sb.toString();  
		  	//String resString = sb.toString();
          tv.setText(str);// Result is here
          Log.i("string letta", str);
		}
		catch(Exception e){

			Log.i("gt","please");
		}
		new ReadTask().execute(url1);
	}

	private class ReadTask extends AsyncTask<String, Integer, String> 
	{


		@Override
		protected String doInBackground(String... params) {
			  try {
				  URL url = new URL("http://10.0.2.2/new/index.php?name=vishnugt");
				  HttpURLConnection mUrlConnection = (HttpURLConnection) url.openConnection();
				  mUrlConnection.setDoInput(true);

				  InputStream is = new BufferedInputStream(mUrlConnection.getInputStream());

				  String str = is.toString();
				  	//String resString = sb.toString();
		            tv.setText(str);// Result is here
		            Log.i("string letta", str);

		          //  is.close(); // Close the stream
		        } 
		        catch (Exception e) {
		            Log.i("Risultato eccezione","Sorry VishnuGt");
		              //e.printStackTrace();
		        }

			
			return null;
		}   
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
