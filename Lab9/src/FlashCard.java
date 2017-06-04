/**
 * Holds the answer and question from the file 
 *
 */
public class FlashCard {
	
	String question;
	String answer;
	
	public FlashCard(String cardAnswer, String cardQuestion){
		answer = cardAnswer;
		question = cardQuestion;
	}
	
	public String getAnswer(){
		return answer;
	}
	
	public String getQuestion(){
		return question;
	}
	
	
	
}
