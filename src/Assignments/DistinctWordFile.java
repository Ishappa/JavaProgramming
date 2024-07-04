package Assignments;

//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.LinkedHashSet;
//import java.util.Scanner;
//import  java.util.Set;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class DistinctWordFile {

    public static List<String> findDistinctWords(String filePath) {
        List<String> distinctWords = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            Set<String> wordSet = new HashSet<>(); // Use a set to ensure uniqueness

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+"); // Split the line into words
                for (String word : words) {
                    wordSet.add(word.toLowerCase()); // Convert to lowercase to make it case-insensitive
                }
            }

            distinctWords.addAll(wordSet); // Add unique words to the list
        } catch (IOException e) {
            e.printStackTrace();
        }

        return distinctWords;
    }

    public static void main(String[] args) {
        String filePath = "D:\\Jspiders\\dummy.txt"; // Replace with the path to your text file

        List<String> distinctWords = findDistinctWords(filePath);

        System.out.println("Distinct words in the file:");
        for (String word : distinctWords) {
            System.out.println(word);
        }
    }
}

//    public static void main(String[] args) {
//        try{
//            File f= new File("D:\\Jspiders\\dummy.txt");
//            Scanner ip=new Scanner(f);
//            ip.useDelimiter(" ");
//            Set s= new LinkedHashSet();
//            while (ip.hasNext()){
//                s.add(ip.next());//it will call useDelimiter()
//            }
//            System.out.println(s);
//        }
//        catch (FileNotFoundException e ){
//            System.out.println("Exception thrown");
//        }
//    }

