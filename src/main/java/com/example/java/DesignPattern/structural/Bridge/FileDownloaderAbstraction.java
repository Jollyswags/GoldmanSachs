package com.example.java.DesignPattern.structural.Bridge;

public interface FileDownloaderAbstraction {
    public boolean store(Object object);
    public Object download(String path);
    //public boolean delete(String str);



}