package com.example.submissionpemula;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private RecyclerView rvBrand;
    private ArrayList<Brand> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvBrand = findViewById(R.id.rv_brand);
        rvBrand.setHasFixedSize(true);

        list.addAll(BrandData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvBrand.setLayoutManager(new LinearLayoutManager(this));
        ListBrandAdapter listBrandAdapter = new ListBrandAdapter(list);
        rvBrand.setAdapter(listBrandAdapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Membaca file menu dan menambahkan isinya ke action bar jika ada.
        getMenuInflater().inflate(R.menu.profile, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.miProfile:
                //showProfileView();
                Intent moveIntent = new Intent(MainActivity.this, Profile.class);
                startActivity(moveIntent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
