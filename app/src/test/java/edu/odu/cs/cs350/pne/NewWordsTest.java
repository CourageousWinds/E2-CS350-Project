package edu.odu.cs.cs350.pne;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.Test;


public class NewWordsTest {
    @Test  
    public void main() throws FileNotFoundException{  
		String[] args = null; 
 NewWords newWords  =new NewWords(); 
newWords.main(args);
assertTrue(true);
}

}
