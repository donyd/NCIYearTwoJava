/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priorityqueueexamplearraylist;

import java.util.ArrayList;

/**
 *
 * @author dONY
 */
public class MyPriorityQueue implements PQInterface {
    private ArrayList<PQElement> thePQueue;

    public MyPriorityQueue(){
        thePQueue = new ArrayList<PQElement>();
    }
    
    @Override
    public void enqueue(int priority, Object element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        thePQueue.size();
    }

    @Override
    public boolean isEmpty() {
        thePQueue.isEmpty();
    }

    @Override
    public Object dequeue() {
        throw new UnsupportedOperationException("Not support yet."); 
    }

    @Override
    public String formattedQueue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
