/*
 * Created 10/26 by cs_zelle001 for a starting point.
 */

 //Shared package for project.
package edu.odu.cs.cs350.pne;

//Necessary Libraries.
import java.io.IOException;
import java.io.FileInputStream;
import java.util.*;


public class Document {

    public static Map<String, Integer> documentMap(String[] args) throws IOException{

        //Going to Read the words into a Map
        Map<String, Integer> wordMap 
            =hashMapFromFile(args);

        //Iterate through Map
        for (Map.Entry<String,int> entry :
            wordMap.entrySet()){
                system.out.println(entry.getKey() + " : "
                 + entry.getValue());
            }

        return wordMap;
        
    }

    public static Map<String, int> hashMapFromFile(String filepath){
        Map<String, Integer> mapText
            = new HashMap<String, int>();
            BufferedReader br = null;

            try {
                
                //File object
                File file = new File(filepath);

                // create BufferedReader obj from the File
                br = new BufferedReader(new FileReader(file));

                String line = null;

                //Read line by line
                while ((line = br.readLine()) !=null) {
                    String [] piece = line.split(":");

                    //Assigning name/number
                    String name = piece [0].trim();
                    int number = piece [1].trim();

                    //put name/number in hashmap if not empty
                    if(!name.equals("") && !number.equals(""))
                        map.put(name, number);
                }
        
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
