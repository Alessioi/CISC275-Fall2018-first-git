import java.util.ArrayList;
import java.util.Timer;

public class ModelR {
	
	int score;
	ArrayList<Entities> objs;
	Direction currDirection;
	Timer t;
	boolean isMoving;
	int x;
	int y;
	
	public ModelR() {}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public Direction getDirection() {
		return currDirection;
	}
	
	public void genObj() {}
	
	public void moveObj() {}
	
	public int measureObj() {
		return 0;
	}
	
	public int weighObj() {
		return 0;
	}
	
	public void addPoints() {}
	
	public void update(boolean moving, int score, Direction d, ArrayList<Entities> o) {}
	
	public static void main(String[] args) {}
	
	
}
