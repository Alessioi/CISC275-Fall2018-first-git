import java.util.*;
public class Entities {

	int x = 0;
	int y = 1;
   boolean isCaught = false;
   Direction flow = Direction.RIGHT;
   private Random random = new Random();
	
	public Entities() {}
	
	public Entities(int a, int b) {
      x = a;
      y = b;
   }
   
   public void catchObj() {
		this.isCaught = true;
	}
   //sets the object to start on left or right side of field and move left or right
   public void randDirect() {
      boolean temp = random.nextBoolean();
      if(temp) {
         flow = Direction.RIGHT;
      }
      else  {
         flow = Direction.LEFT;
         this.x = 9;
      }
   }
	//places the spawned object at random height
   public void randHeight() {
      this.y = random.nextInt(9) + 1;
      if(y % 2 == 0) {
         this.flow = Direction.LEFT;
         this.x = 9;
      }
      else  {
         this.flow = Direction.RIGHT;
      }
   }
   
   public double randDouble()
   {
      return random.nextDouble();
   }
}
