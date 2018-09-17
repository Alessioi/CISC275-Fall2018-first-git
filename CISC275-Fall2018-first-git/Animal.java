
public abstract class Animal implements Comparable<Animal> {
	private String name;
	private int legs;
	
	public Animal() {
		
	}
	public Animal(String Aname, int Alegs) {
		name = Aname;
		legs = Alegs;
	}
	
	public int getLegs() {
		return legs;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public int compareTo(Animal o) {
		return this.getLegs() - o.getLegs();
	}
	

}
