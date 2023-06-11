package com.example.java.DesignPattern.creational.Protoype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
    private static Map<Region , Report> prototypes = new HashMap<Region , Report>();

    static
    {
        prototypes.put(Region.APACS, new APAC());
        prototypes.put(Region.EMEAS, new EMEA());
    }

    public static Report getInstance(final Region s) throws CloneNotSupportedException {
        return ((Report) prototypes.get(s)).clone();
    }
}
