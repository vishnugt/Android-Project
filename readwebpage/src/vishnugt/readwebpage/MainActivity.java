package vishnugt.readwebpage;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
		StrictMode.setThreadPolicy(policy); 
	}
public void vishnu(View v) throws IOException
	{
	URL url = new URL("http://10.1.77.186/spidertask4/data.php");
	URLConnection con = url.openConnection();
	InputStream in = con.getInputStream();
	String encoding = con.getContentEncoding();
	encoding = encoding == null ? "UTF-8" : encoding;
	ByteArrayOutputStream baos = new ByteArrayOutputStream();
	byte[] buf = new byte[8192];
	int len = 0;
	while ((len = in.read(buf)) != -1) {
	    baos.write(buf, 0, len);
}
String body = new String(baos.toByteArray(), encoding);
TextView tv=(TextView)findViewById(R.id.textView1);
	tv.setText(body);	
	}
	public void visahnu(View v) throws IOException
	{
		URL url= new URL("http://10.0.2.2/spidertask4/master.php?data=vishnu");
		InputStream is = new URL("http://10.1.77.186/spidertask4/data.php").openStream();
		InputStreamReader isr = new InputStreamReader(is);
		StringBuilder sb=new StringBuilder();
		BufferedReader br = new BufferedReader(isr);
		String read = br.readLine();

		while(read != null) {
		    //System.out.println(read);
		    sb.append(read);
		    read =br.readLine();

		}
		
		TextView tv=(TextView)findViewById(R.id.textView1);


	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
