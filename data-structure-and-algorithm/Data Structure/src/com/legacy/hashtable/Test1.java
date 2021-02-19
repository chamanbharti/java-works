package com.legacy.hashtable;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;

class Temp{
	int i;
	Temp(int i){
		this.i=i;
	}
	public int hashCode(){
		return i;
		//return i%9;
	}
	public String toString(){
		return i+"";
	}
}
public class Test1 {

	public static void main(String[] args) {
		//Hashtable h=new Hashtable();
		HashMap h=new HashMap();
		//LinkedHashMap h=new LinkedHashMap();
		//WeakHashMap h = new WeakHashMap();
		//IdentityHashMap h = new IdentityHashMap();
		h.put(new Temp(5), "A");              
		h.put(new Temp(2), "B");
		h.put(new Temp(6), "C");
		h.put(new Temp(15), "D");
		h.put(new Temp(23), "E");
		h.put(new Temp(16), "F");
		h.put(null, "G");//NPE
		//h.put("chaman", null);//NPE
		System.out.println(h);//from top to bottom, from right to left
		//{6=C, 16=F, 5=A, 15=D, 2=B, 23=E} hashtable(11)
		//{16=F, 2=B, 5=A, 6=C, 23=E, 15=D} hashmap(16)
		//{5=A, 2=B, 6=C, 15=D, 23=E, 16=F} linkedhashmap(16)
		//{15=D, 23=E, 6=C, 5=A, 2=B, 16=F} weakhashmap(16)
		//{5=A, 6=C, 16=F, 23=E, 15=D, 2=B} IdentityHashMap(21)
	}
}
