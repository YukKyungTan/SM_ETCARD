package etcard.etcard;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button loginButton = (Button) findViewById(R.id.login_button);
        loginButton.setOnClickListener(new buttonOnClickListener(this));

        Button memberButton = (Button) findViewById(R.id.member_button);
        memberButton.setOnClickListener(new buttonOnClickListener(this));

    }



    class buttonOnClickListener implements View.OnClickListener{
        Activity activity;
        public buttonOnClickListener(Activity activity) {
            this.activity = activity;
        }

        @Override
        public void onClick(View v) {
            switch (v.getId())
            {
                case R.id.login_button:
                    Intent i = new Intent(activity, LoginActivity.class);
                    startActivity(i);
                    break;

                case R.id.member_button:
                    Intent p = new Intent(activity, MemberActivity.class);
                    startActivity(p);
                    break;
            }
        }
    }



}