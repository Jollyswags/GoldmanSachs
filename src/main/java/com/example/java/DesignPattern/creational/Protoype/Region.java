package com.example.java.DesignPattern.creational.Protoype;

public enum Region {
    APACS("APAC"),
    EMEAS("EMEA");
    String region;
    Region(String region){
        this.region=region;
    }
    public String getRegion(){
        return this.region;
    }

}
