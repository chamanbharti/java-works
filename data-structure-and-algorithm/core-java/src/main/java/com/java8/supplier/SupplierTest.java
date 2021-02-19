package java8.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		
		// 1st
		Supplier<String> s = ()->{
			String[] s1 = {"Sunny","Bunny","Chinny","Pinny"};
			int x = (int)(Math.random()*4);
			return s1[x];
		};
		System.out.println(s.get());
//		System.out.println(s.get());
//		System.out.println(s.get());
		
		// 2nd
		Supplier<Date> supplier = ()-> new Date();
		System.out.println(supplier.get());
//		System.out.println(supplier.get());
//		System.out.println(supplier.get());
		
		//3rd
		Supplier<String> otps = ()->{
			String otp = "";
			for(int i=0;i<=6;i++) {
				otp = otp+(int)(Math.random()*10);
			}
			return otp;
		};
		System.out.println(otps.get());
//		System.out.println(otps.get());
//		System.out.println(otps.get());
		
		//4th
		Supplier<String>password = ()->{
			String symbols="ABCDEFGHIJKLMNOPQRSTUVWXYZ#$@";
			Supplier<Integer> d = ()-> (int)(Math.random()*10);
			Supplier<Character> c = ()-> symbols.charAt((int)(Math.random()*29));
			String pwd = "";
			for(int i=1;i<=8;i++) {
				if(i%2==0) {
					pwd = pwd+d.get();
				}else {
					pwd = pwd+c.get();
				}
			}
			return pwd;
		};
		System.out.println(password.get());
		
	}
}
