package com.example.java.DesignPattern.structural.Bridge;

public class Client {
    public static void main(String[] args) {
        String op = "windows";
        FileDownloaderAbstraction val = null;

        switch (op) {
            case "windows":
                val = new FileDownloaderAbstractionImpl(new WindowsFileDownloadImplementor());
                break;

            case "linux":
                val = new FileDownloaderAbstractionImpl(new LinuxFileDownloadImplementor());
                break;
            case "mac":
                val=new FileDownloaderAbstractionImpl(new MacFileDownloadImplementor());
                break;
            default:
                System.out.println("wrong input");
        }

        Object fileContent = val.download("some path");
        //System.out.println(val.delete("something to be deleted"));
        val.store(fileContent);
    }
}
