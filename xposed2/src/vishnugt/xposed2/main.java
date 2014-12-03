package vishnugt.xposed2;

import static de.robv.android.xposed.XposedHelpers.findAndHookMethod;
import android.widget.TextView;
import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam;

public class main implements IXposedHookLoadPackage {

 @Override
 public void handleLoadPackage(LoadPackageParam lpparam) throws Throwable {
  if (!lpparam.packageName.equals("com.android.systemui"))
            return;
  
   findAndHookMethod("com.android.systemui.statusbar.policy.Clock", lpparam.classLoader, "updateClock", new XC_MethodHook() {
            @Override
            protected void afterHookedMethod(MethodHookParam param) throws Throwable {
             TextView tv = (TextView) param.thisObject;
             tv.setText(tv.getText().toString() +"Uchiha Sauskue");
             
            }
 });
 }
}