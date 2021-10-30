package com.example.tugas_recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private GamesAdapter adapter;
    private ArrayList<Games> gamesArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();
        recyclerView = (RecyclerView)findViewById(R.id.recycleview);
        adapter = new GamesAdapter(gamesArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
    private void addData() {
        gamesArrayList = new ArrayList<>();
        gamesArrayList.add(new Games("Apex Legend", "Genre : Battle royale, first-person hero shooter", "Free to Play",R.drawable.apex));
        gamesArrayList.add((new Games("Counter-Strike: Global Offensive","Genre : First-person shooter", "Free to Play",R.drawable.csgo)));
        gamesArrayList.add((new Games("Destiny", "Genre : First-person shooter, MMOG", "Free to Play",R.drawable.destiny)));
        gamesArrayList.add((new Games("Warframe","Genre : Action role-playing, third-person shooter", "Free to Play",R.drawable.warframe)));
    }
}
