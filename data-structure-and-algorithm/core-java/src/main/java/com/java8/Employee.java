package java8;

public class Employee{
	
	 	private int id;
	    private String firstName;
	    private String lastName;
	    private int age = -1;
	 
	    public Employee(Integer id, String firstName, String lastName, Integer age){
	        this.id = id;
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.age = age;
	    }
	     
	    //Other getter and setter methods
	     
		public int getId() {
			return id;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
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
	
}
