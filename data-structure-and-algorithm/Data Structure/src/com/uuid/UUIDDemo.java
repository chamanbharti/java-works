package com.uuid;

import java.util.UUID;

public class UUIDDemo {
	//total methods of UUID class are 14.
	public static void main(String[] args) {
		
		//creating uuid
		UUID x = UUID.fromString("38400000-8cf0-11bd-b23e-10b96e4ef00d");
		UUID xx = UUID.fromString("38400000-8cf0-11bd-b23e-10b96e4ef00d");
		
		//getting clock sequence value
		System.out.println("Clock sequence value: "+x.clockSequence());
		//UnsupportedOperationException -- This exception is thrown if this UUID is not a version 1 UUID.
		
		//comparing uuids
		System.out.println("Comparing two UUIDs: "+x.compareTo(xx));
		//Return Value
		//The method call returns -1, 0 or 1 as this UUID is less than, equal to, or greater than val.
		
		//checking equality
		System.out.println("Is two UUIDs equal: "+x.equals(xx));
		//Return Value
		//The method call returns true if the objects are the same otherwise false.
		
		//checking uuid value
		System.out.println("UUID value is: "+x+" and :"+xx);
		/*Return Value
		The method call returns a UUID with the specified value.
		Exception
		IllegalArgumentException:This exception is thrown if the name does not conform to the string representation as described in toString()*/
		
		//Checking least significant bits
		System.out.println("Least significant bits: "+x.getLeastSignificantBits());
		//Checking most significant bits
		System.out.println("Most significant bits: "+x.getMostSignificantBits());
		//Checking hash code value
		System.out.println("Hash Code Value of x: "+x.hashCode()+" and xx: "+xx.hashCode());
		
		//creating byte array
		byte[] nbyte = {10,20,30};
		//creating uuid from byte
		UUID uid = UUID.nameUUIDFromBytes(nbyte);
		//checking uuid value
		System.out.println("UUID Value from byte: "+uid);
		
		//checking node value
		System.out.println("Node Value of x is: "+x+" and xx: "+xx);
		/*Return Value
		The method call returns the node value of this UUID.
		Exception
		UnsupportedOperationException -- This exception is thrown if this UUID is not a version 1 UUID.*/
		
		//Checking the value of random uuid
		System.out.println("Random UUID Value: "+x.randomUUID());
		//Return Value
		//The method call returns a randomly generated UUID.
		
		//Checking time stamp value
		System.out.println("Time Stamp Value of x : "+x.timestamp()+" and xx: "+xx.timestamp());
		/*Return Value
		The method call returns the time stamp value associated with this UUID.
		Exception
		UnsupportedOperationException -- This exception is thrown if this UUID is not a version 1 UUID.*/
		
		//Checking string representation
		System.out.println("String Value: "+x.toString());
		//Return Value
		//The method call returns a string representation of this UUID.
		
		//Checking variant value
		System.out.println("Variant Value: "+x.variant());
		System.out.println("Variant Value: "+xx.variant());
		
		//Checking version value
		System.out.println("Version Value: "+x.version());
		System.out.println("Version Value: "+xx.version());
	}
	

}
