package vishnugt.deltatask1;



import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

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
    public void function(View v)
    {

        char swapvariable;
        char[] helloworld = new char[] { 'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd','!' };
        for (int i = 0; i < 5; i++)
        {
            int randomNumber = 0 + (int)(Math.random() * ((6  - 0) + 1));
            int secondrandom = 6 + (int)(Math.random() * ((11 - 6) + 1));
            swapvariable = helloworld[randomNumber];
            helloworld[randomNumber] = helloworld[secondrandom];
            helloworld[secondrandom] = swapvariable;

        }
        String text = String.valueOf(helloworld);
        TextView textview = (TextView) findViewById(R.id.textView2);
        textview.setText(text);
    
    }
    
}
