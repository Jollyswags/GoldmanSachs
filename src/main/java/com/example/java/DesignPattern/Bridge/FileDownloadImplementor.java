package com.example.java.DesignPattern.Bridge;

public interface FileDownloadImplementor {
    public Object downloadFile(String path);

    public boolean storeFile(Object object);

    public boolean delete(String object);
}