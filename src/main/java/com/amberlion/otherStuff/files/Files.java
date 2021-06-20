package com.amberlion.otherStuff.files;

import java.io.File;
import java.io.IOException;

public class Files {
    public static void main(String[] args) throws IOException {
        String fileSeparator = System.getProperty("file.separator");
        String absoluteFilePath = "file.txt";
        File file = new File(absoluteFilePath);
        Boolean isCreated = file.createNewFile();
        file.deleteOnExit();
//        if(file.createNewFile()){
//            System.out.println(absoluteFilePath+" File Created");
//        }else System.out.println("File "+absoluteFilePath+" already exists");
    }
}
