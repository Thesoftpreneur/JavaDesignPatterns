package com.amberlion.structural.bridge.downloader;

public interface FileDownloaderAbstraction {
    public Object download(String path);

    public boolean store(Object object);
}
