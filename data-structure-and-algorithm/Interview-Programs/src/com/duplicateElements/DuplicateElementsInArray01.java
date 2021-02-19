package com.duplicateElements;

public class DuplicateElementsInArray01 {
	public static void main(String[] args) {
		int countArr=1;
		int countS=1;
		int arr[]={1,2,3,5,6,2,1};
		String s[]={"chaman","bharti","chaman","sahil"};
		
		int x=arr.length-1;
		int xx=s.length;
		String duplicat="";
		
		for(int i=1;i<x;i++){
			for(int j=i+1;j<x;j++){
				if(arr[i]==arr[j]){
					countArr++;
				}
			}
		}
		
		System.out.println("There are: "+countArr+" duplicate numbers in the given integer array");
		for(int i=0;i<xx;i++){
			for(int j=i+1;j<xx;j++){
				if(s[i].equals(s[j])){
					countS++;
					duplicat=duplicat+s[i];
				}
			}
		}
		System.out.println("Duplicate words:"+duplicat+" has comes: "+countS+" times in the given String array");
	}

}
