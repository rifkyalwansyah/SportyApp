package com.as.aboutsporty;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

    private final List<Product> productList;

    // Konstruktor untuk menerima data produk
    public ProductAdapter(List<Product> productList) {
        this.productList = productList;
    }

    // Buat ViewHolder untuk menyimpan referensi tampilan item
    public static class ProductViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageViewProduct;
        public TextView textViewName;
        public TextView textViewPrice;

        public ProductViewHolder(View itemView) {
            super(itemView);
            imageViewProduct = itemView.findViewById(R.id.imageViewProduct);
            textViewName = itemView.findViewById(R.id.textViewName);
            textViewPrice = itemView.findViewById(R.id.textViewPrice);
        }
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate layout item
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_product, parent, false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        // Menghubungkan data ke item layout
        Product product = productList.get(position);
        holder.textViewName.setText(product.getName());
        holder.textViewPrice.setText(product.getPrice());
        holder.imageViewProduct.setImageResource(product.getImageResource());
    }

    @Override
    public int getItemCount() {
        // Mengembalikan jumlah item dalam daftar
        return productList.size();
    }
}
