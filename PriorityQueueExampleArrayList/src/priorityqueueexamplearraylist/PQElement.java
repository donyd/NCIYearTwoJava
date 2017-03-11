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
public class PQElement {
    private int priority;
    private Object element;
    
    public PQElement(int priority, Object element){
        this.priority = priority;
        this.element = element;
    }
    
    public int getPriority(){
        return priority;
    }
    
    public void setPriority(int priority){
        this.priority = priority;
    }
    
    public Object getElement(){
        return element;
    }
    
    public void setElement(Object element){
        this.element = element;
    }
    
}
