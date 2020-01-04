package com.example.myglideapp.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.myglideapp.R;
import com.example.myglideapp.model.Movies;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieHolder> {

    private Context context;
    private List<Movies> moviesList;
    private LayoutInflater inflater;

    public MovieAdapter(Context context, List<Movies> moviesList) {
        this.context = context;
        this.moviesList = moviesList;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public MovieHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.glide_list_of_images, parent, false);
        MovieHolder movieHolder = new MovieHolder(view);
        return movieHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MovieHolder holder, int position) {

        Movies movies = moviesList.get(position);
        holder.textView.setText(movies.getMovieName());

        Glide.with(context)
                .load(movies.getMovieImages())
                .centerCrop()
                .placeholder(R.drawable.ic_launcher_background)
                .into(holder.imageView);

        holder.setListener(position);
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }

    public class MovieHolder extends RecyclerView.ViewHolder {

        private TextView textView;
        private ImageView imageView;


        public MovieHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.movie_name_text_view);
            imageView = itemView.findViewById(R.id.my_image_glide);

        }

        private void setListener(final int position) {

            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Movies movies = moviesList.get(position);
                    Toast.makeText(context, movies.getMovieName(),
                            Toast.LENGTH_LONG).show();

                }
            });

        }

    }

}
