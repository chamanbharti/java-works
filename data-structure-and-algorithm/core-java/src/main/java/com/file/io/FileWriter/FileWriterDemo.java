package file.io.FileWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
//		FileWriter fw = new FileWriter("test.txt");
//		fw.append('A');
//		fw.append("BCD");
//		fw.append("LUND", 3, 4);
//		fw.flush();
//		fw.close();
		
//		File file = new File("test.txt");
//		FileWriter fw2 = new FileWriter(file);
//		fw2.append('Y');
//		fw2.append("Zz");
//		fw2.flush();
//		fw2.close();
		// above code will override of existing data
		
//		FileWriter fw2 = new FileWriter("test.txt", true);
//		fw2.append('Y');
//		fw2.append("Zsdfdz\nchaman\nbharti");
//		fw2.flush();
//		fw2.close();
		
//		File file = new File("test.txt");
//		FileWriter fw2 = new FileWriter(file, true);
//		fw2.append('Y');
//		fw2.append("Zsdfdz\nchaman");
//		fw2.flush();
//		fw2.close();
		// above code will append of existing data
		
		//method of filewriter
		//FileWriter fw = new FileWriter("chaman.txt");//not overriding
		FileWriter fw = new FileWriter("chaman.txt", true);//overriding
		fw.write(67);
		fw.write("haman\nBharti");
		fw.write('\n');
		char[] ch = {'a','b','c'};
		fw.write(ch);
		fw.flush(); 
		fw.close();
		
//		File file = new File("test.txt");
//		FileWriter fw2 = new FileWriter(file, true);
//		fw2.write(65);
//		char[] ch= {66,67};
//		fw2.write(ch);
//		//fw2.write(ch, off, len);
//		fw2.flush();
//		fw2.close();
		
	}

}
