package vishnugt.foucs;

import java.util.Collections;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		PackageManager packageManager = getPackageManager();
		Intent mainIntent = new Intent(Intent.ACTION_MAIN, null);
		mainIntent.addCategory(Intent.CATEGORY_LAUNCHER);
		List<ResolveInfo> appList = packageManager.queryIntentActivities(mainIntent, 0);
		Collections.sort(appList, new ResolveInfo.DisplayNameComparator(packageManager));
		List<PackageInfo> packs = packageManager.getInstalledPackages(0);
		for(int i=0; i < packs.size(); i++) {
		PackageInfo p = packs.get(i);
		ApplicationInfo a = p.applicationInfo;
		// skip system apps if they shall not be included
		//apps.add(p.packageName);
		TextView tv = (TextView) findViewById(R.id.textView1);
		tv.append(p.packageName + "\n");
		}
	}

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
