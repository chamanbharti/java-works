package com.ds.map;

public class Node<K, V> {
	
	private Node<K, V> next;
	private final K key;
	private V value;
	
	public Node(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public Node<K, V> getNext() {
		return next;
	}

	public void setNext(Node<K, V> next) {
		this.next = next;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public K getKey() {
		return key;
	}
}
