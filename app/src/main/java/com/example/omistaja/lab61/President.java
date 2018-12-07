package com.example.omistaja.lab61;

public class President {
    private  String name;
    private  int startingYear;
    private  int finishingYear;
    private String country;

    President(String name,int startingYear, int finishingYear,String country){
        this.name=name;
        this.startingYear=startingYear;
        this.finishingYear=finishingYear;
        this.country=country;
    }

    public String getName(){
        return this.name;
    }

    public int getStartingYear() {
        return startingYear;
    }

    public int getFinishingYear() {
        return finishingYear;
    }

    public String getCountry() {
        return country;
    }
}
