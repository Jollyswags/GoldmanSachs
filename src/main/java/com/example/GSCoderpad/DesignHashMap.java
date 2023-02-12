package com.example.GSCoderpad;


import java.util.Arrays;

class DesignHashMap {
    int[] res = new int[1000001];

    public DesignHashMap() {
        Arrays.fill(res, -1);
    }

    public void put(int key, int value) {
        res[key] = value;
    }

    public int get(int key) {
        return res[key];
    }

    public void remove(int key) {
        res[key] = -1;
    }

    public static void main(String[] args) {

    }

}