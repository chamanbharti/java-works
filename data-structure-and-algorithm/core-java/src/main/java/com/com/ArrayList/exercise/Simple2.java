package com.ArrayList.exercise;
import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;
public class Simple2 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(Integer.valueOf(201));
		al.add(Integer.valueOf(101));
		al.add(230);//internally will be converted into objects as Integer.valueOf(23)
		
		Collections.sort(al);
		Iterator<Integer> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
	

}
