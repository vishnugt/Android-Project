package vishnugt.parentapp;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	HttpClient hc=new DefaultHttpClient();
	HttpPost hp=new HttpPost("http://facebook.com");
	EditText username, tempedit;
	TextView tv;
	TextView error;
	EditText password;
	List<NameValuePair> namevaluepair=new ArrayList<NameValuePair>(2);
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initialize();
		
	}

	public void initialize()
	{
		tempedit=(EditText)findViewById(R.id.editText2);
		tv=(TextView) findViewById(R.id.textView2);
		username = (EditText)findViewById(R.id.textbox);
		password = (EditText)findViewById(R.id.editText1);
		error = (TextView)findViewById(R.id.textView4);
		StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
		StrictMode.setThreadPolicy(policy); 
		
		namevaluepair.add(new BasicNameValuePair("email","vishnugt@hotmail.com"));
		namevaluepair.add(new BasicNameValuePair("pass","aaa"));
		//namevaluepair.add(new BasicNameValuePair("horde_select_view	","Basic"));
		
		try {
			hp.setEntity(new UrlEncodedFormEntity(namevaluepair));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		putdatainsite();
		
	}
	
	public void putdatainsite()
	{
		try {
			HttpResponse r=hc.execute(hp);
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void tempfunction() throws IOException
	{
		
		URL url = new URL("http://facebook.com");
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
			tv.setText(body);
			tempedit.setText(body);
			String label = "Your friend is here";
			String uriBegin = body;
			String query = "" + "(" + label + ")";
			String encodedQuery = Uri.encode( query  );
			String uriString = uriBegin + "?q=" + encodedQuery + "&z=22";
			Uri uri = Uri.parse( uriString );
		//	Intent intent = new Intent(android.content.Intent.ACTION_VIEW, uri );
			//startActivity( intent );
			//startActivity(new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(body)));
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	
	

	}

	String body="trash";
	int flag=0;
	public int accountverification()
	{
		if(password.getText().toString()==null)
		return 0;
		return 1;
	}
	public void monitorfunc(View v)throws IOException, InterruptedException
	{
		if(accountverification()==0)
		{
			error.setText("Sorry, your child's app is not registered");
		}
		else
		{
			tempfunction();
		}
	
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
