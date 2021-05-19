package com.xlsx;

import java.util.List;

class Helper {
    public static <T> T[] toArray(List<T> list) {
        T[] array = (T[]) new Object[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}
public class GenericToList {

	public static void main(String[] args) {
		
	}
}
