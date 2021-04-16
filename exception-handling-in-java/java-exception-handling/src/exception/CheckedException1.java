package exception;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CheckedException1 {

	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter("abc.txt");
		pw.print("Hello");
		pw.close();
		//System.out.println(10/0);
	}
}
