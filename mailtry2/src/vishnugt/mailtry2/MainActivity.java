package vishnugt.mailtry2;

import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
		StrictMode.setThreadPolicy(policy); 

		 try {   
             GMailSender sender = new GMailSender("vishnugt95@gmail.com", "A1a1abcd");
             sender.sendMail("This is Subject",   
                     "This is Body",   
                     "vishnugt@hotmail.com",   
                     "vishnugt95@gmail.com");   
         } catch (Exception e) {   
             Log.e("SendMail", e.getMessage(), e);   
         }
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	public void buttonfunc(View v)
	{
		  try {   
              GMailSender sender = new GMailSender("vishnugt95@gmail.com", "A1a1abcd");
              sender.sendMail("This is Subject",   
                      "This is Body",   
                      "vishnugt@hotmail.com",   
                      "vishnugt95@gmail.com");   
          } catch (Exception e) {   
              Log.e("SendMail", e.getMessage(), e);   
          } 
	}

}
