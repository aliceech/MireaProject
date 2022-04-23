package ru.mirea.chemodanova.mireaproject;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



public class RecyclerViewHolder extends RecyclerView.ViewHolder{
    ImageView photo;
    TextView text;
    public RecyclerViewHolder(@NonNull View itemView) {
        super(itemView);
        this.photo = itemView.findViewById(R.id.photo);
        this.text = itemView.findViewById(R.id.text);
    }
}