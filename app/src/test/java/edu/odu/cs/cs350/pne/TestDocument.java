package edu.odu.cs.cs350.pne;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
import org.junit.jupiter.api.Test;

public class TestDocument {

    @Test
    public void main(String[] args) throws FileNotFoundException{
        
        Map<String, int> wordMap = new Map<String, int>();

    }

    @Test
    public static Map<String, int>(){
        Map<String, int> mapText
            = new HashMap<String, int>();
            BufferedReader br = null;
            try {
                
                //File object
                File file = new File(filepath);

                // create BufferedReader obj from the File
                br = new BufferedReader(new FileReader(file));
                
                String line = null;
        
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            finally {
                //close bufferredReader
                if (br!= null) {
                    try {
                        br.close();
                    }
                    catch (Exception e){
                    };
                }
            }
        return mapText;
     }
    
}

    

