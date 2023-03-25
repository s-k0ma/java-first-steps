package codewars;
/**
 *
 * @author sergei
 * This method should allow you to test all the solutions that the author has added.
 */
public class Main {
    public static void main(String[] args){
        RomanNumerals romanTransletor = new RomanNumerals();
        String roman = romanTransletor.toRoman(1783);
        int arabian = romanTransletor.fromRoman("MDCCLXXXIII");
        System.out.println("Romans: " + roman + " | Arabian: " + arabian);
    }
}