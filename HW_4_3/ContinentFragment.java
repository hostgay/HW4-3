package com.example.aruuke_rakhmanova_hw_4_3m;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.aruuke_rakhmanova_hw_4_3m.databinding.FragmentContinentBinding;

import java.util.ArrayList;

public class ContinentFragment extends Fragment implements AdapterContinentClick {
    private FragmentContinentBinding binding;
    private ArrayList<String> continentList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentContinentBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        ContinentAdapter adapter = new ContinentAdapter(continentList, this);
        binding.rvContinent.setAdapter(adapter);
    }

    private void loadData() {
        continentList.add("Asia");
        continentList.add("Africa");
        continentList.add("Australia");
        continentList.add("South America");
        continentList.add("North America");
        continentList.add("Europe");
    }

    public void onClick(int position) {
        String selectedContinent = continentList.get(position);
        Bundle bundle = new Bundle();
        bundle.putString("continent", selectedContinent);

        CountryFragment countryFragment = new CountryFragment();
        countryFragment.setArguments(bundle);

        requireActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, countryFragment)
                .addToBackStack(null)
                .commit();
    }
}