package com.generics;

public class ArrayList {
		public static void main(String[] args){
			java.util.ArrayList l= new java.util.ArrayList();
			l.add("durga");
			l.add("chaman");
			l.add(new Integer(10));//incompatible type
			String name1 = (String)l.get(0);
			String name2 = (String)l.get(1);
			String name3 = (String)l.get(2);//java.lang.ClassCastException
			System.out.println(l);
		}

}
