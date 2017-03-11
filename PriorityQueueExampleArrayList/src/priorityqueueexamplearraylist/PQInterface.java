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
public interface PQInterface {
    public void enqueue(int priority, Object element);
    public int size();
    public boolean isEmpty();
    public Object dequeue();
    public String formattedQueue();
}
