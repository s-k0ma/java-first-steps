package main.java.codewars;
import codewars.GoodVSEvil;
/**
 *
 * @author sergei
 * This method should allow you to test all the solutions that the author has added.
 */
public class Main {
    public static void main(String[] args){
        
        GoodVSEvil battleground = new GoodVSEvil("1 2 0 0 0 0", "1 0 0 0 0 0 0");
        battleground.battle();
        /*
        RomanNumerals romanTransletor = new RomanNumerals();
        String roman = romanTransletor.toRoman(1783);
        int arabian = romanTransletor.fromRoman("MDCCLXXXIII");
        System.out.println("Romans: " + roman + " | Arabian: " + arabian);
        */ 
        /*
        SpinWords spinning = new SpinWords("Enough of spinning my words!");
        System.out.println(spinning.sentence);
        */
    }
}