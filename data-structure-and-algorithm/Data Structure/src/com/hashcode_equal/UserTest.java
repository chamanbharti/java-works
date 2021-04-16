package com.hashcode_equal;

import java.util.Objects;

class User {
	
	private String name;
    private int age;
    private String passport;
    
	public User(String name, int age, String passport) {
		super();
		this.name = name;
		this.age = age;
		this.passport = passport;
	}
	//getters and setters, constructor
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPassport() {
		return passport;
	}
	public void setPassport(String passport) {
		this.passport = passport;
	}
	/*public boolean equals(Object o){
		if(o == null){
			return false;
		}
		if(this == o){
			return true;
		}
		if(getClass() != o.getClass()){
			return false;
		}
		if(!(o instanceof User)){
			return false;
		}
		User user=(User)o;
		return this.age == user.getAge();
	}
	public int hashCode(){
		final int prime=31;
		int result=1;
		result = result * prime +getAge();
		return result;
	}*/
	@Override
    public boolean equals(Object o) {

        if (o == this) 
        	return true;
        if (!(o instanceof User)) {
            return false;
        }

        User user = (User) o;

       // return user.name.equals(name) && user.age == age && user.passport.equals(passport);
        //JDK 7 you can use the new Objects class to generate the equals & hash code values
        return age==user.age && 
        		Objects.equals(name, user.name) && Objects.equals(passport, user.passport);
    }

    //Idea from effective Java : Item 9
    @Override
    public int hashCode() {
        /*int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + age;
        result = 31 * result + passport.hashCode();
        return result;*/
    	//using java1.7
    	return Objects.hash(name,age,passport);
    }
  
}
public class UserTest{
	public static void main(String[] args) {
		User user1 = new User("mkyong", 35, "111222333");
	    User user2 = new User("mkyong", 35, "111222333");
	    
	    System.out.println(user1.equals(user2));//false
	}
}
