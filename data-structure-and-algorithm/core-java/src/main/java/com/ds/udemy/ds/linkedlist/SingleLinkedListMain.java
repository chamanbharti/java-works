package com.ds.udemy.ds.linkedlist;

public class SingleLinkedListMain {

	public static void main(String[] args) {
		SingleLinkedList list = new SingleLinkedList();
		list.createSingleLinkedList(5);
		list.traverseLinkedList();
		list.searchNode(5);
		

		list.deleteLinkedList();
		list.traverseLinkedList();
	}
}
