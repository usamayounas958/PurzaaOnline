package com.example.purzaa;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class signup extends AppCompatActivity {
    EditText EditTextFullname, EditTextUserName, EditTextEmail, EditTextPassword;

    private DBHelper dbHelper;
    Button signUp;
    private Intent intent;
    private TextView loginText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        loginText = (TextView) findViewById(R.id.loginText);

        dbHelper= new DBHelper(this);
        dbHelper.OpenDB();

        EditTextFullname = findViewById(R.id.fullname);
        EditTextUserName = findViewById(R.id.username);
        EditTextEmail =findViewById(R.id.email);
        EditTextPassword = findViewById(R.id.password);
        signUp = findViewById(R.id.buttonSignUp);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (EditTextFullname.getText().toString().isEmpty() || EditTextUserName.getText().toString().isEmpty() || EditTextEmail.getText().toString().isEmpty() || EditTextPassword.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Fileds can't be blank", Toast.LENGTH_SHORT).show();
                } else {
                    Customer customer = new Customer(EditTextFullname.getText().toString(), EditTextUserName.getText().toString(), EditTextEmail.getText().toString(), EditTextPassword.getText().toString());
                    if (dbHelper.SignUpCustomer(customer)) {
                        Toast.makeText(getApplicationContext(), "Signup successfull", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(signup.this, login.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(getApplicationContext(), "User SignUp failed", Toast.LENGTH_SHORT).show();
                    }

                }

            }
        });

        loginText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getApplicationContext(), login.class);
                startActivity(intent);
            }
        });

    }


}
