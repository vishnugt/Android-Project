
package vishnugt.hemanthtry;


import java.util.Set;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity
{
@Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        
        
        final BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        if (mBluetoothAdapter == null) {
        // Device does not support Bluetooth
        	//code by vishnugt
        }



	if (!mBluetoothAdapter.isEnabled()) {
		Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);	
		startActivityForResult(enableBtIntent, 1);
		}
	
	
	Set<BluetoothDevice> pairedDevices = mBluetoothAdapter.getBondedDevices();
	if (pairedDevices.size() > 0) {
	for (BluetoothDevice device : pairedDevices) {
		
	BluetoothDevice mDevice = device;
	if(mDevice.getName()=="Aditya's Nexus 4"){
	Toast.makeText(this, mDevice.getName(), Toast.LENGTH_SHORT).show();
	}}
	}
	
    }


}