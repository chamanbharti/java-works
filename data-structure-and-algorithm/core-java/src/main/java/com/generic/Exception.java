package generic;

import java.io.IOException;

class Airplane{
	public Airplane() throws IOException{
		System.out.println("AirPlane");
		throw new IOException();
	}
}
class AirJet extends Airplane{
	public AirJet() throws IOException{
		System.out.println("AirJet");
		try {
			  super();
		} catch (IOException e) {
			System.out.println("IOException is thrown in AirJet");
		}
		throw new IOException();
	}
}
public class Exception {

	public static void main(String[] args) {
		try {
			 new AirJet();
		} catch (IOException e) {
			System.out.println("IOException is thrown in Exception");
		}
	}
}
