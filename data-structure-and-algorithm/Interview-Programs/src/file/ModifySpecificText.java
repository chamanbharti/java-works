package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ModifySpecificText {
	public static void main(String[] args) {
		
		modifyFile("D:/StudentFile.txt","85","95");
		System.out.println("Done");
	}
	
	static void modifyFile(String filePath, String oldString, String newString){
		File fileToBeModified = new File(filePath);
		String oldContent="";
		BufferedReader reader=null;
		FileWriter writer=null;
		try{
			reader=new BufferedReader(new FileReader(fileToBeModified));
			//reading all lines of input text file into oldContent
			String line=reader.readLine();
			while(line!=null){
				oldContent=oldContent+line+System.lineSeparator();
				line=reader.readLine();
			}
			//replacing oldString with newString in the oldContent
			String newContent=oldContent.replaceAll(oldString, newString);
			//rewriting the input text file with newContent
			writer=new FileWriter(fileToBeModified);
			writer.write(newContent);
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				//closing the resources
				reader.close();
				writer.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}

}
