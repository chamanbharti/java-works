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
public class HashMap2 {
	
	class HashNode{
		Integer key;
		String value;
		HashNode next;
		public HashNode(Integer key, String value) {
			this.key = key;
			this.value = value;
		}
		
	}
	
	private HashNode[] hashTable = null;
	private int bucketSize = 16;
	private int size = 0;
	
	public HashMap2() {
		this.hashTable = new HashNode[bucketSize];
	}
	
	public void put(Integer key,String value) {
		
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
			hashTable[position] = new HashNode(key,value);
			size++;
		}else {
			while(current.next !=null && current.key != key) {
				current = current.next;
			}
			if(current.key == key) {
				current.value = value;
			}else {
				current.next = new HashNode(key,value);
				size++;
			}
		}
		
	}
	
	private int hash(Integer key) {
		return key.hashCode() % bucketSize;
	//	return Math.abs(key.hashCode()) % bucketSize;//avoid negative value
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
		
		HashMap2 map = new HashMap2();
		map.put(1, "ONE");
		map.put(2, "TWO");
		map.put(3, "THREE");
		System.out.println(map);
		map.put(4, "FOUR");
		map.put(1, "Modified");
		map.put(1, "newValue");
		System.out.println(map);
	}
}
