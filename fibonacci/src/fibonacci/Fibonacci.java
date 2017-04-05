/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author dONY
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Fib(6) = " + fib(6));
        System.out.println("First 12 Terms of Fib series");
        fibSeries(12);
    }
   
    public static void fibSeries(int term){
        for (int i = 1; i <= term; i++){
            System.out.println("Term " + i + " is " + fib(i));
        }
    }
    
    public static int fib(int n){
        if(n == 1  || n == 2){
            return 1;
        } else {
            return fib(n -1) + fib(n - 2);
        }
    }
       
}


