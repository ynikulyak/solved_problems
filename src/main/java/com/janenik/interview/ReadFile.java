package com.janenik.interview;

import com.google.common.base.Preconditions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;

/**
 * Created by jane on 9/27/17.
 */
public class ReadFile {

    public void readWithFileInputStream(File file){
        Preconditions.checkNotNull(file);

        try {
            FileInputStream fis = new FileInputStream(file);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String line = null;

            while((line = br.readLine()) != null){
                System.out.println(line);
            }

        }catch(IOException ioe){

        }
    }

    public void readWithFileReader(File file) throws IOException{

        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = null;

        while((line = br.readLine()) != null){
            System.out.println(line);
        }
    }

    public void readWithLambda(File file) throws IOException{
        Files.lines(new File("text.txt").toPath())
                .map(s -> s.trim())
                .filter(s -> s.startsWith("abc"))
                .forEach(System.out::println);
    }

}
