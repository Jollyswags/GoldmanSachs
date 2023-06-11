package com.example.java.DesignPattern.structural.Bridge;

public class MacFileDownloadImplementor implements FileDownloadImplementor{
    @Override
    public Object downloadFile(String path) {

        return new Object();
    }

    @Override
    public boolean storeFile(Object object) {
        System.out.println("Mac");
        return true;
    }
    public boolean deleteFile(String str) {
        return false;
    }
}
