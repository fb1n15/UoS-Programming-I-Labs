import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class FlashCardReader {

	BufferedReader reader;

	/**
	 * Prepares the file to be iterated
	 * @param file input txt file
	 */
	public FlashCardReader(String file) {
		try {
			reader = new BufferedReader(new FileReader(file));
		} catch (IOException e) {
			System.out.println("I failed to read the file.");
		}
	}
/**
 * @return next line of the file
 */
	public String getLine() {
		try {
			return reader.readLine();
		} catch (IOException e) {
			return "I failed to read the file.";

		}

	}
	/**
	 * @return if the file is ready to be iterated
	 */
	public boolean isReady() {
		try {
			return reader.ready();
		} catch (IOException e) {
			System.out.println("I failed to read the file.");
			return false;
		}
	}
	/*
	 * It returns a populates array with the flashcards.
	 */
	public ArrayList<FlashCard> getFlashCards(){
		ArrayList<FlashCard> flashCardsArray= new ArrayList<FlashCard>();
		String[] currentLine;
		while(this.isReady()){
			currentLine = this.getLine().toLowerCase().split(":"); // splits the line to question : answer
			flashCardsArray.add(new FlashCard(currentLine[1],currentLine[0])); // populates the array
		}
		return flashCardsArray;
	}
}

