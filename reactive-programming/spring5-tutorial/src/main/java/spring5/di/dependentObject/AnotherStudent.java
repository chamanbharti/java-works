package spring5.di.dependentObject;

public class AnotherStudent {

	//MathCheat mathCheat = new MathCheat();//tight coupling
	private MathCheat cheat; //loose coupling
	
	public MathCheat getCheat() {
		return cheat;
	}

	public void setCheat(MathCheat cheat) {
		this.cheat = cheat;
	}

	public void startCheating() {
		cheat.mathCheat();
	}
}
