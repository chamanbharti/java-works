package com.basic.qeustions;
/*Can we run java class without main() method?

No, you can’t run java class without main method. 
But, there are some scenarios like if super class has main() method, 
then sub class can be run without defining main() method in it. For example, 
if you run class B in the below program, you will get 1 as output.
*/
class A{
	public static void main(String[] args)
    {
        System.out.println(1);
    }
}
public class MainMethod7 extends A {

}
//Note : Before Java 7, you can run java class by using static initializers. 
//But, from Java 7 it is not possible.