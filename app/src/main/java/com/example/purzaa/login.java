package com.example.purzaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class login extends AppCompatActivity {

    EditText EditTextUserName, EditTextPassword;
    Button buttonLogin1;
    String string;

    private DBHelper dbHelper;
    private TextView signText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        signText = findViewById(R.id.signText);

//        loginText = (TextView) findViewById(R.id.loginText);

        dbHelper = new DBHelper(this);
        dbHelper.OpenDB();

        EditTextUserName = findViewById(R.id.username);
        EditTextPassword = findViewById(R.id.password);
        buttonLogin1 = findViewById(R.id.buttonLogin);

        buttonLogin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                string = EditTextUserName.getText().toString();

                ArrayList<Customer> userDetails = dbHelper.LoginCustomer(EditTextUserName.getText().toString(), EditTextPassword.getText().toString());

                if(userDetails.size() != 0){
                    Customer customer = userDetails.get(0);
                    Toast.makeText(getApplicationContext(), "Valid User", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(login.this,HomePage.class);
                    intent.putExtra("username", string);
                    intent.putExtra("username", string);
                    startActivity(intent);
                }

                else{
                    Toast.makeText(getApplicationContext(), "Invalid user", Toast.LENGTH_SHORT).show();
                }
            }
        });

        signText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), signup.class);
                startActivity(intent);
            }
        });

    }
}