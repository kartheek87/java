// Write an Android application program that displays Hello World using Eclipse

HellowordActivity.java:

package example.Helloword;
import android.app.Activity;
import android.os.Bundle;

public class HellowordActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}
