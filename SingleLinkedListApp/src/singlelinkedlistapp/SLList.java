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
public class SLList implements SingleLinkedListInterface {
    
    private Node head;
    private int size;
    private Node curr;
    private Node prev;
    
    public SLList(){
        size = 0;
        head = null;
        curr = null;
        prev = null;
    }
    
    public boolean isEmpty(){
        if(size == 0){
            return true;
        } else {
            return false; 
        }
    }
    
    public int size(){
        return size;
    }
    
    /**
     * If index is 1 then item will be inserted into the head of the list
     * Else find locate the item currently at the index & find previous and next nodes
     * set previous node to point to new node item
     * set new node to point current node
     * @param index
     * @param item 
     */
    
    
    public void add(int index, Object item){
        if(index == 1){
            Node newNode = new Node(item, head);
            head = newNode;
        } else {
            setCurrent(index);
            Node newNode = new Node(item, curr);
            prev.setNext(newNode);
        }
        size = size + 1;                
    }
    
    /**
     * 
     * @param item 
     */
    public void add(Object item){
        Node newNode = new Node(item, null);
        if(head == null){
            head = newNode;
        } else {
            setCurrent(size);
            curr.setNext(newNode);
        }
        size = size + 1;
    }
    
    public Object get(int index){
        setCurrent(index);
        return curr;
    }
    
    public void remove(int index){
        if(index == 1){
            head = head.getNext();
        } else {
            setCurrent(index);
            prev.setNext(curr.getNext());
        }
        size = size - 1;
    }
    
    private void setCurrent(int index){
        prev = null;
        curr = head;
        
        for (int i = 1; i < index; i++){
            prev = curr;
            curr = curr.getNext();
        }
    }
    
    public String formattedList(){
        Node node = head;
        
        String strList = "";
        while(node != null){
            strList = strList + "[" + node.toString() + "]";
            node = node.getNext();
        }
        return strList;
    }
    
}
