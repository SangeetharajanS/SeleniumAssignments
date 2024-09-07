package assignmentWeek3;

public class LoginTestData extends TestData {
	////First method declaration
	public void enterUsername() {
		System.out.println("User Name is: Xyzz");

	}
	//Second method declaration
	public void enterPassword() {
		System.out.println("Password is: Yzzz");

	}
	//Main method
	public static void main(String[] args) {
		//Creating object for subclass
		LoginTestData obj = new LoginTestData();
		//Calling all the methods
		obj.enterCredentials();
		obj.enterUsername();
		obj.enterPassword();
		obj.navigateToHomePage();
	}

}
