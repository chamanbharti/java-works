package ds.linear.hashtable;
/*
What is  HashMap?
-Linear data structures
-Key value pair node structure
-Highly efficient lookup
-Using hashing technique for storing hash node

Advantages of HashMap
-Fastest access O(1)
-After java 8 performance improved
-In java 8, hash map implemented by Red Black (Balanced) Tree

 */
public class HashMap {
	
	class HashNode{
		String key;
		String value;
		HashNode next;
		public HashNode(String key, String value) {
			this.key = key;
			this.value = value;
		}
		
	}
	
	private HashNode[] hashTable = null;
	private int bucketSize = 16;
	private int size = 0;
	
	public HashMap() {
		this.hashTable = new HashNode[bucketSize];
	}
	
	public void put(String key,String value) {
		
		/*
		 //without hash collision
		int position = hash(key);
		System.out.println("key - "+key);
		System.out.println("position - "+position);
		hashTable[position] = new HashNode(key,value);
		size++;
		*/
		
		//with hash collision
		int position = hash(key);
		System.out.println("key - "+key);
		System.out.println("position - "+position);
		HashNode current = hashTable[position];
		if(current == null) {
			hashTable[position] = createHashNode(key, value);
			size++;
		}else {
			while(current.next !=null && current.key != key) {
				current = current.next;
			}
			if(current.key == key) {
				current.value = value;
			}else {
				current.next = createHashNode(key, value);
				size++;
			}
		}
		
	}
	
	public HashNode createHashNode(String key,String value) {
		return new HashNode(key,value);
	}
	
	private int hash(String key) {
		return key.hashCode() % bucketSize;
	//	return Math.abs(key.hashCode()) % bucketSize;//avoid negative value
	}
	
	public boolean containsKey(String key) {
		HashNode target = find(key);
		return target != null;
	}
	private HashNode find(String key) {
		int position = hash(key);
		HashNode targetNode = hashTable[position];
		if(targetNode == null) {
			return null;
		}else {
			while(targetNode != null && targetNode.key != key) {
				targetNode = targetNode.next;
			}
		}
		return targetNode;
	}
	
	public String get(String key) {
		HashNode target = find(key);
		if(target == null) {
			return null;
		}else {
			return target.value;
		}
	}
	
	public boolean remove(String key) {
		int position = hash(key);
		HashNode targetNode = hashTable[position];
		HashNode prev = null;
		HashNode current = targetNode;
		while(current != null && current.key != key) {
			prev = current;
			current = current.next;
		}
		if(current == null) 
			return false;
		if(prev == null) {
			hashTable[position] = current.next;
		}else {
			prev.next = current.next;
		}
		current.next = null;
		afterRemoveNode(current);
		size--;
		return true;
	}
	
	public void afterRemoveNode(HashNode curr) {
		
	}
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void clear() {
		size = 0;
		this.hashTable = new HashNode[bucketSize];
	}
	public String toString() {
		StringBuffer buf = new StringBuffer();
		buf.append("{");
		for(int i = 0;i<bucketSize;i++) {
			HashNode node = hashTable[i];
//			if(node != null) {
//				buf.append(node.key).append("=").append(node.value);
//				buf.append(",");
//			}
			while(node != null) {
				buf.append(node.key).append("=").append(node.value);
				buf.append(",");
				node = node.next;
			}
			
		}
		if(buf.length() > 1) {
			buf.deleteCharAt(buf.length() - 1);
		}
		buf.append("}");
		return buf.toString();
	}
	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		map.put("one", "ONE");
		map.put("two", "TWO");
		map.put("three", "THREE");
		System.out.println(map);
		map.put("four", "FOUR");
		map.put("one", "Modified");
		map.put("one", "newValue");
		System.out.println(map);
		System.out.println(map.containsKey("one"));
		System.out.println(map.containsKey("five"));
		System.out.println(map.get("one"));
		System.out.println(map.get("five"));
		System.out.println(map);
		System.out.println(map.remove("one"));
		System.out.println(map.size);
		System.out.println(map.isEmpty());
		map.clear();
		System.out.println(map);
	}
}
