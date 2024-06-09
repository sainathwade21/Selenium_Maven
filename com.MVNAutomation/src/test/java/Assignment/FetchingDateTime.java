package Assignment;

import java.time.LocalDate;
import java.util.Date;

public class FetchingDateTime {
	 public static void main(String[] args) {
	        // Get the current date
	        LocalDate currentDate = LocalDate.now();
	        // Print the current date
	        System.out.println("Current Date: " + currentDate);
	        
	       System.out.println(currentDate.getDayOfMonth());
	        
	        
	        // Create a Date object representing the current date and time
	        Date currentDate1 = new Date();
	        // Print the current date
	        System.out.println("Current Date: " + currentDate1);
	    }

}
