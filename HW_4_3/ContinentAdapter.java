package com.example.aruuke_rakhmanova_hw_4_3m;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aruuke_rakhmanova_hw_4_3m.databinding.ItemContinentBinding;

import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter<ViewHolder> {
    private ArrayList<String> continentList;
    private AdapterContinentClick adapterClick;

    public ContinentAdapter(ArrayList<String> continentList, AdapterContinentClick adapterClick) {
        this.continentList = continentList;
        this.adapterClick = adapterClick;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemContinentBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(continentList.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapterClick.onClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return continentList.size();
    }
}

class ViewHolder extends RecyclerView.ViewHolder {
    private ItemContinentBinding binding;

    public ViewHolder(@NonNull ItemContinentBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void onBind(String continent) {
        binding.tvContinent.setText(continent);
    }
}
