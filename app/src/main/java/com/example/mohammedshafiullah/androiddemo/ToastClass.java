package com.example.mohammedshafiullah.androiddemo;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by mohammedshafiullah on 21/05/17.
 */
public class ToastClass
{
   public static void showToast (Context contxt, String str1)
   {
       Toast.makeText(contxt,str1,Toast.LENGTH_LONG).show();
   }

}
