package codewars;

/**
 *
 * @author sergei
 */
public class DeadFish {
    public static int[] parse(String data) {
      char[] sequence = data.toCharArray();
      int[] result = new int[arrSize(sequence)];
      int c = 0;
      int a = 0;
      
      outerLoop:
      for(int i = 0; i < result.length; i++){
          while(c < sequence.length){
              switch(sequence[c]){
                case'i':
                    a++;
                    c++;
                    break;
                case'd':
                    a--;
                    c++;
                    break;
                case's':
                    a = a*a;
                    c++;
                    break;
                case'o':
                    result[i] = a;
                    c++;
                    continue outerLoop;
              }
          }
      }
      return result;
    }
  
    public static int arrSize(char[] arr){
      int mass = 0;
      for(char ch : arr){
        if(ch == 'o')
          mass++;
      }
      return mass;
    }
}