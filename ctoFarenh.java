// Write an Android application program that converts the temperature in Celsius to Fahrenheit. 

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Wk13Activity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        TextView tv1=(TextView) findViewById(R.id.tv1);
        TextView tv2=(TextView) findViewById(R.id.tv2);
        TextView tv3=(TextView) findViewById(R.id.tv3);
        final TextView tv4=(TextView) findViewById(R.id.tv4);
        final EditText et=(EditText) findViewById(R.id.et);
        Button btn=(Button) findViewById(R.id.btn);
        btn.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String s1=et.getText().toString();
				int cel=Integer.parseInt(s1);
				float faren=(float) ((cel*1.8)+32);
				String res=Float.toString(faren);
				tv4.setText("Temperature in Fahrenheit is "+res);
				
			}
		});
    }
}
