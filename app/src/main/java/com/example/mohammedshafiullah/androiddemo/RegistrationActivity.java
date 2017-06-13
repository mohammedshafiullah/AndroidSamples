package com.example.mohammedshafiullah.androiddemo;

import android.content.DialogInterface;
import android.renderscript.Sampler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class RegistrationActivity extends AppCompatActivity implements View.OnClickListener{
    EditText usernameET;
    EditText passwordET;
    RadioGroup radioButton;
    Button submitButton;
    Button resetButton;
    CheckBox checkBox ;
    boolean radioButtonchecked;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

         usernameET = (EditText) findViewById(R.id.userNameET);
         passwordET = (EditText) findViewById(R.id.passwordET);
         radioButton = (RadioGroup) findViewById(R.id.radioButton);
         submitButton = (Button) findViewById(R.id.submitBT);
         resetButton = (Button) findViewById(R.id.resetBT);
         checkBox = (CheckBox) findViewById(R.id.checkBox);


      //  radioButton.setOnClickListener(this);
        submitButton.setOnClickListener(this);
        resetButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId()) {


            case  R.id.submitBT:

                if (usernameET.getText().toString().isEmpty() ||  usernameET.getText().toString().length() < 6)
                {
                    ToastClass.showToast(this, "Username must contain min 6 charecters");

                }

               else if (passwordET.getText().toString().isEmpty()  || passwordET.getText().toString().length() < 8)
                {
                    ToastClass.showToast(this, "Password must contain  min 8 charecters");

                }
                else if (!checkBox.isChecked())
                {
                    ToastClass.showToast(this, "Please select Tearms & Conditions");
                }
                else  if (radioButton.getCheckedRadioButtonId()==-1)
                {
                    ToastClass.showToast( this, "Please select Gender");

                }
                 else
                {

                    ToastClass.showToast(this, "Success");
                }
                break;
            case R.id.resetBT:
                usernameET.setText("");
                passwordET.setText("");
                radioButton.clearCheck();
                checkBox.setChecked(false);
                break;
        }
    }



    public void onRadioButtonClicked (View view)
    {
         radioButtonchecked = ((RadioButton) view).isChecked();

        switch (view.getId())
        {
            case R.id.maleRadiodBtn:

                if(radioButtonchecked)
                {
             //ToastClass.showToast(this,"Male");
                }
                break;

            case R.id.femaleRadioBtn:

                if (radioButtonchecked)
                {
                    //ToastClass.showToast(this,"Female");
                }
                break;

        }

    }
}

