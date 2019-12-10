package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class ReadFileLineByLineUsingBufferedReader {


    public static void main(String[] args) {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(
                    "\\Users\\user\\Desktop\\file.txt"));

            reader.readLine();
            String line1=null;
            while ((line1 = reader.readLine()) != null) {

               String replacedWord= line1.replaceAll("naveet50", "abc@gmail.com");
                System.out.println(replacedWord);


            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

