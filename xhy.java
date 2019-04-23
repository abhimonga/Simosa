package com.example.mcx;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.WindowDecorActionBar;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class xhy extends AppCompatActivity {

    Button start1;
    LottieAnimationView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xhy);
//        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        start1=findViewById(R.id.start);
        t=findViewById(R.id.tsr);

    }

    public void start(View view) {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("Your recording has been started!!");
                alertDialogBuilder.setPositiveButton("OK",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {
                               start1.setText("Please do not press back Button");
                               start1.setEnabled(false);
                               t.setVisibility(View.INVISIBLE);

                            }
                        });



        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
    }

