package set;

import java.util.Comparator;

public class MyComparator2 implements Comparator{
	public int compare(Object obj1,Object obj2){
		
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
		//return i1.compareTo(i2);//[0, 5, 10, 15, 20] default natural sorting or ascending order
		//return -i1.compareTo(i2);//[20, 15, 10, 5, 0] descending order
		//return i2.compareTo(i1);//[20, 15, 10, 5, 0] descending order
		//return -i2.compareTo(i1);//[0, 5, 10, 15, 20] Ascending order
		//return +1;// [10, 0, 15, 5, 20, 20, 5, 10] insertion order
		//return -1; //[10, 5, 20, 20, 5, 15, 0, 10] reverse of insertion order
		return 0; //[10] only first element will be inserted all remaining elements are considered as duplicate
	}

}
