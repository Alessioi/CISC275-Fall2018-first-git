
public class Question {

	String question;
	int questionID;
	String answer;
	boolean isActive;
	
	public Question() {}

	public Question(String question, String answer, int ID) {
		this.question = question;
		this.answer = answer;
		this.questionID = ID;
	}
	
	public void answerQuestion() {}
	
	public boolean isCorrect() {
		return true;
	}
}
