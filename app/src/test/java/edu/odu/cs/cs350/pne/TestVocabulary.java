package edu.odu.cs.cs350.pne;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
import org.junit.jupiter.api.Test;
import org.junit.Test;
import org.apache.log4j.Logger;

public class TestVocabulary {
    
  @Test 
  public void main() throws FileNotFoundException{
    try {
			log.info("Starting execution of main");
 String[] args = null; 
;
 ;
 Vocabulary vocabulary  =new Vocabulary(); 
vocabulary.main( args);
assertTrue(true);

		} catch (Exception exception) {
			log.error("Exception in execution ofmain-"+exception,exception);
			exception.printStackTrace();
			assertFalse(false);
		}
    }  
}
