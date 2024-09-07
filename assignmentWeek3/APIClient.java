package assignmentWeek3;

public class APIClient {
	//Method to handle one input argument
	public void sendRequest(String endpoint) {
		System.out.println("Sending Request To Endpoint: "+ endpoint);
	}
	
	//Method to handle 3 input argument, Overloading
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println("Sending Request To Endpoint: "+ endpoint);
		System.out.println("Sending Request Body: "+requestBody);
		System.out.println("Request Status: "+requestStatus);
	}
	public static void main(String[] args) {
		//Creating Object For APIClient Class
		APIClient apiclientobj = new APIClient();
		//overload method with single argument
		apiclientobj.sendRequest("Hello xyz");
		//Overload method with with 3 argument - success
		apiclientobj.sendRequest("http://leaftaps/opentaps", "Enter the username and password in login page", true);
		////Overload method with with 3 argument - Failure
		apiclientobj.sendRequest("http://leaftaps/opentaps", "Enter the username and password in login page", false);
	}

}
