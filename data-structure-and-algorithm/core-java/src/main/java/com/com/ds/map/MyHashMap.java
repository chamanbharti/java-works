package com.ds.map;

public class MyHashMap<K, V> {
	private int DEFAULT_BUCKET_COUNT = 10;
	private Node<K, V>[] buckets;

	public MyHashMap() {
		buckets = new Node[DEFAULT_BUCKET_COUNT];
	}// end of MyHashMap constructor

	public MyHashMap(int capacity) {
		buckets = new Node[capacity];
	}// end of MyHashMap constructor(1 param)

	public V get(K key) {
		throwIfKeyNull(key);
		Node<K, V> entry = buckets[bucketIndexForKey(key)];
		while (entry != null && !key.equals(entry.getKey()))
			entry = entry.getNext();
		return entry != null ? entry.getValue() : null;
	}// end of get method

	public void put(K key, V value) {
		throwIfKeyNull(key);
		int bucketIndex = bucketIndexForKey(key);
		Node<K, V> entry = buckets[bucketIndex];
		if (null != entry) {
			boolean done = false;
			while (!done) {
				if (key.equals(entry.getKey())) {
					entry.setValue(value);
					done = true;
				} else if (entry.getNext() == null) {
					entry.setNext(new Node<K, V>(key, value));
					done = true;
				}
				entry = entry.getNext();
			}
		} else {
			buckets[bucketIndex] = new Node<K, V>(key, value);
		}
	}// end of put method

	public int bucketIndexForKey(K key) {
		int bucketIndex = key.hashCode() % buckets.length;
		return bucketIndex;
	}// end of bucketIndex method

	private void throwIfKeyNull(K key) {
		if (key == null) {
			throw new IllegalArgumentException("key may not be null");
		} // end of throwIfKeyNull method
	}
}