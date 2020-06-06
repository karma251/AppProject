package com.example.garbagem;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private List<Retromodel> retromodels;

    public RecyclerAdapter(List<Retromodel> retromodels)
    {
        this.retromodels = retromodels;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_announcement,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    holder.Date.setText(retromodels.get(position).getDate());
    holder.Name.setText(retromodels.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return retromodels.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder
    {
            TextView Date,Name;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            Date = (TextView)itemView.findViewById(R.id.date);
            Name = (TextView)itemView.findViewById(R.id.name);
        }
    }
}
