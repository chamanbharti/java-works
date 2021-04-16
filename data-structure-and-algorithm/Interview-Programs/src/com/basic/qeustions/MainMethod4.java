package com.basic.qeustions;
/*
 Why main() method must be static?

Suppose, If main() is allowed to be non-static, 
then while calling the main method JVM has to instantiate it’s class. 
While instantiating it has to call constructor of that class. 
There will be an ambiguity if constructor of that class takes an argument. 
For example, 
In the below program what argument JVM has to pass while instantiating class “MainMethod”?. 
 */
public class MainMethod4 {
	
	public MainMethod4(int i)
    {
        //Constructor taking one argument
    }
 
    public void main(String[] args)
    {
        //main method as non-static
    }
	
//That’s why main() method must be static.
}
