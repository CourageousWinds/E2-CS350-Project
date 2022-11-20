package edu.odu.cs.cs350.pne;

/*
 * Created 10/26 by cs_zelle001 for a starting point.
 */



import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Vocabulary {

    public static void main(String[] args) throws FileNotFoundException {

        HashMap<String, Integer> vocab = new HashMap<String, Integer>();
    
        Scanner txtFile = new Scanner(new File("/home/cs_jmill035/cs350Project/E2-CS350-Project/app/dataFiles/Test.txt"));
        while (txtFile.hasNext()){
            String word = txtFile.next();
            if (vocab.containsKey(word)){
                int count = vocab.get(word) + 1; 
                vocab.put(word, count);
            if (count >= 5)
            vocab.put(word, 1);
            
            if (count < 5)
                vocab.put(word, 0);
            }
        }
        txtFile.close();
    
        for (Map.Entry<String, Integer> entry: vocab.entrySet()){
            System.out.println(entry);
        }
    }
}
