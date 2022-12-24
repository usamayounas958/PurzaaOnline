package com.example.purzaa;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    CardView sparepart;
    CardView engine;
    CardView carwash;
    CardView detailing;
    CardView polishing;
    CardView booking;

    public CardView getSparepart() {
        return sparepart;
    }

    public void setSparepart(CardView sparepart) {
        this.sparepart = sparepart;
    }

    public CardView getEngine() {
        return engine;
    }

    public void setEngine(CardView engine) {
        this.engine = engine;
    }

    public CardView getCarwash() {
        return carwash;
    }

    public void setCarwash(CardView carwash) {
        this.carwash = carwash;
    }

    public CardView getDetailing() {
        return detailing;
    }

    public void setDetailing(CardView detailing) {
        this.detailing = detailing;
    }

    public CardView getBooking() {
        return booking;
    }

    public void setBooking(CardView booking) {
        this.booking = booking;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        sparepart = findViewById(R.id.sparepart);
        engine = findViewById(R.id.engine);
        carwash = findViewById(R.id.carwash);
        detailing = findViewById(R.id.detailing);
        booking = findViewById(R.id.booking);

        Intent iHome = new Intent(MainActivity.this,signup.class);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(iHome);
                finish();
            }
        }, 2000);


    }
}