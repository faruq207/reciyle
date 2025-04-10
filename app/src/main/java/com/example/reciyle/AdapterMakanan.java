package com.example.reciyle;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterMakanan extends RecyclerView.Adapter<AdapterMakanan.GameViewHolder> {

    private final List<Makanan> makananList;
    private final Context context;

    public AdapterMakanan(List<Makanan> makananList, Context context) {
        this.makananList = makananList;
        this.context = context;
    }

    @NonNull
    @Override
    public GameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new GameViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GameViewHolder holder, int position) {
        final Makanan makanan = makananList.get(position);  // Pakai final agar lebih aman
        holder.MakananName.setText(makanan.getName());
        holder.MakananImage.setImageResource(makanan.getImageResId());


        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context.getApplicationContext(), MakananDetailActivity.class);
            intent.putExtra("NAME", makanan.getName());
            intent.putExtra("RATING", makanan.getRating());
            intent.putExtra("PRICE", makanan.getPrice());
            intent.putExtra("FROM", makanan.getFrom());
            intent.putExtra("IMAGE", makanan.getImageResId());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return makananList.size();
    }

    public static class GameViewHolder extends RecyclerView.ViewHolder {
        final TextView MakananName;
        final ImageView MakananImage;

        public GameViewHolder(@NonNull View itemView) {
            super(itemView);
            MakananName = itemView.findViewById(R.id.MakananName);
            MakananImage = itemView.findViewById(R.id.MakananImage);
        }
    }
}