package com.example.administrator.snrurun;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class SingUp extends AppCompatActivity {
    //Esplicris
    private EditText nameEditText, userEditText, passwordEditText;
    private RadioGroup radioGroup;
    private RadioButton choice1RadioButton, choice2RadioButton,
            choice3RadioButton, choice4RadioButton, choice5RadioButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);

        //Bind Widget
        bindwidget();



    }//Main method

    private void bindwidget() {
        nameEditText = (EditText) findViewById(R.id.editText);
        userEditText = (EditText) findViewById(R.id.editText2);
        passwordEditText = (EditText) findViewById(R.id.editText3);
        radioGroup = (RadioGroup) findViewById(R.id.rgAvatar);
        choice1RadioButton = (RadioButton) findViewById(R.id.radioButton);
        choice2RadioButton = (RadioButton) findViewById(R.id.radioButton2);
        choice3RadioButton = (RadioButton) findViewById(R.id.radioButton3);
        choice4RadioButton = (RadioButton) findViewById(R.id.radioButton4);
        choice5RadioButton = (RadioButton) findViewById(R.id.radioButton5);

    }

    public void clickSingUpSing(View view) {


        //startActivity(new Intent(SingUp.this,MainActivity.class));
    }


}//Main class
