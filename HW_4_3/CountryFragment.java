package com.example.aruuke_rakhmanova_hw_4_3m;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.aruuke_rakhmanova_hw_4_3m.databinding.FragmentContinentBinding;

import java.util.ArrayList;
import java.util.HashMap;

public class CountryFragment extends Fragment {
    private HashMap<String, ArrayList<Country>> continentMap = new HashMap<>();
    private FragmentContinentBinding binding;

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
        String selectedContinent = getArguments().getString("continent");
        ArrayList<Country> selectedCountryList = continentMap.get(selectedContinent);
        if (selectedCountryList != null) {
            CountryAdapter countryAdapter = new CountryAdapter(selectedCountryList);
            binding.rvContinent.setAdapter(countryAdapter);
        }
    }
    private void loadAsiaData() {
        ArrayList<Country> asiaCountries = new ArrayList<>();
        asiaCountries.add(new Country("Kyrgyzstan", "https://upload.wikimedia.org/wikipedia/commons/7/77/Flag_of_Kyrgyzstan_%281992-2023%29.png", "Bishkek"));
        asiaCountries.add(new Country("Kazakhstan", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/30/Flag_of_Kazakhstan.png/1200px-Flag_of_Kazakhstan.png", "Astana"));
        asiaCountries.add(new Country("Uzbekistan", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/0b/Flag_of_Uzbekistan.png/1200px-Flag_of_Uzbekistan.png", "Tashkent"));
        asiaCountries.add(new Country("Japan", "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9e/Flag_of_Japan.svg/2560px-Flag_of_Japan.svg.png", "Tokyo"));
        asiaCountries.add(new Country("China", "https://upload.wikimedia.org/wikipedia/commons/2/2e/Flag_of_China.png", "Beijing"));
        continentMap.put("Asia", asiaCountries);
    }

    private void loadEuropeData() {
        ArrayList<Country> europeCountries = new ArrayList<>();
        europeCountries.add(new Country("Russia", "https://upload.wikimedia.org/wikipedia/en/thumb/f/f3/Flag_of_Russia.svg/1200px-Flag_of_Russia.svg.png", "Moscow"));
        europeCountries.add(new Country("Germany", "https://upload.wikimedia.org/wikipedia/en/thumb/b/ba/Flag_of_Germany.svg/800px-Flag_of_Germany.svg.png", "Berlin"));
        europeCountries.add(new Country("France", "https://cdn.britannica.com/82/682-004-F0B47FCB/Flag-France.jpg", "Paris"));
        europeCountries.add(new Country("Belarus", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/85/Flag_of_Belarus.svg/640px-Flag_of_Belarus.svg.png", "Minsk"));
        europeCountries.add(new Country("Estonia", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/8f/Flag_of_Estonia.svg/1200px-Flag_of_Estonia.svg.png", "Tallinn"));
        continentMap.put("Europe", europeCountries);
    }

    private void loadAfricaData() {
        ArrayList<Country> africaCountries = new ArrayList<>();
        africaCountries.add(new Country("Egypt", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fe/Flag_of_Egypt.svg/1280px-Flag_of_Egypt.svg.png", "Cairo"));
        africaCountries.add(new Country("Uganda", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fe/Flag_of_Egypt.svg/1280px-Flag_of_Egypt.svg.png", "Campala"));
        africaCountries.add(new Country("Nigeria", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fe/Flag_of_Egypt.svg/1280px-Flag_of_Egypt.svg.png", "Abuja"));
        africaCountries.add(new Country("Mali", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fe/Flag_of_Egypt.svg/1280px-Flag_of_Egypt.svg.png", "Bamako"));
        africaCountries.add(new Country("Guinea", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fe/Flag_of_Egypt.svg/1280px-Flag_of_Egypt.svg.png", "Conakry"));
        continentMap.put("Africa", africaCountries);
    }
    private void loadAustraliaData() {
        ArrayList<Country> australiaCountries = new ArrayList<>();
        australiaCountries.add(new Country("Australia", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/8c/Flag_of_the_Australian_Capital_Territory.svg/1200px-Flag_of_the_Australian_Capital_Territory.svg.png", "Canberra"));
        australiaCountries.add(new Country("Australia", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/8c/Flag_of_the_Australian_Capital_Territory.svg/1200px-Flag_of_the_Australian_Capital_Territory.svg.png", "Canberra"));
        australiaCountries.add(new Country("Australia", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/8c/Flag_of_the_Australian_Capital_Territory.svg/1200px-Flag_of_the_Australian_Capital_Territory.svg.png", "Canberra"));
        australiaCountries.add(new Country("Australia", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/8c/Flag_of_the_Australian_Capital_Territory.svg/1200px-Flag_of_the_Australian_Capital_Territory.svg.png", "Canberra"));
        australiaCountries.add(new Country("Australia", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/8c/Flag_of_the_Australian_Capital_Territory.svg/1200px-Flag_of_the_Australian_Capital_Territory.svg.png", "Canberra"));
        continentMap.put("Australia", australiaCountries);
    }

    private void loadSouthAmericaData() {
        ArrayList<Country> sAmericaCountries = new ArrayList<>();
        sAmericaCountries.add(new Country("Argentina", "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1a/Flag_of_Argentina.svg/2000px-Flag_of_Argentina.svg.png", "Buenos Aires"));
        sAmericaCountries.add(new Country("Argentina", "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1a/Flag_of_Argentina.svg/2000px-Flag_of_Argentina.svg.png", "Buenos Aires"));
        sAmericaCountries.add(new Country("Argentina", "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1a/Flag_of_Argentina.svg/2000px-Flag_of_Argentina.svg.png", "Buenos Aires"));
        sAmericaCountries.add(new Country("Argentina", "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1a/Flag_of_Argentina.svg/2000px-Flag_of_Argentina.svg.png", "Buenos Aires"));
        sAmericaCountries.add(new Country("Argentina", "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1a/Flag_of_Argentina.svg/2000px-Flag_of_Argentina.svg.png", "Buenos Aires"));
        continentMap.put("South America", sAmericaCountries);
    }

    private void loadNorthAmericaData() {
        ArrayList<Country> nAmericaCountries = new ArrayList<>();
        nAmericaCountries.add(new Country("USA", "https://upload.wikimedia.org/wikipedia/commons/e/e2/Flag_of_the_United_States_%28Pantone%29.svg", "Washington"));
        nAmericaCountries.add(new Country("USA", "https://upload.wikimedia.org/wikipedia/commons/e/e2/Flag_of_the_United_States_%28Pantone%29.svg", "Washington"));
        nAmericaCountries.add(new Country("USA", "https://upload.wikimedia.org/wikipedia/commons/e/e2/Flag_of_the_United_States_%28Pantone%29.svg", "Washington"));
        nAmericaCountries.add(new Country("USA", "https://upload.wikimedia.org/wikipedia/commons/e/e2/Flag_of_the_United_States_%28Pantone%29.svg", "Washington"));
        nAmericaCountries.add(new Country("USA", "https://upload.wikimedia.org/wikipedia/commons/e/e2/Flag_of_the_United_States_%28Pantone%29.svg", "Washington"));
        continentMap.put("North America", nAmericaCountries);
    }


    private void loadData() {
        loadAsiaData();
        loadAfricaData();
        loadAustraliaData();
        loadEuropeData();
        loadNorthAmericaData();
        loadSouthAmericaData();
    }
}