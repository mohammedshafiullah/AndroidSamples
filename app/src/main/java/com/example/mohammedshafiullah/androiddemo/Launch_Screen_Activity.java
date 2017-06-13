package com.example.mohammedshafiullah.androiddemo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Launch_Screen_Activity extends AppCompatActivity  {


    // Splash screen timer
    private static int SPLASH_TIME_OUT = 2000;
    Boolean isloginOrNot;
    public static final String MyPREFERENCES = "launchScreenPreference" ;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch__screen_);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity

                SharedPreferences prefs = getSharedPreferences(MyPREFERENCES, MODE_PRIVATE);
                isloginOrNot = prefs.getBoolean("loginkey", false);

                if(!isloginOrNot) {

                    Intent launchScreenLogin_Activity_intent = new Intent(Launch_Screen_Activity.this, LaunchScreenLogin_Activity.class);
                    startActivity(launchScreenLogin_Activity_intent);
                    finish();

                }
                else
                {
                    Intent launchScreenLogout_Activity_intent = new Intent(Launch_Screen_Activity.this, LaunchScreenLogoutActivity.class);
                    startActivity(launchScreenLogout_Activity_intent);
                    finish();

                }
                // close this activity

            }
        }, SPLASH_TIME_OUT);
    }


}
