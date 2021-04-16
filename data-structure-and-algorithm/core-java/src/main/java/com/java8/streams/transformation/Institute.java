package java8.streams.transformation;

import java.util.List;

public class Institute {

	String name;
	List<String> state;
	
	public Institute(String name, List<String> state) {
		super();
		this.name = name;
		this.state = state;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getState() {
		return state;
	}
	public void setState(List<String> state) {
		this.state = state;
	}
	
}
