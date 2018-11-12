
public class Loggerhead extends Animal{

	Double weight;
	Double length;
	boolean isCaught;
	String[] Question = {"During which months do Loggerhead Turtles visit Delaware's estuarine and marine waters?",
			" , when compared to other sea turtles, occur in the greatest number at the estuary.",
			"The largest amount of Loggerhead Turtles at Delaware Bay can be found during which season?", 
			"A loggerhead Turtle is classified as a?", "A wild Loggerhead Turtle has a lifespan around how many years?", 
			"True or False? The Loggerhead Turtle gets their name from their oversized head?"};
	String[] Answer = {"Warmer Months", "Loggerhead Turtles", "Summer", "Reptile", "50+ years", "True"};
	
	public Loggerhead() {
      this.weight = randDouble();
      this.length = randDouble();
      name = "loggerhead";
   }
	public Loggerhead(double weight, double length) {
      this.weight = weight;
      this.length = length;
      randDirect();
      name = "loggerhead";
   
   }
	
}
