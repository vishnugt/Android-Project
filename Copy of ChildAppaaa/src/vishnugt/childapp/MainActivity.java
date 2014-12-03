package vishnugt.childapp;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;

import android.app.Activity;
import android.location.Location;
import android.location.LocationListener;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.Menu;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements LocationListener{

EditText et1, et2, et3;
TextView tv2, display;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
	
		    new AsyncTask<Void, Void, String>() {
		        @Override
		        protected String doInBackground(Void... params) {
		            BufferedReader reader = null;
		            try {
		                String url = "http://10.0.2.2/posttry1.php";
		                DefaultHttpClient httpClient = new DefaultHttpClient();
		                HttpPost httpPost = new HttpPost(url);
		               
		                List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(2);
		                nameValuePairs.add(new BasicNameValuePair("data", "android ji"));
		               	httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
		        		
		                HttpResponse httpResponse = httpClient.execute(httpPost);
		                HttpEntity httpEntity = httpResponse.getEntity();
		                InputStream is = httpEntity.getContent();
		                reader = new BufferedReader(new InputStreamReader(is));

		                StringBuilder total = new StringBuilder();
		                String line;
		                while ((line = reader.readLine()) != null) {
		                    total.append(line);
		                }
		                return total.toString();

		            } catch (ClientProtocolException ex) {
		                Log.e("LOG_TAG", null, ex);
		            } catch (IOException ex) {
		                Log.e("LOG_TAG", null, ex);
		            } finally {
		                if (reader != null) {
		                    try {
		                        reader.close();
		                    } catch (IOException ex) {
		                    }
		                }
		            }
		            return null;
		        }

		        protected void onPostExecute(String result) {
		            if (result == null) {
		                Log.d("LOG_TAG", "Result is null");
		            } else {
		                Log.d("LOG_TAG", "Result size: " + result.length());
		                Log.d("LOG_TAG", result);
		            }

		        };
		    }.execute();

	/*
		
		StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
		StrictMode.setThreadPolicy(policy); 
		 
		
		HttpClient httpclient = new DefaultHttpClient();
	    HttpPost httppost = new HttpPost("10.0.2.2/posttry1.php");
	    List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(2);
        nameValuePairs.add(new BasicNameValuePair("data", "android ji"));
        try {
			httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs,HTTP.UTF_8));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			httpclient.execute(httppost);
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
      */  
		/*    try {
		        // Add your data
		      //  nameValuePairs.add(new BasicNameValuePair("stringdata", "AndDev is Cool!"));
		        //httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
		        //httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs,HTTP.UTF_8));
		        // Execute HTTP Post Request
		       // HttpResponse response = httpclient.execute(httppost);
		        
		    } catch (ClientProtocolException e) {
		        // TODO Auto-generated catch block
		    } catch (IOException e) {
		        // TODO Auto-generated catch block
		    }*/
	}
	public void somefunc(){
	{
		StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
		StrictMode.setThreadPolicy(policy); 

		//tv=(TextView)findViewById(R.id.textView1);
		//et1=(EditText)findViewById(R.id.editText1);
		//et2=(EditText)findViewById(R.id.editText2);
		//et3=(EditText)findViewById(R.id.editText3);

		tv2=(TextView)findViewById(R.id.textView5);
		display=(TextView)findViewById(R.id.textView6);
		//LocationManager lam = (LocationManager)getSystemService(Context.LOCATION_SERVICE); 
		//Location location = lam.getLastKnownLocation(LocationManager.GPS_PROVIDER);
	
		//String lat1 = Double.toString(location.getLatitude());
//		String lon1 = Double.toString(location.getLongitude());
	//	String towrite="geo:"+lat1+","+lon1; 
		//tv.setText(lat1+"\n"+lon1);
	
		URL url = null;
		try {
			url = new URL("http://app-bz7nixxltnsxh779.apprun0.codenvycorp.com/index.php?a1=adityabalaji02@gmail.com&a2=bernoulli");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//URL url = new URL("http://testgt.hol.es/masterslave/data.php");
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
				while ((len = in.read(buf)) != -1)
				{
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
			display.setText(body);
	}
	}
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
