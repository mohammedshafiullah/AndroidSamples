package com.example.mohammedshafiullah.androiddemo;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

public class Dialogs_Activity extends AppCompatActivity implements View.OnClickListener {
 static Activity currentActivity  = null;
    private ProgressBar spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialogs_);
        currentActivity = this;

        spinner = (ProgressBar)findViewById(R.id.progressBar);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.plain_dialog:
                plainDialodMethod ();

                break;
            case R.id.custom_dialog:
                customDialogMethod ();
                break;
        }
    }


    public void plainDialodMethod ()
    {
        spinner.setVisibility(View.VISIBLE);

        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setMessage("Write your message here.");

        builder1.setPositiveButton(
                "Yes",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id)
                    {
                        ToastClass.showToast(Dialogs_Activity.this,"YES button is pressed");

                    }
                });

        builder1.setNegativeButton(
                "No",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                    }
                });

        AlertDialog alert11 = builder1.create();
        alert11.show();


    }


    public  void customDialogMethod ()
    {
        spinner.setVisibility(View.GONE);
         Dialog customdialog = new Dialog(this); // Context, this, etc.
        customdialog.requestWindowFeature(Window.FEATURE_NO_TITLE);

        customdialog.setContentView(R.layout.activity_registration);
        //customdialog.setTitle("Custom Dialog");
        customdialog.show();



        /*
        Button agreeBT = (Button) customdialog.findViewById(R.id.custom_dialog_agree);
        //setting onclickListner to aggree button
        agreeBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               ToastClass.showToast(currentActivity,"AgreeButton Pressed");
            }
        });

        Button cancelBT = (Button) customdialog.findViewById(R.id.custom_dialog_cancel);

        cancelBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               customdialog.dismiss();
            }
        });*/




    }
}
