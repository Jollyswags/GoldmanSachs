package com.example.java.DesignPattern.structural.Bridge;

public interface FileDownloadImplementor {
    public Object downloadFile(String path);

    public boolean storeFile(Object object);
    public boolean deleteFile(String str);

}