package com.zhiyuan.ma.io;

import java.io.File;

public class FileDigui {
    public static void main(String[] args) {
        File file = new File("D:\\filedemo");
        getFile(file);
    }
    public static void getFile(File file){
        File[] files = file.listFiles();
        for (File file1 : files) {
            if(file1.isFile()){
                System.out.println("---"+file1.getName());
            }else if(file1.isDirectory()){
                System.out.println("---"+file1.getName());
                getFile(file1);
            }
        }
    }
}
