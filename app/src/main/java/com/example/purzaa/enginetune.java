package com.example.purzaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class enginetune extends AppCompatActivity {
//    EditText EditTextFullName, EditTextAddress, EditTextCity, EditTextNumber;
    EditText EditTextTuneup, EditTextModel, EditTextCity,EditTextNumber;

    Button Booking1;
    private DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enginetune);

        dbHelper= new DBHelper(this);
        dbHelper.OpenDB();

        EditTextTuneup = findViewById(R.id.tuneup);
        EditTextModel = findViewById(R.id.model);
        EditTextCity = findViewById(R.id.city);
        EditTextNumber = findViewById(R.id.number);
        Booking1 = findViewById(R.id.booking1);

        Booking1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (EditTextTuneup.getText().toString().isEmpty() || EditTextModel.getText().toString().isEmpty() ||  EditTextCity.getText().toString().isEmpty() || EditTextNumber.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Fileds can't be blank", Toast.LENGTH_SHORT).show();
                }
                else {
                    Customer customer = new Customer (EditTextTuneup.getText().toString(), EditTextModel.getText().toString(),  EditTextCity.getText().toString(), EditTextNumber.getText().toString());
                    if (dbHelper.SignUpCustomer(customer)){
                        Toast.makeText(getApplicationContext(), "Booking successfull", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(enginetune.this, HomePage.class);
                        startActivity(intent);
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Booking failed", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}