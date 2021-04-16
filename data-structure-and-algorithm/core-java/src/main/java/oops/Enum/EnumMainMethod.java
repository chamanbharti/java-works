package oops.Enum;

//CT
//enum EnumMainMethod {
//	STAR, GUPPY, GOLD
//
//	public static void main(String[] args) {
//		EnumMainMethod[] b = EnumMainMethod.values();
//		for(EnumMainMethod o:b) {
//			System.out.println(o.ordinal()+":"+o);
//		}
//		
//	}
//
//}

// CT
//enum EnumMainMethod {
//	
//
//	public static void main(String[] args) {
//		EnumMainMethod[] b = EnumMainMethod.values();
//		for(EnumMainMethod o:b) {
//			System.out.println(o.ordinal()+":"+o);
//		}
//		
//	}
//	STAR, GUPPY, GOLD;
//
//}

//CT
//enum EnumMainMethod {
//	
//
//	public static void main(String[] args) {
//		EnumMainMethod[] b = EnumMainMethod.values();
//		for(EnumMainMethod o:b) {
//			System.out.println(o.ordinal()+":"+o);
//		}
//		
//	}
//	STAR, GUPPY, GOLD;
//
//}

//valid
//enum EnumMainMethod {
//	;
//	public static void main(String[] args) {
//	
//		System.out.println("hello");
//		
//	}
//
//}

//valid
//enum EnumMainMethod {
//	;
//}

//valid
//enum EnumMainMethod {
//	;
//
//}

//valid
//enum EnumMainMethod {
//	;
//	public void m1() {}
//}

enum EnumMainMethod {
	STAR, GUPPY, GOLD;
	public static void main(String[] args) {
	EnumMainMethod[] b = EnumMainMethod.values();
	for(EnumMainMethod o:b) {
		System.out.println(o.ordinal()+":"+o);
	}
  }
}