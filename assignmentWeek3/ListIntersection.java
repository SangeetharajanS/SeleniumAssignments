package assignmentWeek3;
import java.util.ArrayList;
import java.util.List;
public class ListIntersection {

	public static void main(String[] args) {
		int[] arr1 =  {3, 2, 11, 4, 6, 7};
		int[] arr2 =  {1, 2, 8, 4, 9, 7};
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		for(int num:arr1 ) {
			list1.add(num);
		}
		for(int num: arr2) {
			list2.add(num);
		}
		for(int num1:list1) {
			if(list2.contains(num1)) {
				System.out.println(num1);
			}
		}
	}

}
