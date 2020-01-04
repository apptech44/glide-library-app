package com.example.myglideapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myglideapp.model.MovieData;
import com.example.myglideapp.model.Movies;
import com.example.myglideapp.ui.MovieAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private GridLayoutManager gridLayoutManager;
    private List<Movies> moviesList;
    private MovieAdapter movieAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.my_glide_gallery);

        gridLayoutManager = new
                GridLayoutManager(this, 3
                , GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setHasFixedSize(true);

        setMovieList();
    }

    private void setMovieList() {
        moviesList = new ArrayList<>();
        moviesList = MovieData.setMovieData();
        movieAdapter = new MovieAdapter(MainActivity.this, moviesList);
        recyclerView.setAdapter(movieAdapter);
    }
}
