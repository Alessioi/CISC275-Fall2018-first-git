
public class Animal extends Entities {

	Double weight;
	Double length;
	boolean isCaught;
	
	public Animal() {}
	public Animal(int weight, int length) {}
	
	public void catchAnimal() {
		this.isCaught = true;
	}
	
}
