package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bgButton;
    public ConstraintLayout constraintLayout;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bgButton = (Button)findViewById(R.id.button_fon);
        constraintLayout = (ConstraintLayout)findViewById(R.id.ConstraintLayout);
        context = MainActivity.this;
        bgButton.setOnClickListener(this);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.message);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();

    }

    @Override
    public void onClick(View v) {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setTitle(R.string.message);
        final CharSequence[] items = {getText(R.string.red), getText(R.string.yellow), getText(R.string.green), getText(R.string.purple)};

        builder.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which){
                switch (which){
                    case 0:
                        constraintLayout.setBackgroundResource(R.color.redColor);
                        Toast.makeText(context, R.string.red, Toast.LENGTH_LONG).show();
                        break;
                    case 1:
                        constraintLayout.setBackgroundResource(R.color.yellowColor);
                        Toast.makeText(context, R.string.yellow, Toast.LENGTH_LONG).show();
                        break;
                    case 2:
                        constraintLayout.setBackgroundResource(R.color.greenColor);
                        Toast.makeText(context, R.string.green, Toast.LENGTH_LONG).show();
                        break;
                    case 3:
                        constraintLayout.setBackgroundResource(R.color.purpleColor);
                        Toast.makeText(context, R.string.purple, Toast.LENGTH_LONG).show();
                        break;
                }
            }
        });
        android.app.AlertDialog alertDialog = builder.create();
        builder.show();
    }
}