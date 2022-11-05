/*
 * Created 10/26 by cs_zelle001 for a starting point.
 */

package edu.odu.cs.cs350.pne;
import java.io.IOException;
import java.io.FileInputStream;
import java.util.*;

public class Vocabulary {
    public static void main(String[] args) throws IOException{
        // Create the input stream and scanner
        FileInputStream fin = new FileInputStream("Test.txt");
        Scanner fileInput = new Scanner(fin);
        // Create the arrayList
        ArrayList<String> words = new ArrayList<String>();
        ArrayList<String> count = new ArrayList<String>();

        // Reads through the file and finds the words
        while(fileInput.hasNext()){
            // Finds the next word in the file
            String nextWord = fileInput.next();
            // Determines if word is already in the array
            if(words.contains(nextWord)){
                int index = words.indexOf(nextWord);
                count.set(index, count.get(index) + 1);
            }
            else{
                words.add(nextWord);
                count.add(1, nextWord);
            }
        }
        // Closes the file
        fileInput.close();
        fin.close();

        for(int i = 0; i < words.size(); i++){
            System.out.println(words.get(i) + " occured " + count.get(i) + "time(s)");
        }
    }
}
