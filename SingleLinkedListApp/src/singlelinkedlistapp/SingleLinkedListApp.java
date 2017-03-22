/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlelinkedlistapp;

/**
 *
 * @author dONY
 */
public class SingleLinkedListApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SLList sll = new SLList();
        sll.add(1, "Node1");
        sll.add(2, "Node2");
        sll.add(3, "Node3");
        sll.add(2, "NodeA");
        
        // print the size of the list
        System.out.println("Size of list is " + sll.size());
        
        // print all elements from the list
        System.out.println("Printing...");
        System.out.println(sll.formattedList());
        
        // add an extran node
        sll.add("and another node");
        System.out.println("Printing again...");
        System.out.println(sll.formattedList());
        
        // remove a node
        sll.remove(2);
        System.out.println("Printing after removing the element on position 2...");
        System.out.println(sll.formattedList());
        
        // print the element on the third position
        System.out.println("The element on position 3 is: " + sll.get(3));
    }
    
}
