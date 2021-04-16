package com.file.io.FileReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {
		System.out.println("Reading from properties file");
        System.out.println("-----------------------------");
        Properties prop = readPropertiesFile("file.properties");
 
        System.out.println("host : " + prop.getProperty("host"));
        System.out.println("username : " + prop.getProperty("username"));
        System.out.println("password : " + prop.getProperty("password"));
        System.out.println("-----------------------------");
	}
	public static Properties readPropertiesFile(String fileName) throws IOException {
        FileInputStream fis = null;
        Properties prop = null;
        try {
            fis = new FileInputStream(fileName);
            // create Properties class object
            prop = new Properties();
            // load properties file into it
            prop.load(fis);
 
        } catch (FileNotFoundException e) {
 
            e.printStackTrace();
        } catch (IOException e) {
 
            e.printStackTrace();
        } finally {
            fis.close();
        }
 
        return prop;
    }
}
