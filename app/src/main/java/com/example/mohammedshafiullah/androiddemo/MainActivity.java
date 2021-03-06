package com.example.mohammedshafiullah.androiddemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{




    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button registrationBut = (Button) findViewById(R.id.registration_form);
        registrationBut.setOnClickListener(this);


    }

    @Override
    public void onClick(View view)
    {

        switch (view.getId())
              //  asfdhasfdhfdfsdfds
        {
            case R.id.registration_form:

                Intent intent = new Intent(this,RegistrationActivity.class);
                startActivity(intent);
                break;
            case R.id.delete_listView:
                Intent intent1 = new Intent(this,DeletelistView.class);
                startActivity(intent1);
                break;
            case R.id.shared_Preference:
                Intent shared_Preference_intent = new Intent(this,Shared_Preference_Activity.class);
                startActivity(shared_Preference_intent);
                break;

            case R.id.Launch_screen:
                Intent Launch_screen_intent = new Intent(this,Launch_Screen_Activity.class);
                startActivity(Launch_screen_intent);
                break;
            case  R.id.dialog :
                Intent dialog_screen_intent = new Intent(this , Dialogs_Activity.class);
                startActivity(dialog_screen_intent);
                break;

            case  R.id.multipleListViews :
                Intent multiplelistview_intent = new Intent(this , MultipleListViews.class);
                startActivity(multiplelistview_intent);
                break;


            case  R.id.fragmentsButton :
                Intent fragments_screen_intents = new Intent(this , FragmentsActivity.class);
                startActivity(fragments_screen_intents);
                break;

            case  R.id.viewPagerButton :
                Intent viewPager_intents = new Intent(this , ViewPagerActivity.class);
                startActivity(viewPager_intents);
                break;

            case  R.id.ImageFromURL :
                Intent ImageFromURL_intents = new Intent(this , ImageFromURL.class);
                startActivity(ImageFromURL_intents);
                break;

            case  R.id.navigationDrawer :
                Intent navigationDrawer_intents = new Intent(this , Navigation_Drawer_fragmet_Activity.class);
                startActivity(navigationDrawer_intents);
                break;

            case  R.id.PhoneContacts :
                Intent PhoneContacts_intents = new Intent(this , PhoneContacts.class);
                startActivity(PhoneContacts_intents);
                break;


            case  R.id.GRID_IMAGES :
                Intent GRID_IMAGES_intents = new Intent(this , AndroidGridLayoutActivity.class);
                startActivity(GRID_IMAGES_intents);
                break;


            case R.id.ratingBar:
                Intent ratingBar_intents = new Intent(this, Andriod_RatingBar.class);
                startActivity(ratingBar_intents);
                break;

            case R.id.datePicker:
                Intent datePicker_intents = new Intent(this, DatePickerActivity.class);
                startActivity(datePicker_intents);
                break;

            case R.id.JSONparsing:
                Intent JSONparsing_intents = new Intent(this, JsonParsing.class);
                startActivity(JSONparsing_intents);
                break;

            case R.id.SqliteDatabase:
                Intent SqliteDatabase_intents = new Intent(this, SqlDbActivity.class);
                startActivity(SqliteDatabase_intents);
                break;

        }
    }
}
