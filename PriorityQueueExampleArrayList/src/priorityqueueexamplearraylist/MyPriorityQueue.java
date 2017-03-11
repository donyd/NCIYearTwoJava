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
    
    /**
     * This method will insert the given item into the queue based on its
     * specified priority. The higher the priority, the closer the item will be
     * inserted to head of the queue.
     * @param priority
     * @param element 
     */
    @Override
    public void enqueue(int priority, Object item) {
        int index;
        PQElement element = new PQElement(priority, item);
        
        index = findInsertPosition(priority);
        
        if(index > size()){
            thePQueue.add(element);
        } else {
            thePQueue.add(index, element);
        }
    }
    
    /**
     * This method will find the correct position to insert an element
     * in the queue based on its priority. It does this by iterating through the 
     * array list, examining the elements priority.
     * 
     * If the priority is greater then or equal to the current element's
     * priority, then we have found the insertion point.
     * Otherwise, increment the position and continue testing against the
     * other elements in the queue.
     * @param priority
     * @return 
     */
    private int findInsertPosition(int priority){
        PQElement element;
        boolean found = false;
        int position = 0;
        
        while(position < thePQueue.size() && !found){
            element = thePQueue.get(position);
            if(priority > element.getPriority()){
                found = true;
            } else {
                position = position + 1;
            }
        }
        return position;
    }

    @Override
    public int size() {
        return thePQueue.size();
    }

    @Override
    public boolean isEmpty() {
        return thePQueue.isEmpty();
    }

    @Override
    public Object dequeue() {
        return thePQueue.remove(0);
    }

    /**
     * This method returns a string representation of the priority queue.
     * It does through each node in the list, getting the value of the node
     * and appending it to the string, strList, which it will finally return.
     * @return 
     */
    @Override
    public String formattedQueue() {
        PQElement element;
        String strQueue = "";
        
        for(int i = 0; i < thePQueue.size(); i++){
            element = thePQueue.get(i);
            strQueue = strQueue + "[Priority=" + element.getPriority() +
                    ",Element=" + element.getElement() + "]";
        }
        return strQueue;
    }
    
    
}
