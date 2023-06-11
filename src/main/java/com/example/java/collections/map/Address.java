package com.example.java.collections.map;

public class Address {
    String pin;
    String city;
    String state;
    Address(String pin, String city, String state){
        this.pin=pin;
        this.city=city;
        this.state=state;
    }
    public String getPin(){
        return this.pin;
    }
    public String getCity(){
        return this.city;
    }
    public String getState(){return  this.state;}

}
