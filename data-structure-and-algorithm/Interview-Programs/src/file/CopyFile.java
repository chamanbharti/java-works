package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
//read more programs http://javaconceptoftheday.com/copy-a-file-in-java/
public class CopyFile {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		File sourceFile = new File("D:/SourceFile.txt");
		File destinationFile=new File("D:/DestinationFile.txt");
		
		//1 method
		/*FileInputStream inStream=null;
		FileOutputStream outStream=null;
		
		try{
			inStream = new FileInputStream(sourceFile);
			outStream = new FileOutputStream(destinationFile);
			byte[] buffer=new byte[1024];
			int length;
			while( (length = inStream.read(buffer))!=-1){
				outStream.write(buffer, 0, length);
			}
		}catch(IOException e){
			e.printStackTrace();
		}
		finally{
			try{
				inStream.close();
				outStream.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}*/
		
		//2 method
		/*try {
			Files.copy(sourceFile.toPath(), destinationFile.toPath());
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		
		//3 method
		FileChannel sourceChannel=null;
		FileChannel destinationChannel=null;
		try{
			sourceChannel = new FileInputStream(sourceFile).getChannel();
            
			destinationChannel = new FileOutputStream(destinationFile).getChannel();
             
            //    sourceChannel.transferTo(0, sourceChannel.size(), destChannel);
             
            //OR
             
            destinationChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
		}catch(IOException e){
			e.printStackTrace();
		}
		System.out.println("Success");
		
	}
}
