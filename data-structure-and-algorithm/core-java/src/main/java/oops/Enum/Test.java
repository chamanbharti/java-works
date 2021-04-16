package oops.Enum;


public final class Test {

	private final String massKillMessage = "User lacks sufficient rights to perform this function. Right required: Processing - Mass Kill, Setup.";
	private final String massAddMessage = "User lacks sufficient rights to perform this function. Right required: Processing - Mass Add, Setup.";
	private final String massChangeMessage = "User lacks sufficient rights to perform this function. Right required: Processing - Mass Change, Setup.";
    
	private final String rightDescriptionMassAdd = "Processing, Mass Add Setup";
    private final String rightDescriptionMassChange = "Processing, Mass Change Setup";
    private final String rightDescriptionMassKill = "Processing, Mass Kill Setup";
    
	private final String onOffSetupMessage = "User lacks sufficient rights to perform this function. Right required: Processing - On/Off, Setup.";
	private final String onOffRunMessage = "User lacks sufficient rights to perform this function. Right required: Processing - On/Off, Run.";
    
    private final String rightDescriptionOnOffSetup = "Processing, On/Off Setup";
    private final String rightDescriptionOnOffRun = "Processing, On/Off Run";
    
	public  String getRightdescriptionmassadd() {
		return rightDescriptionMassAdd;
	}
	public String getRightdescriptionmasschange() {
		return rightDescriptionMassChange;
	}
	public String getRightdescriptionmasskill() {
		return rightDescriptionMassKill;
	}
	public String getRightdescriptiononoffsetup() {
		return rightDescriptionOnOffSetup;
	}
	public String getRightdescriptiononoffrun() {
		return rightDescriptionOnOffRun;
	}
	
	public static void main(String[] args) {
		String userCode = "THK";
		int processType = 8;
		Test t = new Test();
		 System.out.println(t.getRightdescriptionmassadd());
	}
}