package duplicate;

public class String3 {

	public static void main(String[] args) {
		
		String str = "Chaman";
		int count = 0;
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i] == ch[j]) {
					System.out.println(ch[j]);
					count++;
					break;
				}
			}
		}
		
		System.out.println("Total duplicate letter:"+count);
	}
}
