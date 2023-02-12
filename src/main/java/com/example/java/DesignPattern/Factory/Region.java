package com.example.java.DesignPattern.Factory;

enum Region {
    APAC("APAC"),
    EMEA("EMEA");
    String region;
    Region(String region){
        this.region=region;
    }
    public String getRegion(){
        return this.region;
    }



}
