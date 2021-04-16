package hibernate.ddl;

public class Test {

	public static void main(String[] args) {
		int sum = findNaturalSum(9);
		System.out.println(sum);
	}

	private static int findNaturalSum(int n) {
//		int sum = 0;
//		for(int i=1;i<=n;i++) {
//			sum = sum+i;
//		}
//		return sum;
		int sum = n*(n+1)/2;
		return sum;
	}
}
//1+2+3+3+4+5+6+7+8+9=18
