package com.cg.eauction.config;

import java.io.File;

import org.springframework.core.io.ClassPathResource;

public class StartingServices {

    public static final String FILENAME = "zipkin-server-2.21.1-exec.jar";
    public static final String PATH = "cd C:\\Study\\";

    public static void main(String[] args) {

        try {
            File file = new ClassPathResource(FILENAME).getFile();
            String path = "cd " + file.getCanonicalPath();
            path = path.replace(file.getName(), "");
            System.err.println("path ==>> " + path);
            String zipkins = path + " && java -jar " + FILENAME;
            System.err.println("zipkins ==>> " + zipkins);
            Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"dir && " + zipkins);
            Thread.sleep(10000);
        	
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
