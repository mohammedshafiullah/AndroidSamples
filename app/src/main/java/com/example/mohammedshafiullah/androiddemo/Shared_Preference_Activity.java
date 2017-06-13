    package com.example.mohammedshafiullah.androiddemo;

    import android.app.Activity;
    import android.content.Context;
    import android.content.SharedPreferences;
    import android.support.v7.app.AppCompatActivity;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.Button;
    import android.widget.EditText;

    public class Shared_Preference_Activity extends AppCompatActivity  implements View.OnClickListener {
        SharedPreferences sharedPref;
        public static final String MyPREFERENCES = "MyPrefs" ;

        EditText name;
        EditText address;
        SharedPreferences prefs;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_shared__preference_);

             name = (EditText) findViewById(R.id.shared_nameET);
            address = (EditText) findViewById(R.id.shared_AddressET);

            Button submitBT = (Button) findViewById(R.id.shared_submitBT);
            submitBT.setOnClickListener(this);


            Button deletetBT = (Button) findViewById(R.id.shared_deleteBT);
            deletetBT.setOnClickListener(this);


            prefs = getSharedPreferences(MyPREFERENCES, MODE_PRIVATE);
            String nameText = prefs.getString("name", "");
            String addressText = prefs.getString("address", "");

                name.setText(nameText);
                address.setText(addressText);

        }

        @Override
        public void onClick(View view)
        {
            SharedPreferences.Editor editor = getSharedPreferences(MyPREFERENCES, MODE_PRIVATE).edit();


            switch (view.getId())

             {
             case R.id.shared_submitBT:

                 if ((name.getText().toString() != "") && (address.getText().toString() != "")) {
                     editor.putString("name", name.getText().toString());
                     editor.putString("address", address.getText().toString());
                     editor.commit();
                 }
                break;

                 case R.id.shared_deleteBT:
                     name.setText("");
                     address.setText("");
                     editor.clear();  // Removing the shared preference from project.
                     // editor.remove("name123"); // removing indepent keys from shared preference.
                    // editor.remove("address");
                     editor.commit();
                     onBackPressed();
                     break;

             }
        }




    }
