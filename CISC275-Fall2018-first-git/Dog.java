
public class Dog extends Animal {

	Dog(String dName, int dLegs ){
		super(dName, dLegs);
	}
	
	@Override
	public String toString(){
		return "A Dog Named " + this.getName() + " Has " + this.getLegs() + " Legs"; 
	}
}
