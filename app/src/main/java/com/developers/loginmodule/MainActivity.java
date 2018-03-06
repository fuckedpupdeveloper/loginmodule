package com.developers.loginmodule;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText etusername = (EditText) findViewById(R.id.etusername);
        final EditText etpassword = (EditText) findViewById(R.id.etpassword);

        final Button bLogin = (Button) findViewById(R.id.bLogin);
        final TextView registerlink = (TextView) findViewById(R.id.registerhere);
        registerlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent registerIntent = new Intent(MainActivity.this , registerAcitivity.class);
                MainActivity.this.startActivity(registerIntent);

             final  EditText etage = (EditText) findViewById(R.id.etage);
             final  EditText etusername  = (EditText) findViewById(R.id.etusername);
             final EditText etpassword = (EditText) findViewById(R.id.etpassword);




            }
        });


    }
}
