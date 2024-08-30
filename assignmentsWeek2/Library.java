package assignmentsWeek2;

public class Library {
	public String addBook(String BookTitle) {
		System.out.println("Book Added Sucessfully");
		return BookTitle;
	}
	public void issueBook() {
		System.out.println("Book Issued Sucessfully");
	}

	public static void main(String[] args) {
		Library obj = new Library();
		String BookName = obj.addBook("Ponniyin Selvan-I");
		System.out.println("Book title Is "+BookName);
		obj.issueBook();
	}

}