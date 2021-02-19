package structural.decorator;

interface Printer{
	void print();
}

class PaperPrinter implements Printer{

	@Override
	public void print() {
		System.out.println("Paper Printer");
	}
	
}

class PlasticPrinter implements Printer{

	@Override
	public void print() {
		System.out.println("Plastic Printer");
	}
	
}

abstract class PrinterDecorator implements Printer{
	
	protected Printer decoratedPrinter;
	
	public PrinterDecorator(Printer d){
		this.decoratedPrinter = d;
	}
	
	public void print(){
		decoratedPrinter.print();
	}
}

class Printer3D extends PrinterDecorator{

	public Printer3D(Printer decoratedShape) {
		super(decoratedShape);
	}
	@Override
	public void print() {
		System.out.println("3D.");
		decoratedPrinter.print();
	}
	
}
public class Test0 {
	public static void main(String[] args) {
		Printer plasticPrinter = new PlasticPrinter();
		Printer plastic3DPrinter = new Printer3D(new PlasticPrinter());
		Printer paper3DPrinter = new Printer3D(new PaperPrinter());
		
		plasticPrinter.print();
		plastic3DPrinter.print();
		paper3DPrinter.print();
	}

}
