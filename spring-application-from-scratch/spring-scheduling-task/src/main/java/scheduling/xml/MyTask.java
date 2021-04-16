package scheduling.xml;

import org.springframework.scheduling.annotation.Scheduled;

public class MyTask {

	@Scheduled(fixedRate = 1000)
	public void work() {
		System.out.println("hello task using xml");
	}
}
