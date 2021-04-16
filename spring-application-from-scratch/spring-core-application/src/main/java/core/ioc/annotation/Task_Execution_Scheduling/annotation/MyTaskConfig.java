package core.ioc.annotation.Task_Execution_Scheduling.annotation;

//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
@ComponentScan(basePackages = "core.ioc.annotation.Task_Execution_Scheduling.annotation")
public class MyTaskConfig {
//	@Bean
//	public MyTask task() {
//		return new MyTask();
//	}

}
