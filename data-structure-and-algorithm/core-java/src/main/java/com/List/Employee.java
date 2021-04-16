package List;

public class Employee implements Comparable<Employee>{
	
	 	private int id = -1;
	    private String firstName = null;
	    private String lastName = null;
	    private int age = -1;
	 
	    public Employee(int id, String fName, String lName, int age) {
	        this.id = id;
	        this.firstName = fName;
	        this.lastName = lName;
	        this.age = age;
	    }
	    
	    
	 public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getFirstName() {
			return firstName;
		}


		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}


		public String getLastName() {
			return lastName;
		}


		public void setLastName(String lastName) {
			this.lastName = lastName;
		}


		public int getAge() {
			return age;
		}


		public void setAge(int age) {
			this.age = age;
		}

	 
	@Override
	public String toString() {
	
	return "Employee : "+id+" - "+firstName+" - "+lastName+" - "+age;
	}


	@Override
	public int compareTo(Employee o) {
		
		//by id
		return o.id - this.id;
		
		//by first name
		//return this.firstName.compareTo(o.firstName);
		
		//by last name
		//return this.lastName.compareTo(o.lastName);
		
		//by age
		//return this.age - o.age;
	}
	
}
