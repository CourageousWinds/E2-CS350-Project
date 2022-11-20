package edu.odu.cs.cs350.pne;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.tika.Tika;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.pdf.PDFParser;
import org.apache.tika.sax.BodyContentHandler;
import org.apache.tika.Tika;

public class ExtractPDF {
    BodyContentHandler handler = new BodyContentHandler(writeLimit: -1);
    Metadata metadata = new Metadata();
    ParseContext pcontext = new ParseContext();
    FileInputStream inputStream;
    PDFParser pdfParser = new PDFParser();

    public void importPDF(String filepath) throws FileNotFoundException {
        inputStream = new FileInputStream(new File(filepath));
        try{
            pdfParser.parse(inputStream, handler, metadata, pcontext);
            System.out.printIn(handler.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (TikaException e) {
            e.printStackTrace();
        }
    }
    
    public String getDocumentText() {
        return handler.toString();
    }

    public Map<String, String> getMetadata(){
        String[] metadatanames = metadata.names();
        Map<String, String> metamap = new HashMap<>();
        for (String name: metadatanames){
            metamap.put(name, metadata.get(name));
        }
        return metamap;
    }
}