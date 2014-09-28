package NFL;

import java.util.Scanner;

public class NFLQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner userInputScanner = new Scanner(System.in);
		
		System.out.print("How many completions were made?");
		double COMP = userInputScanner.nextDouble();
		
		System.out.print("How many throws were attempted?");
		double ATT = userInputScanner.nextDouble();
		
		System.out.print("How many passing yards?");
		double YDS = userInputScanner.nextDouble();
		
		System.out.print("How many touchdowns were made?");
		double TD = userInputScanner.nextDouble();
		
		System.out.print("How many interceptions were thrown?");
		double INT = userInputScanner.nextDouble();
		
		 double a = (((COMP/ATT) - .3) * 5);
		 
		 double b = (((YDS/ATT) - 3) * .25);
		 
		 double c = ((TD/ATT) * 20);
		 
		 double d = (2.375 - ((INT/ATT) * 25));
		 
		 double min;
		 
		 double min1;
		 
		 double min2;
		 
		 double min3;
		 
		  if(a < 2.375){
			   min = a;
		  }else{
			  min = 2.375;
		  }
		  
		  if(b < 2.375){
			   min1 = b;
		  }else{
			  min1 = 2.375;
		  }
		  
		  if(c < 2.375){
			   min2 = c;
		  }else{
			  min2 = 2.375;
		  }
		  
		  if(d < 2.375){
			   min3 = d;
		  }else{
			  min3 = 2.375;
		  }
		  
		  double max;
		  
		  double max1;
		  
		  double max2;
		  
		  double max3;
		  
		  if(min > 0){
			  max = min;
		  }else{
			  max = 0;
		  }
		  
		  if(min1 > 0){
			  max1 = min1;
		  }else{
			  max1 = 0;
		  }
		  
		  if(min2 > 0){
			  max2 = min2;
		  }else{
			  max2 = 0;
		  }
		  
		  if(min3 > 0){
			  max3 = min3;
		  }else{
			  max3 = 0;
		  }
		  
		  double passerrating = (((max + max1 + max2 + max3) / 6) * 100);
		  
		  System.out.println(passerrating);

	}

}
