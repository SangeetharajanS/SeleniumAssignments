package assignmentsWeek2;

public class LibraryManagement {

	public static void main(String[] args) {
		Library obj2 = new Library();
		String BookTitle = obj2.addBook("Ponniyin Selvan-II");
		System.out.println("Book Title Is "+BookTitle);
		obj2.issueBook();


	}

}