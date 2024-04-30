package com.example.aruuke_rakhmanova_hw_4_3m;

public class Country {
    private String name;
    private String flag;
    private String capital;

    public Country(String name, String flag, String capital) {
        this.name = name;
        this.flag = flag;
        this.capital = capital;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
}
