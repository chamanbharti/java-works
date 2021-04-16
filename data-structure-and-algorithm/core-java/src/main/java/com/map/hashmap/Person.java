package map.hashmap;

public class Person {
	
	private int id;
	private String name;
	
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object o) {

		if(o == null)
			return false;
		if(o == this)
			return true;
		if(getClass() != o.getClass())
			return false;
		Person p = (Person) o;
		return (this.getId() == p.getId());
	}
	
	@Override
	public int hashCode() {

		final int prime = 31;
		int result = 1;
		result = result * prime + getId();
		return result;
	}

}
