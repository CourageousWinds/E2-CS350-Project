package edu.odu.cs.cs350.pne;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Zip {

    public static void unzip(File zippedFile) throws IOException{

    new File("/home/cs_jmill035/cs350Project/E2-CS350-Project/app/dataFiles/unzip Folder.zip");
    byte[] buffer = new byte[2048];
    ZipInputStream zis = new ZipInputStream(new FileInputStream(zippedFile));
    ZipEntry zipEntry = zis.getNextEntry();

    while (zipEntry != null){
        if(zipEntry.isDirectory()){
        continue;
    }
 
    else {
        File newFile = new File("/home/cs_jmill035/cs350Project/E2-CS350-Project/app/dataFiles/" + zipEntry.getName());
        FileOutputStream fos = new FileOutputStream(newFile);
        int len;

    while((len = zis.read(buffer)) > 0){
        fos.write(buffer, 0, len);
    }
    fos.close();
}
zipEntry = zis.getNextEntry();
    }
    zis.closeEntry();
    zis.close();
}
}
