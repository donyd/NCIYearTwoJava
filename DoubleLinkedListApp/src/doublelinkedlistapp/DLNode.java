/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublelinkedlistapp;

/**
 *
 * @author dONY
 */
public class DLNode {
    private Object element;
    private DLNode next;
    private DLNode prev;
    
    public DLNode(Object element, DLNode next, DLNode prev){
        this.element = element;
        this.next = next;
        this.prev = prev;
    }
    
    public DLNode getNext(){
        return next;
    }
    
    public void setNext(DLNode next){
        this.next = next;
    }
    
    public DLNode getPrev(){
        return prev;
    }
    
    public void setPrev(DLNode prev){
        this.prev = prev;
    }
    
    public Object getElement(){
        return element;
    }
    
    public void setElement(Object element){
        this.element = element;
    }
    
}
