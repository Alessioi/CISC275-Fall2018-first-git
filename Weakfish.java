
public class Weakfish extends Animal{

	Double weight;
	Double length;
	boolean isCaught;
	String[] Question = {"True or False? The weakfish is Delaware’s state fish?", "The Weakfish uses Delaware Bay and its tidal tributaries as a breeding and feeding ground during which season?", 
			"Where do Weakfish reside?", "True or false? The largest weakfish ever recorded was caught in 1989 in Delaware Bay and measured 30 inches in length and weighed 19 pounds, 2 ounces."}; 
	String[] Answers = {"True", "Summer", "In both estuarine and nearshore Atlantic Ocean habitats", "True"};
	
	public Weakfish() {
      this.weight = randDouble();
      this.length = randDouble();
      name = "Weakfish";
      }
	public Weakfish(double weight, double length) {
      this.weight = weight;
      this.length = length;
      randDirect();
      name = "Weakfish";
   }
	
}
