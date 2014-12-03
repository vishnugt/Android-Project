package vishnu.spider.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import android.os.AsyncTask;
import android.util.Log;

public class Retrivejson extends AsyncTask {

	@Override
	protected Object doInBackground(Object... arg0) {
		Log.i("debug", "one");
		HttpClient client = new DefaultHttpClient();
		Log.i("debug", "one");
	    HttpGet httpGet = new HttpGet("http://192.168.43.248/motorindia/");
	    Log.i("debug", "one");
		// Depends on your web service
		//httpGet.setHeader("Content-type", "application/json");

		StringBuilder builder = new StringBuilder();
		Log.i("debug", "one");
		    try {
		        HttpResponse response = client.execute(httpGet);
		        Log.i("debug", "one");
		        StatusLine statusLine = response.getStatusLine();
		        Log.i("debug", "one");
		        int statusCode = statusLine.getStatusCode();
		        Log.i("debug", "one");
		        if (statusCode == 200) {
		          HttpEntity entity = response.getEntity();
		          InputStream content = entity.getContent();
		          BufferedReader reader = new BufferedReader(new InputStreamReader(content));
		          String line;
		          while ((line = reader.readLine()) != null) {
		            builder.append(line);
		          }
		        } else {
		          Log.e("AHH", "Failed to download file");
		        }
		      } catch (ClientProtocolException e) {
		        e.printStackTrace();
		      } catch (IOException e) {
		        e.printStackTrace();
		      }
		    
		Log.i("debug", builder.toString()+"fazdfz");
		
		//
		//now we have the json
		/*
		Log.i("debug", "one");
			JSONArray jArray;
			try {
				Log.i("debug", "two");
				jArray = new JSONArray(result);
				Log.i("debug", "three");
				String aJsonString = jArray.toString();
				Log.i("debug", "four");
				Toast.makeText(getActivity(), aJsonString, Toast.LENGTH_LONG)
				.show();
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//TextView t = (TextView)findViewById(R.id.section_label);
			//t.setText(aJsonString);
			
		*/
		return builder.toString();
		
	}

}
