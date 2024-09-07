package assignmentWeek3;

public class ReverseOddWords {
	public static void main(String[] args) {
		String test = "I am a software tester";

		//Split the words using split function
		String[] split = test.split(" ");
		//Length of an array
		System.out.println("Length "+ split.length);

		//for loop to iterate over the array of words
		for (int i = 0; i < split.length; i++) {
			if(i%2!=0) {
				for (int j = split[i].length() -1; j>=0; j--) {
					System.out.print(split[i].charAt(j));
				}
				System.out.print(" ");
				
			}else {
				System.out.print(split[i]+" ");
			}

		}
	}
}
