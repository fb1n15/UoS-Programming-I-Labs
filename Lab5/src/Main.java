import java.util.HashMap;

public class Main {
	
	public static void main(String[] Args){
		
		WordGroup firstSentence = new WordGroup("You can discover more about a person in an hour of play than in a year of conversation");
		WordGroup secondSentence = new WordGroup("When you play play hard when you work dont play at all");
		
		firstSentence.printWordArray();
		printGap();	
		secondSentence.printWordArray();
		printGap();
		firstSentence.printWordSet(secondSentence);
		printGap();
		printHashMap(firstSentence.getWordCounts());
		printHashMap(secondSentence.getWordCounts());
		/*
		 * Counts each unique word in both sentences.
		 */
		HashMap<String,Integer> tList = new HashMap<String,Integer>();
		HashMap<String,Integer> firstCountsList = new HashMap<String,Integer>(firstSentence.getWordCounts());
		HashMap<String,Integer> secCountsList = new HashMap<String,Integer>(secondSentence.getWordCounts());
		
		for (String word : firstSentence.getWordSet(secondSentence)){
			int counter = 0;
			if (firstCountsList.containsKey(word)){
				counter = counter + firstCountsList.get(word);
			}
			if (secCountsList.containsKey(word)){
				counter = counter + secCountsList.get(word);
			}
			tList.put(word, counter);
		}
		printHashMap(tList);
	}
	
	public static void printGap (){
		System.out.println("************");
	}
	/*
	 * Prints a String,Integer HashMap.
	 */
	public static void printHashMap(HashMap<String,Integer> objHashMap){
		for (String word: objHashMap.keySet()){
			String key = word.toString();
			Integer value = objHashMap.get(word);
			System.out.println(key + " " + value);
		}
		printGap();
	}

}
