package array;
class Array1
{
  public static void main(String[] args)
  {
   
	  //1st way
	  /*int a[] = new int[5];//declaration and instantiation

    a[0]=10;//initialization
    a[1]=20;
    a[2]=70;
    a[3]=40;
    a[4]=50;*/
    
	 //2nd way
	  int[] a = {10,20,70,40,50};
    //printing array
    for(int i=0;i<a.length;i++)//length is the property of array
    {
    	System.out.print(a[i]+" ");
    }

  
  }

}
//https://www.tutorialspoint.com/data_structures_algorithms/array_data_structure.htm