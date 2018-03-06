package com.developers.loginmodule;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class registerAcitivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_acitivity);

        final EditText etAge =(EditText) findViewById(R.id.etage);
        final  EditText etname = (EditText) findViewById(R.id.etname);
        final  EditText etusername = (EditText) findViewById(R.id.etusername);
        final EditText etpassword = (EditText) findViewById(R.id.etpassword);

        final Button bRegister = (Button) findViewById(R.id.bRegister);

        bRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final String name = etname.getText().toString();
                final String username = etusername.getText().toString();
                final int age = Integer.parseInt(etAge.getText().toString());
                final String password = etpassword.getText().toString();

                Response.Listener<String> responseLiatner = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        try {
                            JSONObject jsonResponse = new JSONObject(response);

                            boolean success = jsonResponse.getBoolean("success");

                            if (success){

                                Intent intent = new Intent( registerAcitivity.this , MainActivity.class);
                                registerAcitivity.this.startActivity(intent);
                            }
                            else {

                                AlertDialog.Builder builder = new AlertDialog.Builder(registerAcitivity.this);
                                builder.setMessage("REGISTER FAILED ")
                                        .setNegativeButton("Retry", null)
                                        .create()
                                        .show();

                            }

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                };

                RegisterRequest registerRequest = new RegisterRequest(name , username,age, password, responseLiatner);
                RequestQueue queue = Volley.newRequestQueue(registerAcitivity.this);
                queue.add(registerRequest);

            }
        });

    }
}
