package assignmentWeek3;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		//Input String
		String test = "changegame";
		
		//Converting String to CharArray
		char[] charArray = test.toCharArray();
		
		//store the length of an array in an integer variable
		int length = charArray.length;
		//declaring int value 
		int FromEnd = 1;
		System.out.println("Length of the given string: " +length);

		//For loop
		for (int i = length - 1; i >=0; i--) {
			if(FromEnd % 2!=0) {
				 charArray[i] = Character.toUpperCase(charArray[i]);
			}
			FromEnd++;

		}
		String UpdatedString = new String(charArray);
		System.out.println(UpdatedString);

	}
}
