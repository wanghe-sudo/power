package com.byd.power;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        while (true) {
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException ignored) {

            }
            File file = new File("./config.properties");
            Properties properties = new Properties();
            FileInputStream fileInputStream = null;
            try {
                fileInputStream = new FileInputStream(file);
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
                continue;
            }
            try {
                properties.load(fileInputStream);
            } catch (IOException e) {
                System.out.println("load properties failed");
                continue;
            }
            Object name = properties.get("name");
            System.out.println(name == null ? "name为空" : name.toString());
        }
        // 关机
//        Runtime runtime = Runtime.getRuntime();
//        try {
//            runtime.exec("shutdown -f -s -t 0");
//        } catch (IOException ignored) {
//
//        }
    }
}