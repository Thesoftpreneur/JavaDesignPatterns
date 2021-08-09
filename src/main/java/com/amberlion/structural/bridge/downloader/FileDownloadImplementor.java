package com.amberlion.structural.bridge.downloader;

public interface FileDownloadImplementor
{
    public Object downloadFile(String path);

    public boolean storeFile(Object object);
}