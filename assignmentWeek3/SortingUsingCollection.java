package assignmentWeek3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {
    public static void main(String[] args) {
        // Step 1: Create and populate the array
        String[] array = {"HCL", "Wipro", "Aspire Systems", "CTS"};
        
        // Step 2: Convert the array to a list
        List<String> list = new ArrayList<>();
        Collections.addAll(list, array);
        
        // Step 3: Sort the list in ascending order
        Collections.sort(list);
        System.out.println("Sorted list: " + list);
        
        //Reverse the list
        Collections.reverse(list);
        
        //iterate over for loop
        for(String Company:list) {
        	System.out.print(Company + ",");
        }
    }
}
