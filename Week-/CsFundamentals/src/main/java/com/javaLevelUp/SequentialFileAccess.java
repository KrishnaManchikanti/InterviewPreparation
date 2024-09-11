package com.javaLevelUp;

import java.io.*;

/**
 * Implement a Java program that demonstrates sequential file access by reading a text file line by line using BufferedReader.
 */
public class SequentialFileAccess {
    public static void main(String[] args) throws FileNotFoundException {
        try(BufferedReader bufferedReader = new BufferedReader(
                new FileReader("/Users/krishna/IdeaProjects/InterviewPreparation/CsFundamentals/src/main/resources/file.txt"))){
            String line;
            while ((line = bufferedReader.readLine())!=null){
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
