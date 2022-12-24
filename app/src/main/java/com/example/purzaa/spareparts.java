package com.example.purzaa;

import android.media.Image;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageView;


import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.BundleCompat;


import com.example.purzaa.databinding.ActivityMainBinding;


public class spareparts extends AppCompatActivity {

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spareparts);

        gridView = (GridView)  findViewById(R.id.gridView);
//        gridView.setAdapter((ListAdapter) new ImageView(this));
        gridView.setAdapter(new GridAdapter(this));
    }
}

