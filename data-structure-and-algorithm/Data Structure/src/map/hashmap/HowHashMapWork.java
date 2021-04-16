package map.hashmap;

import java.util.HashMap;
import java.util.Hashtable;

class Tem{
	int i;
	public Tem(int i){
		this.i = i;
	}
	public int hashCode(){
		//return i;
		//return i%9;
		return i;
	}
	public String toString(){
		return i+"";
	}
}
public class HowHashMapWork {
	
	public static void main(String[] args) {
		//Hashtable<Tem,String> h = new Hashtable<>();//size is 11
		HashMap<Tem,String>h=new HashMap<>();
		//Hashtable h = new Hashtable(25);//size is 11
		h.put(new Tem(5), "A");//will store 5 no bucket like 5=A
		h.put(new Tem(2), "B");// 2=B		e.g 2=B in 2 no bucket
		h.put(new Tem(6), "C");//6=C		e.g 6=C in 6 no bucket
		h.put(new Tem(15), "D");// 15%11=4 e.g 15=D in 4 no bucket
		h.put(new Tem(23), "E");//23%11=1  e.g 23=E in 1 no bucket
		h.put(new Tem(16), "F");//16%11=5  e.g 16=F in 5 no bucket
		h.put(new Tem(32), "F");
		//h.put("Chaman", null);//NullPointerException
		//h.put(null,"Chaman");
		
		//hashmap entry will print (From Top to Botton, From Right to Left)
		System.out.println(h);//{}
	}

}
//{16=F, 15=D, 6=C, 23=E, 5=A, 2=B} using i%9
//{23=E, 16=F, 15=D, 6=C, 5=A, 2=B} using Hashtable(25)