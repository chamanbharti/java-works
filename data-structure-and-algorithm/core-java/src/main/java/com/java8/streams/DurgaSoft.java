package java8.streams;

interface Interf{
	public int square(int n);
}
public class DurgaSoft {

	public static void main(String[] args) {
		Interf a = n->n*n;
		System.out.println( a.square(4));
	}

}
