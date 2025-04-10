package com.example.reciyle;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.tvNamaMakanan);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        List<Makanan> makananList = Arrays.asList(
                new Makanan("NASI PADANG", 4.9f, "15.000", "SUMATERA BARAT", R.drawable.nasipadang),
                new Makanan("LENTOG", 4.5f, "12.000", "KUDUS", R.drawable.lentog),
                new Makanan("SATE KERBAU", 4.4f, "35.000", "KUDUS", R.drawable.satekerbau),
                new Makanan("SOTO KUDUS", 5.0f, "33.000", "KUDUS", R.drawable.sotokudus),
                new Makanan("RENDANG", 4.8f, "58.000", "SUMATERA BARAT", R.drawable.rendang)
        );

        AdapterMakanan adapter = new AdapterMakanan(makananList, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new AdapterMakanan(makananList, this));
    }
}