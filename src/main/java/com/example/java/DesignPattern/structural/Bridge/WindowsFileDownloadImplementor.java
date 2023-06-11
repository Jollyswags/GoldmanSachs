package com.example.java.DesignPattern.structural.Bridge;

public class WindowsFileDownloadImplementor implements FileDownloadImplementor {
    @Override
    public Object downloadFile(String path) {

        return new Object();
    }

    @Override
    public boolean storeFile(Object object) {
        System.out.println("WINDOWS");
        return true;
    }
    public boolean deleteFile(String str) {
        return false;
    }

}
