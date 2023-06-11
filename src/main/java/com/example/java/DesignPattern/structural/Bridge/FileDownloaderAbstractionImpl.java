package com.example.java.DesignPattern.structural.Bridge;

public class FileDownloaderAbstractionImpl implements FileDownloaderAbstraction {

    private FileDownloadImplementor obj = null;

    public FileDownloaderAbstractionImpl(FileDownloadImplementor obj) {
        super();
        this.obj = obj;
    }

    @Override
    public Object download(String path) {

        return obj.downloadFile(path);
    }

    @Override
    public boolean store(Object object) {

        return obj.storeFile(object);
    }
    /*@Override
    public boolean delete(String str){
        return obj.deleteFile(str);
    }*/

}