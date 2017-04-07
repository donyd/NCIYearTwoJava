/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionpractice;

import javax.swing.JOptionPane;

/**
 *
 * @author dONY
 */
public class rangeFinder {
    private int lowEnd;
    private int highEnd;
    private int result;
    
    public rangeFinder(){
        this.lowEnd = 0;
        this.highEnd = 0;
    }
    
   public void getInput(){
       this.lowEnd = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your low range"));
       this.highEnd = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your high range"));
       
   }
    
   private int sumRange(int a, int b){
       if (a == b){
           return a;
       } else {
           return result = a + sumRange(a + 1, b);
       }
   }
   
   public int getRange(){
       return sumRange(lowEnd, highEnd);
   }
   
   public void showResult(){
       System.out.println(result);
   }
   
    
}
