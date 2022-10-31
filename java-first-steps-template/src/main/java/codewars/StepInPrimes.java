package codewars;

public class StepInPrimes {
	public static long[] step(int g, long m, long n){
        long[] result = new long[2];
        for(long i = m; i <= n - (long) g; i++){
            if(checkPrimaryNum(i)){
                if(checkPrimaryNum(i+(long)g)){
                    result[0] = i;
                    result[1] = i+(long)g;
                    return result;
                }
            }
        }
        return null;
        
    }
    
    public static boolean checkPrimaryNum(long num){
        long temp;
        boolean isPrime = true;
        
        for(int i = 2; i <= num / 2; i++){
            temp = num % i;
            if(temp == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

}
