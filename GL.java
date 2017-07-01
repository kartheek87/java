
//GL.java:
package cse.LL;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class GL extends Activity{
	static final String[] numbers = new String[] { 
		"1", "2", "3", "4", "5",
		"6", "7", "8", "9", "*",
		"0", "#"};

	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gl);
		GridView gridView=(GridView) findViewById(R.id.gridView1);
	     
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, numbers);
 
		gridView.setAdapter(adapter);
		
		gridView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(),
	    				((TextView) arg1).getText(), Toast.LENGTH_SHORT).show();
				
			}
		});
		
		
 

	}

}
