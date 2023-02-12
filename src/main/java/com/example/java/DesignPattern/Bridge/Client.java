package com.example.java.DesignPattern.Bridge;

public class Client {
    public static void main(String[] args) {
        String os = "linux";
        FileDownloaderAbstraction downloader = null;

        switch (os) {
            case "windows":
                downloader = new FileDownloaderAbstractionImpl(new WindowsFileDownloadImplementor());
                break;

            case "linux":
                downloader = new FileDownloaderAbstractionImpl(new LinuxFileDownloadImplementor());
                break;

            default:
                System.out.println("OS not supported !!");
        }

        Object fileContent = downloader.download("some path");
        downloader.store(fileContent);
    }
}
/*
A Bridge Pattern says that just "decouple the functional
abstraction from the implementation so that the two can vary independently".
It enables the separation of implementation from the interface.
It improves the extensibility.
It allows the hiding of implementation details from the client.
 */