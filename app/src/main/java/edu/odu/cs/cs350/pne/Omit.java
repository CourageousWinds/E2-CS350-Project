package edu.odu.cs.cs350.pne;
import java.io.IOException;
import java.io.FileInputStream;
import java.util.*;


public class Omit {

    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("/home/cs_ccox027/CS350/GroupProj/E2-CS350-Project/app/dataFiles/commonWords.txt");
        Scanner fileInput = new Scanner(fin);

        ArrayList<String> commonWordList = new ArrayList<String>();

        while (fileInput.hasNext()) {
            String nextCommonWord = fileInput.next();
            String currentDocWord = "";

            if (currentDocWord == nextCommonWord) {
                break; // Ends the function
            }
        }

        // Add word to signature
    }

}

// We need some kind of "library" of words to pull from. It is too time consuming to list all very common English words. I wonder if there is one out there somewhere?

// ** ALGORITHM **
// Even when I do find a library of words, there must be some kind of way to filter out common words from a document, preventing them from entering a signature.
// Simply having the list of common words isn't enough. How do we omit those words?
// Well, I imagine those common words would be part of some kind of array system perhaps... While the document is being "fed" into the "machine", it will scan and 
// process every single word, right?
// Each and every word scanned would be thrown into some function within the program that would compare it to the list of common words.
// If the scanned word matches one of those words, it won't get added at all. But if it doesn't, it will be thrown into the signature, since it is a word unique to the
// document.

// Algorithm proof of concept:
//
// function compareWord() {
// 
// for (int currentWord = 0; currentWord <= int totalInList; currentWord++) {
// 
//    if (thisWord == commonList(currentWord))   
//        break;  move to the next word in list
//  }
// addToSignature(currentWord)
// }

// Now it's a matter of understanding the code of the java file that is reponsible for extracting document words one at a time. My plan is each word will be filtered into 
// this "Omit" function to see if it's a common word or not. If the given extracted word is NOT a common word, it will be returned, stored as a value in the original function call.
// If it IS a common word, the word won't be returned at all.