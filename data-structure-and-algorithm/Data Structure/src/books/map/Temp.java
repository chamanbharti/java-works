package books.map;

class Temp{
	
	int i;
	
	Temp(int i){
		this.i=i;
	}
	
	//I
	/*public int hashCode() {
		return i;
	}*/
	
	//II
	public int hashCode() {
		//return i % 9;
		return i;
	}
	
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		else if(o == null || getClass() != o.getClass() || !(o instanceof Temp)) {
			return false;
		}
		else
		{
			Temp t = (Temp)o;
			return this.i == t.i;
		}
	}
	public String toString() {
		return i+""; //return i in string form
	}
	
}
