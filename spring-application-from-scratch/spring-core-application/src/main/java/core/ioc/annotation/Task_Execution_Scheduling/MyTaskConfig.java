package core.ioc.annotation.Task_Execution_Scheduling;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
public class MyTaskConfig {
	@Bean
	public MyTask task() {
		return new MyTask();
	}

}