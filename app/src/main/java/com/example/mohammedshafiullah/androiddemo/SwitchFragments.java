package com.example.mohammedshafiullah.androiddemo;

import android.app.Fragment;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;


public class SwitchFragments extends Fragment  implements View.OnClickListener{

    EditText usernameET;
    EditText passwordET;
    RadioGroup radioButton;
    Button submitButton;
    Button resetButton;
    CheckBox checkBox ;
    boolean radioButtonchecked;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
  return inflater.inflate(R.layout.fragment_switch_fragments, container, false);
    }



    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);

        usernameET = (EditText) getActivity().findViewById(R.id.userNameET);
        passwordET = (EditText) getActivity().findViewById(R.id.passwordET);
        radioButton = (RadioGroup) getActivity().findViewById(R.id.radioButton);
        submitButton = (Button) getActivity().findViewById(R.id.submitBT);
        resetButton = (Button) getActivity().findViewById(R.id.resetBT);
        checkBox = (CheckBox) getActivity().findViewById(R.id.checkBox);


        //  radioButton.setOnClickListener(this);
        submitButton.setOnClickListener(this);
        resetButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.submitBT:

                if (usernameET.getText().toString().isEmpty() ||  usernameET.getText().toString().length() < 6)
                {
                    ToastClass.showToast(getActivity(), "Username must contain min 6 charecters");

                }
                else
                    ToastClass.showToast(getActivity(), "Success");


                break;

            case R.id.resetBT:
                usernameET.setText("");
                passwordET.setText("");
                radioButton.clearCheck();
                checkBox.setChecked(false);
                break;

        }
    }
}
