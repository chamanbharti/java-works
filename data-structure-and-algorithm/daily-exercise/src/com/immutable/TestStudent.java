package com.immutable;

public class TestStudent {
    public static void main(String args[])
    {
        Student s = new Student("ABC", 101);
        System.out.println(s.name);
        System.out.println(s.regNo);
 
        // Uncommenting below line causes error
        s.regNo = 102;
    }
}
