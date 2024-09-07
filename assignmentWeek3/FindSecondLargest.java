package assignmentWeek3;

import java.util.Arrays;

public class FindSecondLargest {
	public static void main(String[] args) {
		//Declaring array
		int[] arr =  {3, 2, 11, 4, 6, 7};
		//sorting in Ascending order
		Arrays.sort(arr);
		//Print after sorting
		System.out.println("Sorted arrays: " + Arrays.toString(arr));
		System.out.println("Second last element is: "+arr[arr.length-2]);
		
			
	}
	
}
