package com.oops.nestedclass;
/** Nested class is HAS-A relation not Is-A relation
 * What is an inner class?
 * A class/interface/enum/annotation that is define inside another class/interface/enum/annotation is called inner class
 * @author Chaman.Bharti
 *
 */
/**
public class Example {

	class A{}
	interface I{}
	enum E{}
	@interface ann{}
}

interface Sample {

	class A{}
	interface I{}
	enum E{}
	@interface ann{}
}

enum Abc {
	;
	class A{}
	interface I{}
	enum E{}
	@interface ann{}
}

@interface Annotation {

	class A{}
	interface I{}
	enum E{}
	@interface ann{}
}

*/
/**
 * A inner class is used for create inner object of an outer object
 * Inner class creates Has-A relation objects of an outer object
 * @author Chaman.Bharti
 *
 */
/*
class Car {//object
	class Engine {}//inner object
}
class Person{
	class Heart{}
}
class BankAccount{
	class ATMCard{}
}
*/
/**
 * What is the difference between inner class and outer class with HAS-A relation?
 * 
 * What is the advantage of inner class over outer class with HAS-A relation?
 * 1. In outer class creation we must create separate java file, number of java files are increasing
 * 2. In outer class creation the code is not visible because it  is placed in other java file.
 * 3. In outer class creation the private members of one class can not be accessed from other class 
 * we need to getter and setter methods and lot constructor wise wiring code we need to develop
 * 
 * To solve above problems we must use inner classes
 * 
 * When we must not use inner class?
 * We must not use inner class,
 * we must use create this object by using an outer  class and must access and reuse  this  outer class by using instance variable.
 * If you want to use an object only in one object
 * it is  recommended to create this object by using inner class
 */
/*
class Student {
	class Address{}
}
class Employee{
	class Address{}
}
*/
/*
class Student {
	Address add;
}
class Employee{
	Address add;
}
class Address{}
*/


//without inner class
/*
class Petrol{
	void consume() {}
}
class Car{
	private Petrol petrol;
	private Engine engine;
	Car(Engine engine){
		this.engine = engine;
	}
	void start() {
		engine.start();
	}
}
class Engine{
	private Car car;
	Engine(Car car){
		this.car=car;
	}
	void start() {
		car.petrol.consume();
	}
}
*/

//with inner class
/*
class Petrol{
	void consume() {}
}
class Car{
	private Petrol petrol;
	
	class Engine{
		
		private void start() {
			petrol.consume();
		}
	}
	void start() {
		Engine engine = new Engine();
		engine.start();
	}
}
*/

/**
	Types of inner(nested) class
	Java supports 4 types of inner classs
	1. static inner  class  ---> Nested class or static nested class
	2. non-static inner class-->inner class or member class or normal or  regular inner class
	3. local inner class  ----->local inner class or Method local Inner class
	4. anonymous inner class---> anonymous class
*/
/*
class Sample{}
interface I1{}
class Example{
	static class A{} //SIC is meant  for creating inner object of an outer object
	class B{}		 //NIC is meant for creating inner object of an outer object
	void m() {
		class C{}    //LIC is meant for creating inner object of an operation
		
		{} 			 //AIC is meant for extending a class or implementation an interface
					 //AIC is meant for creating a sub type of a class or an interface
		
		new Sample(){}; //anonymous class
		new Thread() {};//anonymous class
		new Sample(); //it is not anonymous class it is  object of sample class
		//new I1();//CT
		new I1() {};//anonymous class
	}
}*/
