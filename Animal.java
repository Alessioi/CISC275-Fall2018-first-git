
public class Animal extends Entities {

	Double weight = 0.0;
	Double length = 0.0;
   String name = "";
	boolean isCaught;
	
	public Animal() {
      randHeight();
   }
	public Animal(double weight, double length) {
      randDirect();
      this.weight = weight;
      this.length = length;
   }
	
   public String toString() {
      return ("Animal: " + name + " Weight: " + weight + " Length: " + length);
   }
}
