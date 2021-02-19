package java8.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class UserTest {

	public static void main(String[] args) {
		Predicate<User>p = u->u.userName.equals("durga")&& u.password.equals("java");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user name:");
		String username = sc.next();
		System.out.println("Enter password:");
		String pwd = sc.next();
		User user = new User(username,pwd);
		sc.close();
		if(p.test(user)) {
			System.out.println("Valid user and can avail all services");
		}else {
			System.out.println("invalid user you cannot avail services");
		}
		
	}
}
