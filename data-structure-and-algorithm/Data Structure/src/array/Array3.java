package array;
class Array3
{

  static void min(int[] a) {
	  int min=a[0];
	  for(int i=1;i<a.length;i++) {
		  if(min>a[i]) {
			  min=a[i];
		  }
	  }
	  System.out.println("Min:"+min);
  }
  static void max(int a[]) {
	  int max = a[0];
	  for(int i=1;i<a.length;i++) {
		  if(max<a[i]) {
			  max=a[i];
		  }
	  }
	  System.out.println("Max:"+max);
  }

  public static void main(String[] args)
  {
    
   int[] a = {10,20,70,40,50};
   min(a);//passing array in the method
   max(a);
  }

}