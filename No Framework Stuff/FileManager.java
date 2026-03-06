package TestIcons;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import jdk.jfr.events.FileWriteEvent;

class FileManager {
    public static String getText(File fileObj){
        String temp = "";
        try{
            
        // create file reader 
        FileReader file  = new FileReader(fileObj);
        // buffer reader for file 
        BufferedReader reader = new BufferedReader(file);
        // read all lines 
                try {
                    temp = reader.readLine();
                    while(temp != null){ // read the whole text of the file 
                        System.out.printf(temp);
                        temp = reader.readLine();
                    }
                    return temp;
                }catch(IOException d){
                    return "0";
                }
        //return result 
        }catch(FileNotFoundException e){
            return "0";
        }
    }
    public static void createFile(File  fileObj , String text){
        try{
            BufferedWriter writter = new BufferedWriter(new FileWriter(fileObj));
	    writter.write(text);
	    writter.close();
	}catch(IOException e){
	}
    }
}