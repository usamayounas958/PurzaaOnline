package com.example.purzaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HomePage extends AppCompatActivity {
    String string;
    TextView textView;
    private TextView Carwash;
    private TextView Spare;
    private TextView Engine;
    private TextView Supplier;
    private TextView BookMechanic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        Carwash = (TextView) findViewById(R.id.carwash1);
        Spare = (TextView) findViewById(R.id.spare);
        Engine = (TextView) findViewById(R.id.engine1);
        Supplier = (TextView) findViewById(R.id.supplier);
        BookMechanic = (TextView) findViewById(R.id.bookmechanic);

        textView = findViewById(R.id.home);
        string = getIntent().getExtras().getString("username");
        textView.setText(string);


        Carwash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), carwash.class);
                startActivity(intent);
            }
        });

        Spare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), spareparts.class);
                startActivity(intent);
            }
        });

        Engine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), enginetune.class);
                startActivity(intent);
            }
        });

        Supplier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), sparepartsdealers.class);
                startActivity(intent);
            }
        });

        BookMechanic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), mechanicbooking.class);
                startActivity(intent);
            }
        });
    }


}