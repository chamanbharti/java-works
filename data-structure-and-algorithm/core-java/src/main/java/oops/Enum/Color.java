package oops.Enum;

//public enum Color {
//	BLUE, RED, GREEN;
//	public void info() {
//		System.out.println("Universal Color");
//	}
//}

public enum Color {
	BLUE, RED{
		public void info() {
			System.out.println("Dangerous Color");
		}
	}, GREEN;
	public void info() {
		System.out.println("Universal Color");
	}
}
