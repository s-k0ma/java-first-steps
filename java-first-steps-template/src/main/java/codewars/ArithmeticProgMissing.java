package codewars;

public class ArithmeticProgMissing {
	
	public static int findMissing(int[] numbers)
	  {
	     int step = (numbers[numbers.length - 1] - numbers[0])/numbers.length;
	     int result = 0;
	     if(step == 0){
	         return numbers[0];
	     }
	     for(int i = 0; i < numbers.length - 1; i++)
	          if(numbers[i + 1] - numbers[i] != step)
	              result = numbers[i] + step;

	    return result;      
	  }  
}
