package spring5.di.dependentObject;

public class Student {

	private int id;
	//MathCheat mathCheat = new MathCheat();//tight coupling
	private MathCheat mathCheat; //loose coupling
	
	public void setId(int id) {
		this.id = id;
	}

	public MathCheat getMathCheat() {
		return mathCheat;
	}

	public void setMathCheat(MathCheat mathCheat) {
		this.mathCheat = mathCheat;
	}

	public void cheating() {
		mathCheat.mathCheat();
		System.out.println("Hey my id is "+id);
	}
}
