package assignmentsWeek1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		
		int arr[]= {1, 4, 3, 2, 8, 6, 7}; //array length = 6
		Arrays.sort(arr); //after sorting array will be {1,2,3,4,6,7}
		
		int num=1; //1,
		
		for (int i = 0; i < arr.length; i++) {//i=1,2,3,4,5
			if (arr[i]!=num) {
				System.out.println("Missing Number Is: " +num);
				break;
			}
			num++;
		}
	}

}
