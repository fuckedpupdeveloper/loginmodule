package com.developers.loginmodule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class UserAreaAcitivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area_acitivity);


        final EditText etusername = (EditText) findViewById(R.id.etusername);
        final EditText etage = (EditText) findViewById(R.id.etage);

        final TextView welcomemsg = (TextView) findViewById(R.id.tvWelcomemsg);


    }
}
