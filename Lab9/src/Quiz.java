import java.util.ArrayList;
import java.util.Scanner;
public class Quiz {
	
	FlashCardReader reader = new FlashCardReader("Questions.txt"); //input file
	Save writeSave = new Save(); //output file
	ArrayList<FlashCard> flashCardArray;
	float correctQuestions = 0;
	Scanner inputLine = new Scanner(System.in);
	String answer; // User's answer
	String question;
	
	public Quiz(){
		flashCardArray = reader.getFlashCards();//populates the Array with Flashcards
	}
	
	public void play(){
		String userAnswer;
		/*
		 * For each flashcard it gets the answer from the user and compares it with the correct one.
		 * Also it writes the save.txt depending on the previous result.
		 */
		for (FlashCard card:flashCardArray){
			question = card.getQuestion();
			answer = card.getAnswer();
			System.out.println(question);
			userAnswer = inputLine.nextLine().toLowerCase(); //reads the user's answer.
			
			writeSave.writeLine(question + "," + answer + ",");
			/**
			 * Checks the answer from the user
			 */
			if(answer.equals(userAnswer)){
				System.out.println("You are correct!!!");
				writeSave.writeLine("You are correct!!!");
				correctQuestions++;
			}else{
				System.out.println("You are wrong. The correct answer is " + answer);
				writeSave.writeLine("You are wrong.");
			}
		}
		inputLine.close();
		writeSave.nextQuestion();
		float percentage = (correctQuestions/flashCardArray.size())*100;
		/*
		 * Writes the last line of the save.txt with the statistics.
		 */
		writeSave.writeLine("The user got " + correctQuestions + "/" 
		+ flashCardArray.size() + " or " + percentage + "% correct answers.");
		}
	
	
	
	public static void main(String[] Args){
		Quiz currentQuiz = new Quiz();
		currentQuiz.play();
	}
	
	
}
