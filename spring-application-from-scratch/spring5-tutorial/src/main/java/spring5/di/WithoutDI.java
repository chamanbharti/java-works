package spring5.di;

class Animal{
	
}
class Zoo {
	Animal animal;

	public Animal getAnimal() {
		return animal = new Animal();
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
}


public class WithoutDI {

}
