package com.example.mohammedshafiullah.androiddemo;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LaunchScreenLogin_Activity extends AppCompatActivity implements View.OnClickListener {
    public static final String MyPREFERENCES = "launchScreenPreference" ;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_screen_login_);
        Button loginBtn = (Button) findViewById(R.id.launchScreenloginBT);
        loginBtn.setOnClickListener(this);


    }

    @Override
    public void onClick(View view)
    {
        SharedPreferences.Editor editor = getSharedPreferences(MyPREFERENCES, MODE_PRIVATE).edit();
        editor.putBoolean("loginkey", true);
        editor.commit();
        onBackPressed ();
    }
}
