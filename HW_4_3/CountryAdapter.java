package com.example.aruuke_rakhmanova_hw_4_3m;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.aruuke_rakhmanova_hw_4_3m.databinding.ItemCountryBinding;

import java.util.ArrayList;

public class CountryAdapter extends RecyclerView.Adapter<ViewHolderCountry> {

    private ArrayList<Country> countryList;

    public CountryAdapter(ArrayList<Country> countryList) {
        this.countryList = countryList;
    }

    @NonNull
    @Override
    public ViewHolderCountry onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolderCountry(ItemCountryBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderCountry holder, int position) {
        holder.onBindCountry(countryList.get(position));
    }

    @Override
    public int getItemCount() {
        return countryList.size();
    }
}

class ViewHolderCountry extends RecyclerView.ViewHolder {
    private ItemCountryBinding binding;

    public ViewHolderCountry(@NonNull ItemCountryBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void onBindCountry(Country country) {
        binding.tvCountry.setText(country.getName());
        binding.tvCapital.setText(country.getCapital());

        Glide.with(binding.imgFlag).load(country.getFlag()).into(binding.imgFlag);
    }

}
