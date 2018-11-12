import java.util.ArrayList;

public class Model {

	ControllerS steward;
	ControllerE educator;
	ControllerR researcher;
	String[] estuaries;
	int score;
	
	public Model() {}
	
	public Model(ControllerS s, ControllerE e, ControllerR r) {
		this.steward = s;
		this.educator = e;
		this.researcher = r;
	}
	
	public void update(int score, ArrayList<Entities> objs) {}
	
	public static void main(String[] args) {}
	
	
	
}
