
public class HorseshoeCrab extends Animal{
	
	Double weight;
	Double length;
	boolean isCaught;
	
	public HorseshoeCrab() {
      this.weight = randDouble();
      this.length = randDouble();
      name = "Horsecrab";
   }
	public HorseshoeCrab(double weight, double length) {
      this.weight = weight;
      this.length = length;
      randDirect();
      name = "Horsecrab";
   }
	
}
