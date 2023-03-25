package codewars;

public class RomanNumerals {
	 
	  public String toRoman(int n) {
	    StringBuilder sb = new StringBuilder();
	        if(n >= 1000){
	            switch(n / 1000){
	                case 1: sb.append("M");
	                    break;
	                case 2: sb.append("MM");
	                    break;
	                case 3: sb.append("MMM");
	                    break;
	            }
	            n %= 1000;
	        }
	        if(n >= 100){
	            switch(n/100){
	                case 1: sb.append("C");
	                    break;
	                case 2: sb.append("CC");
	                    break;
	                case 3: sb.append("CCC");
	                    break;
	                case 4: sb.append("CD");
	                    break;
	                case 5: sb.append("D");
	                    break;
	                case 6: sb.append("DC");
	                    break;
	                case 7: sb.append("DCC");
	                    break;
	                case 8: sb.append("DCCC");
	                    break;
	                case 9: sb.append("CM");
	                    break;
	            }
	            n %= 100;
	        }
	        if(n >= 10){
	            switch(n/10){
	                case 1: sb.append("X");
	                    break;
	                case 2: sb.append("XX");
	                    break;
	                case 3: sb.append("XXX");
	                    break;
	                case 4: sb.append("XL");
	                    break;
	                case 5: sb.append("L");
	                    break;
	                case 6: sb.append("LX");
	                    break;
	                case 7: sb.append("LXX");
	                    break;
	                case 8: sb.append("LXXX");
	                    break;
	                case 9: sb.append("XC");
	                    break;
	            }
	            n %= 10;
	        }
	        if(n < 10){
	            switch(n){
	                case 1: sb.append("I");
	                    break;
	                case 2: sb.append("II");
	                    break;
	                case 3: sb.append("III");
	                    break;
	                case 4: sb.append("IV");
	                    break;
	                case 5: sb.append("V");
	                    break;
	                case 6: sb.append("VI");
	                    break;
	                case 7: sb.append("VII");
	                    break;
	                case 8: sb.append("VIII");
	                    break;
	                case 9: sb.append("IX");
	                    break;
	            }
	        }
	        return sb.toString();
	    
	  }
	  
	  public int fromRoman(String romanNumeral) {
	    char[] ch = romanNumeral.toCharArray();
	        int result = 0;
	        int nValue = 0;
	        int oValue = 0;
	        for(int i = 0; i < ch.length; i++){
	            switch(ch[i])
	            {
	                case 'I': nValue = 1;
	                    break;
	                case 'V': nValue = 5;
	                    break;
	                case 'X': nValue = 10;
	                    break;
	                case 'L': nValue = 50;
	                    break;
	                case 'C': nValue = 100;
	                    break;
	                case 'D': nValue = 500;
	                    break;
	                case 'M': nValue = 1000;
	                    break;
	            }
	            if(nValue > oValue){
	                result = result + nValue - 2 * oValue;
	            }else{
	                result = result + nValue;
	            }
	            oValue = nValue;
	        }
	        return result;
	  }
	}