package com.example.tugas_recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class GamesAdapter extends RecyclerView.Adapter<GamesAdapter.GamesViewHolder>{
    private ArrayList<Games> gamesArrayList;
    public GamesAdapter(ArrayList<Games> gamesArrayList) {
        this.gamesArrayList = gamesArrayList;
    }
    @NonNull
    @Override
    public GamesAdapter.GamesViewHolder
    onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_games, parent, false);
        return new GamesViewHolder(view);
    }
    public void onBindViewHolder(GamesViewHolder holder, int position) {
        holder.Foto.setImageResource(gamesArrayList.get(position).getFoto());
        holder.txtNama.setText(gamesArrayList.get(position).getNama());
        holder.txtGenre.setText(gamesArrayList.get(position).getGenre());
        holder.txtPrice.setText(gamesArrayList.get(position).getPrice());
    }
    @Override
    public int getItemCount() {
        return (gamesArrayList != null) ? gamesArrayList.size() : 0;
    }

    public class GamesViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama, txtGenre, txtPrice;
        private ImageView Foto;
        public GamesViewHolder(View itemView) {
            super(itemView);
            Foto = (ImageView) itemView.findViewById(R.id.foto);
            txtNama = (TextView)itemView.findViewById(R.id.txt_nama);
            txtGenre = (TextView) itemView.findViewById(R.id.txt_genre);
            txtPrice = (TextView) itemView.findViewById(R.id.txt_price);
        }
    }
}

