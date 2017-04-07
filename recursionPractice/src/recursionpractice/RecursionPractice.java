/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionpractice;

/**
 *
 * @author dONY
 */
public class RecursionPractice {
    public static int factorial(int n){
        if(n == 0){
            return 1;
        } else{
            return n * factorial(n -1);
        }
    }
    
    public static double power(int x, int n){
        if(n == 0){
            return 1;
        } else {
            return x * power(x, n-1);
        }
    }
    
    public static String reverse(String word){
        if(word.equals("")){
            return "";
        } else {
            return reverse(word.substring(1)) + word.charAt(0);
        }
    }
    
    public static int addDigits(String strNumber){
        if (strNumber == null || strNumber.length() == 0){
            return 0;
        } else {
            return Integer.valueOf(firstOf(strNumber)) + addDigits(restOf(strNumber));
        }
    }
    
    public static String firstOf(String aString){
        return aString.substring(0, 1);
    }
    
    public static String restOf(String aString){
        return aString.substring(0, 1);
    }
      
    
    public static int handShake(int n){
        if (n <= 1){
            return 0;
        } else if (n == 2){
            return 1;
        } else {
            return (n -1) + handShake(n-1);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        rangeFinder myFinder = new rangeFinder();
        
        myFinder.getInput();
        
        myFinder.getRange();
        
        myFinder.showResult();
        
    }
    
}
