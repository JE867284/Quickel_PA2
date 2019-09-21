import java.util.Scanner;

public class Quickel_p3 {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		final int NUM_ROWS = 5;
	    final int NUM_COLS = 10;
	    int [][] responses = new int[NUM_ROWS][NUM_COLS];
	    String[] topics = new String[NUM_ROWS];
	    int [] minmax = new int [NUM_ROWS];
	    int i;
	    int j;
	    int max;
	    int min;
	    int average;
	    String topic1;
	    String topic2;
		
		//How many people taking the survey
	    
	    System.out.println("Please Rate show from 1 - 10");
	    System.out.println("10 responses needed");
	    System.out.println();
		
		//Array of topics
	    
	    topics[0] = "Digimon";
	    topics[1] = "Dragon Ball";
	    topics[2] = "G Gundam";
	    topics[3] = "Pokemon";
	    topics[4] = "Sailor Moon";
		
		//2-D Array for data 5 x 10
	  //get responses and put in array
	    
	    for (j = 0; j < NUM_COLS; j++){
	         for (i = 0; i < NUM_ROWS; i++){
	        	 System.out.print(topics[i] +": ");
	            responses[i][j] = scnr.nextInt();
	         }
	         System.out.println();
	      }
	    
	    System.out.println("Results:");
	    System.out.println();
		
		
		//display results
		//far right show average
	    for (i = 0; i < NUM_ROWS; i++) {
	    	
	    	average = 0;
	    	System.out.print(topics[i] +": ");
	    	
	    	for (j = 0; j < NUM_COLS; j++) {
	    		
	    		System.out.print(responses[i][j] + " ");
	    		average = average + responses [i][j];
	    		
	    	}
	    	System.out.println("Average: " + (average/10));
	    	
	    	
	    }
		

		
			//display highest point total issue and point total
	    topic1 = topics[0];
	    topic2 = topics[0];
	      
	    for (i = 0; i < NUM_ROWS; i++) {
	    	
	    	average = 0;
	    	
	    	for (j = 0; j < NUM_COLS; j++) {
	    		
	    		average = average + responses [i][j];
	    		minmax[i] = average;
	    	}
	    	
	    	
	    }
	    
	    
	    max = minmax[0];
	    min = minmax[0];
	    
	    for (i = 0; i < NUM_ROWS; i++) {
	    	
	    	if (minmax[i] > max) {
	    		max = minmax[i];
	    		topic1 = topics[i];
	    	}
	    }
	    	
	    for (i = 0; i < NUM_ROWS; i++) {
		    	
	    		if (minmax[i] < min) {
		    		min = minmax[i];
		    		topic2 = topics[i];
		    }
		   }
	    	
	    	
	    	
	    	
	    	
	      
	      System.out.println();
	      System.out.println("Max Show: " + topic1 + " " + max);
	      System.out.println("Min Show: " + topic2 + " " + min);
		
			
		
	}

}
