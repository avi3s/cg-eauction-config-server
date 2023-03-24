package com.cg.eauction.config;

import java.io.File;

import org.springframework.core.io.ClassPathResource;

public class StartingServices {

    public static final String FILENAME = "zipkin-server-2.24.0.jar";

    public static void main(String[] args) {

        try {
            File file = new ClassPathResource(FILENAME).getFile();
            String zipkins = file.getCanonicalPath();
            System.err.println("zipkins ==>> " + zipkins);
            Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"dir && " + zipkins);
            Thread.sleep(10000);
        	
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
