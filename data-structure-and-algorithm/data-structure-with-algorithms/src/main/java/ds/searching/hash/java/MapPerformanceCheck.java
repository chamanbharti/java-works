package ds.searching.hash.java;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

public class MapPerformanceCheck {

	
		 public static void main(String[] args) {
//			 Map<Student, String> hashMap = new HashMap<Student, String>();
//			 Map<Student, String> hashMap2 = new LinkedHashMap<Student, String>();
//			 Map<Student, String> hashMap3 = new ConcurrentHashMap<Student, String>();
//			 Map<Student, String> hashMap4 = new Hashtable<Student, String>();
//			 Map<Student, String> hashMap5 = new WeakHashMap<Student, String>();
//			 Map<Student, String> hashMap6 = new IdentityHashMap<Student, String>();
//		         
//		        String s1 = "s";
//		         
//		            /*We are stating from index 10 to make sure that 
//		            hashCode values of Student object remains same
//		            and we get them in same bucket in HashMap */
//		        for(int i=10;i<15;i++)
//		        {
//		            Student s = new Student(201701,s1+i);
//		            hashMap.put(s, s.getStudentName());
//		        }
//		         
//		        System.out.println(hashMap);
		        
		        
		        /**
		         * Using HashMap
		         */
		         System.out.println( "Using plain hash map with balanced trees:" );
		          
		         HashMap stringMap = new HashMap();
		          
		         for( int i = 0; i < 100; ++i )
		         {
		              stringMap.put( "index_" + i, String.valueOf( i ) );
		         }
		          
		         stringMap.values().forEach( System.out::println );
		          
		         /**
		         * Using LinkedHashMap
		         */
		         System.out.println( "Using LinkedHashMap:" );
		          
		         LinkedHashMap linkedHashMap = new LinkedHashMap();
		          
		         for( int i = 0; i < 100; ++i )
		         {
		              linkedHashMap.put( "index_" + i, String.valueOf( i ) );
		         }
		          
		         linkedHashMap.values().forEach( System.out::println );
		    }
}
