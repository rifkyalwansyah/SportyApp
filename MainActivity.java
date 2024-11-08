package com.as.aboutsporty;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisialisasi RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2)); // Grid dengan 2 kolom

        // Membuat daftar produk contoh
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("jogo sala chevron","price: Rp.590.000", R.drawable.jogosala_chevron));
        productList.add(new Product("Specs Accelerator alpha never elite", "Price: Rp.599.000", R.drawable.specs_accelerator_alpha_nerve_elite));
        productList.add(new Product("Specs lightspeed reborn", "Price: Rp.575.000", R.drawable.specs_lightspeed_reborn_in_whitepale_gold));
        productList.add(new Product("adidas x crazyfast", "Price: Rp.780.000", R.drawable.adidas_x_crazyfast));
        productList.add(new Product("nike zoom mercurial vapor", "Price: Rp.1.400.000", R.drawable.nike_zoom_mercurial_vapor));
        productList.add(new Product("nike phantom gx academy lc", "Price: Rp.1.450.000", R.drawable.nike_phantom_gx_academy_lc));

        // Mengatur adapter untuk RecyclerView
        ProductAdapter adapter = new ProductAdapter(productList);
        recyclerView.setAdapter(adapter);

        // Inisialisasi Button
        Button btn1 = findViewById(R.id.btn1);

        // Menambahkan aksi ketika Button ditekan
        btn1.setOnClickListener(v -> {
            // Membuka Activity baru
            Intent intent = new Intent(MainActivity.this, NewActivity.class);
            startActivity(intent);
        });
    }
}
