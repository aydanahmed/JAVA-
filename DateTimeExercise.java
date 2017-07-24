package exercise;

import java.time.LocalDateTime;
import java.time.Month;

public class DateTimeExercise {
	public static void main(String[] args) {

		 try {
	         long start = System.currentTimeMillis( );
	         LocalDateTime currentTime = LocalDateTime.now();
	         Month month = currentTime.getMonth();
	         int day = currentTime.getDayOfMonth();
	         int seconds = currentTime.getSecond();
	   		         
	         System.out.println("Month: " + month +"day: " + day +"seconds: " + seconds);
	      
	         Thread.sleep(3000);
	         LocalDateTime currentTime2 = LocalDateTime.now();
	         Month month2 = currentTime2.getMonth();
	         int day2 = currentTime2.getDayOfMonth();
	         int seconds2 = currentTime2.getSecond();
	   		
	         System.out.println("Month: " + month2 +"day: " + day2 +"seconds: " + seconds2);
	         
	   
	         
	         long end = System.currentTimeMillis( );
	         long diff = end - start;
	         System.out.println("Difference is : " + diff);
	      }catch (Exception e) {
	         System.out.println("Got an exception!");
	      }
	}
}
