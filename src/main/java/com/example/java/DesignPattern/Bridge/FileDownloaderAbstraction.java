package com.example.java.DesignPattern.Bridge;

public interface FileDownloaderAbstraction {
    public Object download(String path);

    public boolean store(Object object);
}