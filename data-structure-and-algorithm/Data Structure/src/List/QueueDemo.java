package List;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<String>q = new Queue<String>() {
			
			@Override
			public <T> T[] toArray(T[] a) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Object[] toArray() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public boolean retainAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean removeAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean remove(Object o) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public Iterator<String> iterator() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean containsAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean contains(Object o) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public void clear() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean addAll(Collection<? extends String> c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public String remove() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String poll() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String peek() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean offer(String e) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public String element() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean add(String e) {
				// TODO Auto-generated method stub
				return false;
			}
		};
	}

}
