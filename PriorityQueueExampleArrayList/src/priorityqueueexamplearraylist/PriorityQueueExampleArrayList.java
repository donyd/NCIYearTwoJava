/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priorityqueueexamplearraylist;

/**
 *
 * @author dONY
 */
public class PriorityQueueExampleArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PQInterface pq = new MyPriorityQueue();
        
        pq.enqueue(7, "John Doe - Broken Arm");
        pq.enqueue(10, "Laura Smith - unconscious");
        pq.enqueue(5, "Sam Patty - high temperature");
        pq.enqueue(2, "Chris Patrick - running nose");
        
        System.out.println("Size of PQ is " + pq.size());
        System.out.println("Is the PQ empty?" + pq.isEmpty());
        
        System.out.println("Printing before removing one patient...");
        System.out.println(pq.formattedQueue());
        pq.dequeue();
        System.out.println("Printing after removing a patient...");
        System.out.println(pq.formattedQueue());
    }
    
}
