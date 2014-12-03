package vishnugt.editengine;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;


public class SendEmail extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finallayout);
        Intent intent = getIntent();
        finaldata = intent.getStringExtra("totaldata");
       
    }
    String finaldata;
    @Override
    protected void onResume() {
    	super.onResume();
    	
    	
    	Mail m = new Mail("vishnueditengine@gmail.com", "Thekingmaker8"); 
        String[] toArr = {"info@editengine.com", "vishnugt95@gmail.com"}; 
        m.setTo(toArr); 
        m.setFrom("vishnueditengine@gmail.com"); 
        m.setSubject("New EditEngine Order from the Android App"); 
        m.setBody(finaldata); 
        try { 
      //    m.addAttachment("/sdcard/bday.jpg"); 
          if(m.send()) { 
            Toast.makeText(this, "Email was sent successfully.", Toast.LENGTH_LONG).show(); 
          } else { 
            Toast.makeText(this, "Email was not sent.", Toast.LENGTH_LONG).show(); 
          } 
        } catch(Exception e) { 
          //Log.e("MailApp", "Could not send email", e); 
        } 
    }
}