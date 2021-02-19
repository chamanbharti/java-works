package file.io.File;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		
		//constructor of File class
//		File file1 =new File(String name);
		// to represent resource in cwd
		// creates a java file object to represent name of specified file or directory present in cwd
		
//		File file1 =new File(String subdir, String name)
		// creates a java file object to represent name of the file or directory present in specified directory.

//		File file1 =new File(uri)
		//create a file
//		File file = new File("abc.txt");
//		System.out.println(file.exists());
//		file.createNewFile();
//		System.out.println(file.exists());
		
		//create director
//		File file = new File("abcd");
//		System.out.println(file.exists());
//		file.mkdir();
//		System.out.println(file.exists());
		
		//create a file named with abc.txt in cwd
//		File file = new File("demo.txt");
//		file.createNewFile();
		
		//create a directory name with chaman in cwd and create a file named with bharti.txt in that directory
//		File file = new File("chaman2");
//		file.mkdir();
//		File file2 = new File("chaman2", "bharti2.txt");
//		//File file2 = new File(file,"bharti.txt");
//		file2.createNewFile();
		
		//create a file named with roshan.txt in E:/xyz folder
//		File file = new File("D:\\java_works","roshan.txt");
//		//file.mkdir();
//		file.createNewFile();
		
		//To display names of our files and directories present in D:\java_works
//		File file = new File("D:\\java_works_2020");
//		String[] s= file.list();
//		int count = 0;
//		for(String s1: s) {
//			count++;
//			System.out.println(s1);
//		}
//		System.out.println("The total number:"+count);
		
		//display only files
//		File file = new File("D:\\java_works_2020");
//		String[] s= file.list();
//		int count = 0;
//		for(String s1: s) {
//			File f = new File(file,s1);
//			if(f.isFile()) {
//				count++;
//				System.out.println(s1);
//			}
//		}
//		System.out.println("The total number:"+count);
		
		//display only directories
		File file = new File("D:\\java_works_2020");
		String[] s= file.list();
		int count = 0;
		for(String s1: s) {
			File f = new File(file,s1);
			if(f.isDirectory()) {
				count++;
				System.out.println(s1);
			}
		}
		System.out.println("The total number:"+count);
	}

}
