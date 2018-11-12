
public class BlueCrab extends Animal{
	
	Double weight;
	Double length;
	boolean isCaught;
	String[] Question = {"During which season do Blue Crabs migrate to deep channels where they borrow into the mud?",
			" are the most economically important shellfishery in the estuary?", "The scientific name for blue crab is", 
			"Blue Crabs have a unique ability that allows them to swim in which direction?", "True or False? Blue crabs have teeth in their stomachs?"}; 
	
	String[] Answer = {"Winter", "Blue Crabs", "Callinectes sapidus", "Sideways", "True"};
	
	
	
	public BlueCrab() {
      this.weight = randDouble();
      this.length = randDouble();
      name = "crabby boi";
   }
	public BlueCrab(double weight, double length) {
      this.weight = weight;
      this.length = length;
      randDirect();
      name = "crabby boi";
   }

}
