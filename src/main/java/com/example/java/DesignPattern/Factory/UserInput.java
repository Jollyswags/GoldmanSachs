package com.example.java.DesignPattern.Factory;


public class UserInput {
    public static Report createReport(Region region) {
        Region regionval=region;
        switch (regionval){
            case APAC:
                return new APACReport();
            case EMEA:
                return new EMEAReport();
            default:
                throw new IllegalArgumentException("No such region");


                

        }


    }
}
