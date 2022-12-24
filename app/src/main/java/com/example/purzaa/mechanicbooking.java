package com.example.purzaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class mechanicbooking extends AppCompatActivity {

    EditText EditTextFullName1, EditTextAddress1, EditTextCity1, EditTextNumber1;

    Button Booking3;
    private DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechanicbooking);

        dbHelper= new DBHelper(this);
        dbHelper.OpenDB();

        EditTextFullName1 = findViewById(R.id.fullname1);
        EditTextAddress1 = findViewById(R.id.address1);
        EditTextCity1 = findViewById(R.id.city1);
        EditTextNumber1 = findViewById(R.id.number1);
        Booking3 = findViewById(R.id.booking3);

        Booking3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (EditTextFullName1.getText().toString().isEmpty() || EditTextAddress1.getText().toString().isEmpty() || EditTextCity1.getText().toString().isEmpty() || EditTextNumber1.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Fileds can't be blank", Toast.LENGTH_SHORT).show();
                }
                else {
                    Customer customer = new Customer(EditTextFullName1.getText().toString(), EditTextAddress1.getText().toString(), EditTextCity1.getText().toString(), EditTextNumber1.getText().toString());
                    if (dbHelper.SignUpCustomer(customer)) {
                        Toast.makeText(getApplicationContext(), "Booking successfull", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(mechanicbooking.this, HomePage.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(getApplicationContext(), "Booking failed", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
