package lista;
import java.util.List;
import java.util.ArrayList;

public class Splitter {
	
	    
	    public static List<Integer> oddNum(List<Integer> serie) {
	        List<Integer> oddNumbers = new ArrayList<>();
	        for (int num : serie) {
	            if (num % 2 != 0) {
	                oddNumbers.add(num);
	            }
	        }
	        return oddNumbers;
	    }

		public static List<Integer> evenNum(List<Integer> serie) {
			List<Integer> evenNumbers = new ArrayList<>();
	        for (int num : serie) {
	            if (num % 2 == 0) {
	                evenNumbers.add(num);
	            }
	        }
	        return evenNumbers;
		}
}
