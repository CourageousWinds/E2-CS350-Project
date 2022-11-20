package edu.odu.cs.cs350.pne;


/*
 * Created 10/26 by cs_zelle001 for a starting point.
 */

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class NewWords {
    
public void main(String[] args) throws FileNotFoundException {

    HashMap<String, Integer> map = new HashMap<String, Integer>();

    Scanner txtFile = new Scanner(new File("/home/cs_jmill035/cs350Project/E2-CS350-Project/app/dataFiles/Test.txt"));
    while (txtFile.hasNext()){
        String word = txtFile.next();
        if (map.containsKey(word)){
            int count = map.get(word) + 1;
            map.put(word, count);
        }
        else{
            map.put(word, 1);
        }
    }
    txtFile.close();

    for (Map.Entry<String, Integer> entry: map.entrySet()){
        System.out.println(entry);
    }
}
}