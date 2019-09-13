package com.example.submissionpemula;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    private String nama;
    private String detail;
    private String foto;
    private TextView namaBrand;
    private TextView detailBrand;
    private ImageView fotoBrand;

    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent i = getIntent();

        nama=i.getStringExtra("judul");
        detail=i.getStringExtra("detail");
        foto=i.getStringExtra("foto");

        namaBrand = findViewById(R.id.tv_namabrand);
        detailBrand = findViewById(R.id.tv_detailbrand);
        fotoBrand = findViewById(R.id.detail_image);

        namaBrand.setText(nama);
        detailBrand.setText(detail);
        Glide.with(this)
                .load(foto)
                .into(fotoBrand);
    }
}
