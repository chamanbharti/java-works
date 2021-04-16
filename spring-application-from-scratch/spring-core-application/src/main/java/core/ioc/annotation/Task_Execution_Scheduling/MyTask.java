package core.ioc.annotation.Task_Execution_Scheduling;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.Schedules;

public class MyTask {

	
	private static final DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
	
//	@Scheduled(fixedRate = 5000)
//	@Scheduled(fixedDelay = 5000)
//	@Scheduled(fixedDelayString = "${fixed.delay}")
//	@Scheduled(initialDelay=1000, fixedRate=5000)
//	@Scheduled(cron="*/5 * * * * MON-FRI")
	
	@Schedules({
		@Scheduled(fixedRate = 1000),
		@Scheduled(cron = "0 * * * * MON-FRI")
	})
	public void work() {
		System.out.printf("Fixed Rate Task :: Execution Time - "+dateFormat.format(LocalDateTime.now()));
		System.out.println(" hello task using xml");
	}
}
