package in.sbp.collections.entities;

public class Books {

	private int bookId;
	private String bookName;
	
	public Books() {}

	public Books(int bookId, String bookName) {
		this.bookId = bookId;
		this.bookName = bookName;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	@Override
	public String toString() {
		return "Books [bookId=" + bookId + ", bookName=" + bookName + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(this.getClass()!=obj.getClass())
			return false;
		
		Books temp = (Books)obj;
		return (temp.bookName.equalsIgnoreCase(this.bookName) && this.bookId==temp.bookId);
	}
}
