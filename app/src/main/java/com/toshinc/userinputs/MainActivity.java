package com.toshinc.userinputs;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

ToggleButton tb;
    CheckBox ch1;
    CheckBox ch2;

    RadioButton rb1, rb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tb=(ToggleButton)findViewById(R.id.tb1);
        ch1=(CheckBox)findViewById(R.id.checkBox);
        ch2=(CheckBox)findViewById(R.id.checkBox2);
        rb1=(RadioButton)findViewById(R.id.radioButton1);
        rb2=(RadioButton)findViewById(R.id.radioButton2);

tb.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        boolean on = ((ToggleButton) v).isChecked();

        if (on) {
            Toast.makeText(getApplicationContext(),"You switched ON",Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getApplicationContext(),"You switched OFF",Toast.LENGTH_LONG).show();
        }
    }
});
        ch1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                if (ch1.isChecked()) {
                    Toast.makeText(getApplicationContext(),"You checked OK",Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(),"You unchecked OK",Toast.LENGTH_LONG).show();
                }
            }
        });
        ch2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                if (ch2.isChecked()) {
                    Toast.makeText(getApplicationContext(),"You checked CANCEL",Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(),"You unchecked CANCEL",Toast.LENGTH_LONG).show();
                }
            }
        });
        rb1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                if (rb1.isChecked()) {
                    Toast.makeText(getApplicationContext(),"You checked Male",Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(),"You unchecked OK",Toast.LENGTH_LONG).show();
                }
            }
        });
        rb2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                if (rb2.isChecked()) {
                    Toast.makeText(getApplicationContext(),"You checked Female",Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(),"You unchecked OK",Toast.LENGTH_LONG).show();
                }
            }
        });






    }



    public void alert(View view) {



        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);

        // set title
        alertDialogBuilder.setTitle("Do you want to Exit?");

        // set dialog message
        alertDialogBuilder
                .setMessage("Click yes to exit!")
                .setCancelable(false)
                .setPositiveButton("Yes",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int id) {
                        // if this button is clicked, close
                        // current activity
                        MainActivity.this.finish();
                    }
                })
                .setNegativeButton("No",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int id) {
                        // if this button is clicked, just close
                        // the dialog box and do nothing
                        dialog.cancel();
                    }
                });

        // create alert dialog
        AlertDialog alertDialog = alertDialogBuilder.create();

        // show it
        alertDialog.show();
    }

public void progress(View view){
    ProgressDialog progressDialog= new ProgressDialog(this);
    progressDialog.setTitle("Downloading...Please wait..");
    progressDialog.setCancelable(false);
    progressDialog.setProgressStyle(progressDialog.STYLE_HORIZONTAL);
    progressDialog.setButton("yes", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            dialog.cancel();

        }
    });
    progressDialog.show();
}








}

