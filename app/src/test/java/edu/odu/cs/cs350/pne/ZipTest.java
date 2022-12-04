package edu.odu.cs.cs350.pne;

import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;

public class ZipTest {
    @Test
    void unzip() throws IOException{
        new Zip().unzip(new File("/home/cs_jmill035/cs350Project/E2-CS350-Project/app/dataFiles/unzip Folder.zip"));
    }
}
