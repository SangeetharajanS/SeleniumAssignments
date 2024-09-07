package assignmentWeek3;

import java.util.Arrays;


public class RemoveDuplicateWords {

	public static void main(String[] args) {
		//Input String
		String text = "We learn Java basics as part of java sessions in java week1";
		int count =0;

		//Split the text into an array of words using space as the delimiter
		String[] split = text.split(" ");
		System.out.println(Arrays.toString(split));
		System.out.println("Length: "+split.length);

		//outer for loop
		for (int i = 0; i < split.length; i++) {
			for (int j = i+1; j < split.length; j++) {
				//				System.out.println(split[i] + " compare with " + split[j]);
				if (split[i].equals(split[j])) {
					split[j]=" ";
					count ++;
					System.out.println("Duplicate "+ count);
				}
			}
		}
		for(String word : split) {
			System.out.print(word + " ");
		}
	}
}

