package in.sbp.generics.maingenericsclasses;

import in.sbp.generics.genericsclasses.Dictionary;
import in.sbp.generics.genericsclasses.KeyValuePair;
import in.sbp.generics.genericsclasses.PhoneBook;

public class MainKeyValuePair {

	public static void main(String[] args) {
		
		Dictionary dictionary = new Dictionary();
		
		dictionary.add(new KeyValuePair<>("Good","Which is not BAD."));
		dictionary.add(new KeyValuePair<>("Bad","Which is not GOOD."));
		dictionary.add(new KeyValuePair<>("Clever","Who is not DUMB."));
		dictionary.add(new KeyValuePair<>("DUMB","Who is not Clever."));
		
		
		for(int i=0;i<dictionary.getSize();i++)
			System.out.println(dictionary.get(i));
		
		
		
		
		PhoneBook phoneBook = new PhoneBook();
		
		phoneBook.add(new KeyValuePair<>(9874563210L,"Amruta"));
		phoneBook.add(new KeyValuePair<>(9874563220L,"Sneha"));
		phoneBook.add(new KeyValuePair<>(9874563230L,"Pankaj"));
		phoneBook.add(new KeyValuePair<>(9874563240L,"Omkar"));
		
		for(int i=0;i<phoneBook.getSize();i++)
			System.out.println(phoneBook.get(i));
	}
}
