
public enum Direction {
	
	LEFT("left"),
	RIGHT("right"),
	UP("up"),
	DOWN("down"),
   STOP("stopped");

	private String name;

	private Direction(String s){
		name = s;
	}

	public String getName() {
		return name;
	}
	
}
