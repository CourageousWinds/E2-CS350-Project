/*
 * Created 10/26 by cs_zelle001 for a starting point.
 */

package edu.odu.cs.cs350.pne;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Vocabulary {

    public void main(String[] args) throws FileNotFoundException {

        HashMap<String, Integer> vocab = new HashMap<String, Integer>();
    
        Scanner txtFile = new Scanner(new File("/home/cs_jmill035/cs350Project/E2-CS350-Project/app/dataFiles/Test.txt"));
        while (txtFile.hasNext()){
            String word = txtFile.next();
            if (vocab.containsKey(word)){
                int count = vocab.get(word); 
                vocab.put(word, count);
            }
            else{
                vocab.put(word, 0);
            }
        }
        txtFile.close();
    
        for (Map.Entry<String, Integer> entry: vocab.entrySet()){
            System.out.println(entry);
        }
    }
}
