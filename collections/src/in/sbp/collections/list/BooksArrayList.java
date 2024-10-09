package in.sbp.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import in.sbp.collections.entities.Books;

public class BooksArrayList {

	public static void main(String[] args) {
		List<Books> bookList = new ArrayList<>();
		
		bookList.add(new Books(1,"Book1"));
		bookList.add(new Books(2,"Book2"));
		bookList.add(new Books(3,"Book3"));
		bookList.add(new Books(4,"Book4"));
		bookList.add(new Books(5,"Book5"));
		bookList.add(new Books(6,"Book6"));
		
		System.out.println(bookList.get(5).hashCode());
		System.out.println(new Books(6,"Book6").hashCode());
		
		boolean result=bookList.get(5).equals(new Books(6,"Book6"));
		
		System.out.println(result);
		
		System.out.println("Before " + bookList);
		
		bookList.remove(new Books(6,"Book6"));
		
		System.out.println("After " + bookList);
		
		Books book1=bookList.get(0);
		System.out.println(book1);
		
		
		
//		for(Books book:bookList)
//			System.out.println(book);
		
//		bookList.stream().forEach(book->System.out.println(book));
//		
//		
//		Iterator<Books> bookIterator=bookList.iterator();
//		while(bookIterator.hasNext()) {
//			Books book = bookIterator.next();
//			System.out.println(book);
//		}
	}
}
