package vishnugt.whatsapptry;

import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

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
	
	public void sendWhatsAppMessageTo(View view) {

		Cursor c = this.getContentResolver().query(ContactsContract.Data.CONTENT_URI,
		        new String[] { ContactsContract.Contacts.Data._ID }, ContactsContract.Data.DATA1 + "=?",
		        new String[] { "918870755304@s.whatsapp.net" }, null);
		c.moveToFirst();

		Intent whatsapp = new Intent(Intent.ACTION_SENDTO, Uri.parse("content://com.android.contacts/data/" + c.getString(0)));
		c.close();

		 if (whatsapp != null) {

		startActivity(whatsapp);      

		} 

		}

}
