//Write an Android application program that accepts a name from the user and displays the hello name to the user in response as output using Eclipse.

package cse.wk11;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Wk11Activity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        TextView tv1=(TextView) findViewById(R.id.tv1);
        TextView tv2=(TextView) findViewById(R.id.tv2);
        final TextView tv3=(TextView) findViewById(R.id.tv3);
        final EditText et=(EditText) findViewById(R.id.et1);
        Button btn=(Button) findViewById(R.id.btn);
        btn.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String s1=et.getText().toString();
				tv3.setText("Hello "+s1);
				
			}
		});
        
    }
}



