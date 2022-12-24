package com.example.purzaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class carwash extends AppCompatActivity {
    EditText EditTextFullName, EditTextAddress, EditTextCity, EditTextNumber;

    Button Booking;
    private DBHelper dbHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carwash);

        dbHelper= new DBHelper(this);
        dbHelper.OpenDB();

//
        EditTextFullName = findViewById(R.id.fullname);
        EditTextAddress = findViewById(R.id.address);
        EditTextCity = findViewById(R.id.city);
        EditTextNumber = findViewById(R.id.number);
        Booking = findViewById(R.id.booking);

        Booking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (EditTextFullName.getText().toString().isEmpty() || EditTextAddress.getText().toString().isEmpty() || EditTextCity.getText().toString().isEmpty() || EditTextNumber.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Fileds can't be blank", Toast.LENGTH_SHORT).show();
                }
                else {
                    Customer customer = new Customer(EditTextFullName.getText().toString(), EditTextAddress.getText().toString(), EditTextCity.getText().toString(), EditTextNumber.getText().toString());
                    if (dbHelper.SignUpCustomer(customer)){
                        Toast.makeText(getApplicationContext(), "Booking successfull", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(carwash.this, HomePage.class);
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