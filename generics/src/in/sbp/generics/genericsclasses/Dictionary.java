package in.sbp.generics.genericsclasses;

import java.util.ArrayList;
import java.util.List;

public class Dictionary {

	private List<KeyValuePair<String, String>> dictionaryWords = 
			new ArrayList<>();
	
	public void add(KeyValuePair<String, String> wordRecord) {
		dictionaryWords.add(wordRecord);	
	}
	
	public KeyValuePair<String, String> get(int index){
		return dictionaryWords.get(index);
	}
	
	public int getSize() {
		return dictionaryWords.size();
	}
}
