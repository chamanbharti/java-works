package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject{

	private List<Observer>observers;
	private String message;
	private boolean changed;
	private final Object MUTEX = new Object();
	
	public MyTopic() {
		this.observers=new ArrayList<>();
	}
	@Override
	public void register(Observer obj) {
		if(obj == null) throw new NullPointerException("Null Observer");
		synchronized (MUTEX) {
			if(!observers.contains(obj))
				observers.add(obj);
		}
		
	}

	@Override
	public void unregister(Observer obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getUpdate(Observer obj) {
		// TODO Auto-generated method stub
		return null;
	}

}
