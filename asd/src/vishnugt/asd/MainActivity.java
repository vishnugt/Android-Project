package vishnugt.asd;

import java.io.IOException;
import java.net.URL;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
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
try{
        URL url= new URL("http://10.1.80.97/spidertask4/master.php?data=vishnu");
        SAXParserFactory factory =SAXParserFactory.newInstance();
        SAXParser parser=factory.newSAXParser();
        XMLReader xmlreader=parser.getXMLReader();
       // RssHandler theRSSHandler=new RssHandler();
       // xmlreader.setContentHandler(theRSSHandler);
        InputSource is=new InputSource(url.openStream());
        xmlreader.parse(is);
} catch (SAXException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (ParserConfigurationException e){
	// TODO Auto-generated catch block
	e.printStackTrace();
}return;}

	public void func(View v)
	{
		TextView tv = (TextView) findViewById(R.id.textView1);
		tv.setText("Vishnu");
		Log.i("hi", "1");
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
