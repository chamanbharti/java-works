package interview.company;

public class FinallyTest {
	public static int main(String[] args) {
		try {
			//return 10;//void method can't return a value
			//return;
		}catch(Exception e) {
			return 11;
			//return;
		}finally {
			return 12;
			//return;
		}
	}

}
