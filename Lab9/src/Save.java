import java.io.File;
import java.io.PrintStream;
import java.io.IOException;

public class Save {
	PrintStream writer;
	
	/**
	 * Prepares the file to be written
	 */
	public Save(){
		try {
			writer = new PrintStream(new File("save.txt"));
		} catch (IOException e) {
			System.out.println("I failed to start the file.");
		}
	}
	
	public void writeLine(String line){
		writer.print(line);
	}
	
	/**
	 * Changes Line at the file
	 */
	public void nextQuestion(){
		writer.println();
	}
}
