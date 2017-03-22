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
public class Node {
    private Object element;
    private Node next;
    
    public Node(Object element, Node next){
        this.element = element;
        this.next = next;
    }
    
    public Node getNext(){
        return next;
    }
    
    public void setNext(Node next){
        this.next = next;
    }
    
    public Object getElement(){
        return element;
    }
    
    public void setElement(Object element){
        this.element = element;
    }
    
    public String toString(){
        return element.toString();
    }
        
}
