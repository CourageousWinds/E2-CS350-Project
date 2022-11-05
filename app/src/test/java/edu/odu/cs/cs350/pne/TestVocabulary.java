package edu.odu.cs.cs350.pne;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
import org.junit.jupiter.api.Test;

public class TestVocabulary {
    
  @Test 
  public void main() throws FileNotFoundException{
    FileInputStream fin = new FileInputStream("Test.txt");
    try (Scanner fileInput = new Scanner(fin)) {
        ArrayList<String> words = new ArrayList<String>();
        ArrayList<String> count = new ArrayList<String>();
        String nextWord = fileInput.next();
        int index = words.indexOf(nextWord);
        assertEquals(index, words.indexOf(nextWord));
        assertEquals(nextWord, fileInput.next());
        assertEquals(index, count.get(index) + 1);
    }

  }

}
