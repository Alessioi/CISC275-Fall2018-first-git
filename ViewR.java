import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class ViewR {
	
	BufferedImage[] images;
	int frameWidth;
	int frameHeight;
	Direction currentDirection;
	boolean isMoving;
	ArrayList<Entities> objs;
	
	public ViewR(){}
	
	public void update(int x, int y, ArrayList<Entities> objs, boolean m, Direction d) {}
	
	public void paint(Graphics g) {}
	
	private BufferedImage createImage(String file) {
		return null;
	}
	
	public static void main(String[] args) {}

}
