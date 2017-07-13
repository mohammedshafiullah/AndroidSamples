package com.example.mohammedshafiullah.androiddemo;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class DatePickerActivity extends AppCompatActivity  {
    DatePicker picker;
    Button changeDateButton;
    TextView textview1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker);

        textview1=(TextView)findViewById(R.id.textViewDatePicker);
        picker=(DatePicker)findViewById(R.id.datePicker1);
        changeDateButton=(Button)findViewById(R.id.changeDateButton);

        textview1.setText(getCurrentDate());

        changeDateButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                textview1.setText(getCurrentDate());
            }

        });
    }

    public String getCurrentDate(){
        StringBuilder builder=new StringBuilder();
        builder.append("Current Date: ");
        builder.append((picker.getMonth() + 1)+"/");//month is 0 based
        System.out.println ( "picker.getMonth() + 1========"+picker.getMonth() + 1);
        System.out.println ( "picker.getDayOfMonth() + 1========"+picker.getDayOfMonth());

        builder.append(picker.getDayOfMonth()+"/");
        builder.append(picker.getYear());
        return builder.toString();
    }


}
