package in.sbp.generics.genericsclasses;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {

	private List<KeyValuePair<Long, String>> phoneBookList = new ArrayList<>();
	
	public void add(KeyValuePair<Long, String> phoneBookRecord) {
		phoneBookList.add(phoneBookRecord);
	}
	
	public KeyValuePair<Long, String> get(int index) {
		return phoneBookList.get(index);
	}
	
	public int getSize() {
		return phoneBookList.size();
	}
	
}
