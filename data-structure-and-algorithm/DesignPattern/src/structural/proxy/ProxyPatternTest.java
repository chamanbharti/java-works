package structural.proxy;

public class ProxyPatternTest {
	public static void main(String[] args){
		
		CommandExecutor executor = new CommandExecutorProxy("chaman bharti","test1234");
		try {
			executor.runCommand("cmd");
		//executor.runCommand("ls -ltr");
		//executor.runCommand(" rm -rf abc.pdf");
		} catch (Exception e) {
		System.out.println("Exception Message::"+e.getMessage());
		}
		}

}
