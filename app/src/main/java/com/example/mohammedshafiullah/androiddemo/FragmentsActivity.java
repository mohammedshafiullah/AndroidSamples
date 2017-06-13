package com.example.mohammedshafiullah.androiddemo;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FragmentsActivity extends AppCompatActivity implements View.OnClickListener {


    FragmentManager fm;
    FragmentTransaction ft;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragments);

        SwitchFragments switchFragments = new SwitchFragments();
        getFragmentManager().beginTransaction().replace(R.id.container_framelayout, switchFragments).commit();


    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId()) {
            case R.id.aFragment:
                SwitchFragments switchFragments = new SwitchFragments();
                getFragmentManager().beginTransaction().replace(R.id.container_framelayout, switchFragments).addToBackStack(null).commit();


                break;

            case R.id.bFragment:
                SwitchFragment2 switchFragment2 =  new SwitchFragment2 ();
                getFragmentManager().beginTransaction().replace(R.id.container_framelayout, switchFragment2).addToBackStack(null).commit();

                break;
        }
    }
}
