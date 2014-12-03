package vishnugt.hemanthtry;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

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
	
	

    public void asdf(View view){
        new LongOperation().execute("");
    }

    private class LongOperation extends AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... params) {
          
                try {
            //        Thread.sleep(1000);

            		URL url = new URL("http://10.1.76.11/spidertask4/data.php");
            		//URL url = new URL("http://webmail.nitt.edu/horde/login.php");
            		//URL url = new URL("http://app-5at6xy0py7z897ut.apprun1.codenvycorp.com/data.php");
            		//URL url = new URL("http://testgt.hol.es/masterslave/data.php");
            		URLConnection con = url.openConnection();
            			InputStream in = con.getInputStream();
            			String encoding = con.getContentEncoding();
            			encoding = encoding == null ? "UTF-8" : encoding;
            			ByteArrayOutputStream baos = new ByteArrayOutputStream();
            			byte[] buf = new byte[8192];
            			int len = 0;
            			while ((len = in.read(buf)) != -1)
            			{
            				baos.write(buf, 0, len);
            			}
            			
            	 	body = new String(baos.toByteArray(), encoding);
            	        } catch (MalformedURLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            
            return null;
        }
        int id;
String body;
JSONObject jObject;
        @Override
        protected void onPostExecute(String result) {

            TextView txt = (TextView) findViewById(R.id.output);
            txt.setText(body);
        }

        @Override
        protected void onPreExecute() {
        }

        @Override
        protected void onProgressUpdate(Void... values) {
        }
    }

}
