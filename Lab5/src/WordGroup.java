import java.util.HashSet;
import java.util.HashMap;

public class WordGroup {
	String words;
	
	public WordGroup (String word){
		words = word.toLowerCase();
	}
	/*
	 * Puts each word of the WordGroup into an array cell
	 */
	public String[] getWordArray(){
		String[] wordArray = words.split(" ");
		return wordArray;
	}
	/*
	 * Creates a set with each unique word from two WordGroups
	 */
	public HashSet<String> getWordSet(WordGroup objList){
		HashSet<String> hlist = new HashSet<String>();
		for(String word: objList.getWordArray()){
			hlist.add(word);
		}
		
		for(String word: this.getWordArray()){
			hlist.add(word);
		}
		return hlist;
	}
	/*
	 * Counts each unique word in a WordGroup
	 */
	public HashMap<String,Integer> getWordCounts(){
		HashMap<String,Integer> mlist = new HashMap<String,Integer>();
		for (String word: this.getWordArray()){
			if (mlist.containsKey(word)){
				int oldValue = mlist.get(word);
				mlist.put(word, oldValue + 1);
			}else{
				mlist.put(word, 1);
			}
		}
		return mlist;
	}
	
	public void printWordArray(){
		for(String word: this.getWordArray()){
			System.out.println(word);
		} 
	}
	
	public void printWordSet(WordGroup secObj){
		getWordSet(secObj).forEach(System.out::println);
	}
}
