package com.geekbrains.geek.cloud.common;

public class FileRequest extends com.geekbrains.geek.cloud.common.AbstractMessage {
    private String filename;

    public String getFilename() {
        return filename;
    }

    public FileRequest(String filename) {
        this.filename = filename;
    }
}
