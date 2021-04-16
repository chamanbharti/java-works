package core.ioc.annotation.Task_Execution_Scheduling.annotation;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@Component
public class MyTask {

	@Scheduled(fixedRate = 1000)
	public void work() {
		System.out.println("hello task using component annotation");
	}
}
