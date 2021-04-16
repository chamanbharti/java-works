package java8.streams.creation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
class Student{
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
}
// https://www.techiedelight.com/add-elements-stream-existing-list-java/
public class AddElementIntoExistingList {

	public static void main(String[] args) {
		
		// 1. Collectors.toCollection()
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));
		System.out.println(list);
		addToList(list, Stream.of(4,5));
		System.out.println(list);
		
		List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3));
		addToList2(list2, Stream.of(4,5));
		System.out.println(list2);
		
		List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3));
		addToList3(list3, Stream.of(4,5));
		System.out.println("list3:"+list3);
		
		List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3));
		addToList4(list4, Stream.of(4,5));
		System.out.println("list4:"+list4);
		
		List<Integer> list5 = new ArrayList<>(Arrays.asList(1,2,3));
		list5 = addToList5(list5, Stream.of(4,5));
		System.out.println("list5:"+list5);
		
		List<Student>list6 = new ArrayList<Student>();
		Student st = new Student();
		String name = "Chaman";
		st.setName(name);
		list6.add(st);
		String name2 = "Bharti";
		st.setName(name2);
		list6.add(st);
		
		//addToList6(list6, Stream.of(st.setId(1)));
		System.out.println(list6.toString());
	}
	//generic method to add elements of a stream into an existing list
	private static<T> void addToList(List<T> target, Stream<T> source) {
		source.collect(Collectors.toCollection( ()-> target));
		
	}
	private static<T> void addToList2(List<T> target, Stream<T> source) {
		source.sequential()
		.collect(Collectors.toCollection( ()-> target));
		
	}
	private static<T> void addToList3(List<T> target, Stream<T> source) {
//		source.forEachOrdered(target::add);
		source.forEach(target::add);
		
	}
	private static<T> void addToList4(List<T> target, Stream<T> source) {
		target.addAll(source.collect(Collectors.toList()));
	}
	private static<T> List<T> addToList5(List<T> target, Stream<T> source) {
		return Stream.concat(target.stream(), source).collect(Collectors.toList());
	}
	
	private static<Student> void addToList6(List<Student> target, Stream<Student> source) {
		source.collect(Collectors.toCollection( ()-> target));
		
	}
}
