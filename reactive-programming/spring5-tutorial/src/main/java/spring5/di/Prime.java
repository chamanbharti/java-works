package spring5.di;

import java.util.HashSet;
import java.util.Set;

class Emp {

int id;
String name;
public Emp(int id,String name) {
	this.id=id;
	this.name=name;
}

@Override
public int hashCode() {
//	final int prime = 31;
//	int result = 1;
//	result = prime * result + id;
//	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return 100;
}

@Override
public boolean equals(Object obj) {
//	if (this == obj)
//		return true;
//	if (obj == null)
//		return false;
//	if (getClass() != obj.getClass())
//		return false;
//	Emp other = (Emp) obj;
//	if (id != other.id)
//		return false;
//	if (name == null) {
//		if (other.name != null)
//			return false;
//	} else if (!name.equals(other.name))
//		return false;
	return true;
}


}
public class Prime {

		public static void main(String[] args) {
			
			Emp e1 = new Emp(1,"A");
			Emp e2 = new Emp(2,"B");
			Emp e3 = new Emp(1,"C");
			Set<Emp> hs = new HashSet<>();
			hs.add(e1);
			hs.add(e2);
			hs.add(e3);
			System.out.println(hs.size());
		}
}
