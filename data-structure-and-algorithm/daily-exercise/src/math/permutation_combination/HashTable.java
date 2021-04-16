package math.permutation_combination;

public class HashTable {
	
	private static final int table_size = 100;
	private Record[] tableData = new Record[table_size];//say that w won't get more than 100 records
	
	private class Record{
		Object key;
	    Object data;
		public Record(Object key, Object data) {
			this.key = key;
			this.data = data;
		}
		
		public Object getKey() {
			return this.key;
		}
		
		public Object getData() {
			return this.data;
		}
	}
	public void put(Object key, Object value) {
		int keyCode = key.hashCode();
		int step=0;
		int slot = hash(keyCode, step);
		while(!isEmpty(slot)) {
			slot = hash(keyCode, ++step);
		}
		tableData[slot] = new Record(key,value);
	}
	private int hash(int key,int step) {
		int remainder=0;
		if(step==0) {
			remainder= key % table_size;
			return remainder;
		}
		return (key % table_size + step * step) % table_size;
	}
	
	private boolean isEmpty(int slot) {
		//return tableData[slot] = null;
		tableData[slot] = null;
		return true;
	}
	
	public String toString() {
		return "Data["+tableData+"]";
	}
	
	public static void main(String[] args) {
		HashTable ht = new HashTable();
		ht.put("4",40);
		ht.put("6", 60);
		ht.put("7", 70);
		ht.put("8", 80);
		ht.put("9", 90);
		ht.put("5", 50);
	}

}
