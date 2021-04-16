package scheduling.task;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@Component
public class AsynchronousTask {

private static final Logger LOGGER = LoggerFactory.getLogger(ScheduledTasks.class);
	
	private static final DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
	
//	@Scheduled(fixedRate = 5000)
//	@Scheduled(fixedDelay = 5000)
//	@Scheduled(fixedDelayString = "${fixed.delay}")
//	@Scheduled(initialDelay=1000, fixedRate=5000)
//	@Scheduled(cron="*/5 * * * * MON-FRI")
	@Async
	 public int reportCurrentTime() {
        LOGGER.info("Fixed Rate Task :: Execution Time - {}", dateFormat.format(LocalDateTime.now()));
        return 0;
    }
}