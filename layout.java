/*Write an Android application program that demonstrates the following:
     		   (i) LinearLayout 
   		   (ii) RelativeLayout
  		   (iii) TableLayout
  		   (iv) GridView layout
*/

package cse.LL;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class LLActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button btn1=(Button) findViewById(R.id.LLbtn);
        Button btn2=(Button) findViewById(R.id.RLbtn);
        Button btn3=(Button) findViewById(R.id.TLbtn);
        Button btn4=(Button) findViewById(R.id.GLbtn);
        btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i1=new Intent(LLActivity.this,LL.class);
				startActivity(i1);
				
			}
		});
 btn2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i2=new Intent(LLActivity.this,RL.class);
				startActivity(i2);
		}
		});
 btn3.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent i3=new Intent(LLActivity.this,TL.class);
			startActivity(i3);
			
		}
	});
 btn4.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent i4=new Intent(LLActivity.this,GL.class);
			startActivity(i4);
			
		}
	});

        
    }
}
