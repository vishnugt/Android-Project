package vishnugt.quickserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {
	private InputStream OpenHttpConnection(String strURL)
            throws IOException {
        URLConnection conn = null;
        InputStream inputStream = null;
        URL url = new URL(strURL);
        conn = url.openConnection();
        HttpURLConnection httpConn = (HttpURLConnection) conn;
        httpConn.setRequestMethod("GET");
        httpConn.connect();
        if (httpConn.getResponseCode() == HttpURLConnection.HTTP_OK) {
            inputStream = httpConn.getInputStream();
        }
        return inputStream;
    }

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	    TextView content = (TextView)findViewById(R.id.textView1);

		 String data = null;try {
			content.setText(
			 OpenHttpConnection("http:\\google.com").toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	        content.setText("st");
	        

    
    String text = "";
    BufferedReader reader=null;

    // Send data 
  try
  { 
    content.setText("gonna connect" );
      // Defined URL  where to send data
      URL url = new URL("http://10.0.2.2/new/index.php?user_name=vishnugt");
       
   // Send POST data request

  URLConnection conn = url.openConnection(); 
 // conn.setDoOutput(true); 
 // OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream()); 
 // wr.write( data ); 
 // wr.flush(); 
content.setText("flushed");
    // Get the server response 
     
  reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
  StringBuilder sb = new StringBuilder();
  String line = null;
  
  // Read Server Response
  while((line = reader.readLine()) != null)
      {
             // Append server response in string
             sb.append(line + "\n");
      }
      
      
      text = sb.toString();
  }
  catch(Exception ex)
  {
       
  }
  finally
  {
      try
      {

          reader.close();
      }

      catch(Exception ex) {}
  }
  // Show response on activity
  content.setText( text  );
  
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
		 

}
}