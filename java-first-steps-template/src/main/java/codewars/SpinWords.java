package codewars;

/**
 *
 * @author sergei
 */
public class SpinWords {
    String sentence;
    
    public SpinWords(String sentence){
        this.sentence = spinWords(sentence);
    }

  private String spinWords(String sentence) {
    StringBuilder builder = new StringBuilder();
    for(String s : sentence.split(" ")){
	    if(s.length() < 5)
	        builder.append(s + " ");
	    else    
	        builder.append(spinWord(s) + " ");
	}
    return builder.toString().trim();
  }
  
  private String spinWord(String str){
	    StringBuilder builder = new StringBuilder();
	    char[] letters = str.toCharArray();
	    for(int i = str.length() - 1; i >= 0; i--){
	        builder.append(String.valueOf(letters[i]));
	    }
	    return builder.toString();
	}
}
