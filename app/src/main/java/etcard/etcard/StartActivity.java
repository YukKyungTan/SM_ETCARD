package etcard.etcard;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Hong on 2017-03-22.
 */

public class StartActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);


        Thread background = new Thread() {
            public void run() {
                try {
                    sleep(2500);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    startActivity(new Intent(StartActivity.this, MainActivity.class));
                    finish();
                }
            }
        };
        background.start();
    }
}