package com.section1.lld.solid.d;


public class DependencyInversion {
/*
 * High-level modules should not depend on low level modules.
 * Both should depend on abstractions.
 * Abstractions should not depend on details. Details should depend on abstraction
 */
}
class Desktop{
	/*
	private Monitor monitor;
	private QwertyKeyBoard keyboard;
	
	// tightly couple dependency injection
	public Desktop() {
		this.monitor = new Monitor();
		this.keyboard = new QwertyKeyBoard();
	}
	
	//loosely couple dependency injection
	public Desktop(QwertyKeyBoard keyboard, Monitor monitor) {
		this.monitor = monitor;
		this.keyboard = keyboard;
	}
	*/
	
	//using abstraction 
	private Monitor monitor;
	private Keyboard keyboard;
	//we can use more generic way using abstraction and pass any keyboard
	public Desktop(Keyboard keyboard, Monitor monitor) {
		this.monitor = monitor;
		this.keyboard = keyboard;
	}
	
}
//class Monitor{}
//class QwertyKeyBoard{};


interface Keyboard{}
class Monitor{}
class QwertyKeyBoard implements Keyboard{};
