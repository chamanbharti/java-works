package reactive.section1;

import reactive.section1.assignment.FileService;
import reactive.util.Util;

public class Lec9Assignment {

	public static void main(String[] args) {
		/*
		// Approach I
		FileService.read("file1.txt")
		.subscribe(
				   Util.onNext(),
				   Util.onError(),
				   Util.onComplete()
				  );
		
		// Approach II
		FileService.read("file2.txt")
		.subscribe(
				   Util.onNext(),
				   Util.onError(),
				   Util.onComplete()
				  );
		*/
		
		/*
		// Approach III
		FileService.read("file3.txt")
		.subscribe(
				   Util.onNext(),
				   Util.onError(),
				   Util.onComplete()
				  );
		FileService.write("file3.txt", "This is file3");
		*/
		
		/*
		// Approach III
				FileService.read("file3.txt")
				.subscribe(
						   Util.onNext(),
						   Util.onError(),
						   Util.onComplete()
						  );
				/*
				FileService.write("file3.txt", "This is file3")
				.subscribe(
						   Util.onNext(),
						   Util.onError(),
						   Util.onComplete()
						);
				*/
		
		// Approach IV
				FileService.read("file3.txt")
				.subscribe(
						   Util.onNext(),
						   Util.onError(),
						   Util.onComplete()
						  );
				FileService.delete("file3.txt")
				.subscribe(
						   Util.onNext(),
						   Util.onError(),
						   Util.onComplete()
						 );
	}
}
