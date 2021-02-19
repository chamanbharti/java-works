package design_pattern.creational.singleton;

import javax.management.RuntimeErrorException;

/*
  //step I
class DatabaseLayer{
	private static volatile DatabaseLayer db = new DatabaseLayer();
	private DatabaseLayer() {}//2nd object creation is possible through reflection
	
	public static DatabaseLayer getDBInstance() {
		return db;
	}
}
*/

//step II
class DatabaseLayer{
	private static volatile DatabaseLayer db ;
	private DatabaseLayer() {
		if(db != null) {
			throw new RuntimeException("get your object by getDBInstance()");//it breaks reflection
		}
	}
	
	public static DatabaseLayer getDBInstance() {
		if(db == null) {
			db = new DatabaseLayer();
		}
		return db;
	}
}
public class Singleton0 {

	public static void main(String[] args) {
		DatabaseLayer db = DatabaseLayer.getDBInstance();
		System.out.println(db);
		DatabaseLayer db2 = DatabaseLayer.getDBInstance();
		System.out.println(db2);	
	}
}
