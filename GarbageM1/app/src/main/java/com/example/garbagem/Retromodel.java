package com.example.garbagem;

import com.google.gson.annotations.SerializedName;

public class Retromodel {

    @SerializedName("date")
    private String Date;

    @SerializedName("name")
    private String Name;


    public String getDate() {
        return Date;
    }

    public String getName() {
        return Name;
    }
}
