package ds.linear.hashtable;

public class LinkedHashMap extends HashMap{

	class LinkedHashNode extends HashMap.HashNode{
		LinkedHashNode after;
		LinkedHashNode before;
		public LinkedHashNode(String key,String value){
			super(key,value);
		}
	}
	LinkedHashNode head;
	LinkedHashNode tail;
	
	@Override
	public HashNode createHashNode(String key, String value) {
		LinkedHashNode newNode = new LinkedHashNode(key, value);
		afterNodeInsert(newNode);
		return newNode;
	}
	
	private void afterNodeInsert(LinkedHashNode current) {
		if(head == null) {
			head = tail = current;
		}else {
			tail.after = current;
			current.before = tail;
			tail = current;
		}
	}
	
	@SuppressWarnings("unused")
	@Override
	public void afterRemoveNode(HashNode node) {
		LinkedHashNode curr = (LinkedHashNode)node;
		
		LinkedHashNode prevNode = curr.before;
		LinkedHashNode nextNode = curr.after;
		
		if(curr == null) {
			head = head.after;
			head.before = null;
		}else if(curr == tail) {
			prevNode.after = null;
			tail = prevNode;
		}else {
			prevNode.after = nextNode;
			nextNode.before = prevNode;
		}
		curr.after = curr.before = null;
	}
	
	public String toString() {
		StringBuffer buf = new StringBuffer();
		LinkedHashNode curr = head;
		buf.append("{");
		while(curr != null) {
			buf.append(curr.key).append("=").append(curr.value);
			buf.append(",");
			curr = curr.after;
		}
		if(buf.length() > 1) {
			buf.deleteCharAt(buf.length() - 1);
		}
		buf.append("}");
		return buf.toString();
	}
	
	public static void main(String[] args) {
		
		LinkedHashMap map = new LinkedHashMap();
		map.put("one", "ONE");
		map.put("two", "TWO");
		map.put("three", "THREE");
		map.put("four", "FOUR");
		map.put("five", "FIVE");
		map.put("six", "SIX");
		System.out.println(map);
		map.remove("three");
		System.out.println(map);
		map.put("one", "newValue");
		System.out.println(map);
	}
}
