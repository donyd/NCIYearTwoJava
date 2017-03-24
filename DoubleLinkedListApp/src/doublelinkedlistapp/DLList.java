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
public class DLList implements LinearListInterface {
    private DLNode head;
    private DLNode last;
    private DLNode curr;
    private int size;
    
    public DLList(){
        head = null;
        last = null;
        curr = head;
        size = 0;
    }
    
    public boolean isEmpty(){
        return(size == 0);
    }
    
    public int size(){
        return size;
    }
    
    /**
     * setCurrent() sets the classes curr node to be the node at the position
     * specified by the parameter, index.
     */
    private void setCurrent(int index){
        curr = head;
        
        for(int i = 1; i < index; i++){
            curr = curr.getNext();
        }
    }
    
    /**
     * Add the specified item into the linked list at the given index. It is
     * assumed that the index is in the correct range. There are 4 cases to
     * consider here:
     * CASE 1 (adding to an empty list)
     * CASE 2 (adding to the end of the list):
     *  If size = 0 or index = (size + 1), then we're either adding to an empty
     * list or adding to the end of a list. In both cases we're effectively
     * adding to the end of a list.
     * 
     * CASE 3 (adding to the start of a list):
     *  If index is 1 this means we are inserting at the end of the list.
     *  - Set the new node's next pointer to refer to the head
     *  - Set the head's previous pointer to refer to the new node
     *  - Set the head to point to the new node
     * 
     * CASE 4 (adding to the middle of the list):
     *  Otherwise, based on the index, we find the curr node, i.e. the node we
     * want to insert the new node in front of
     * We get the prev node - with this we can now modify all pointers correctly
     *  - Set the new node's next pointer to refer to curr node
     *  - Set the new node's previous pointer to point to the prev node
     *  - Set the prev node's next pointer to refer to the new node
     *  - Set the curr node's prev pointer to refer to the new node
     * 
     * This will automatically link the new node into the list
     * 
     * @param index
     * @param item 
     */
    public void add(int index, Object item){
        if(size == 0 || index == (size + 1)){
            add(item);
        } else if (index == 1){
            DLNode newNode = new DLNode(item, null, null);
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
            size++;
        } else {
            setCurrent(index);
            DLNode prev = curr.getPrev();
            
            DLNode newNode = new DLNode(item, null, null);
            newNode.setNext(curr);
            newNode.setPrev(prev);
            prev.setNext(newNode);
            curr.setPrev(newNode);
            size++;
        }
    }
        
       
    /**
    * get() will return the nth node of the list
    * @param n
    * @return the node at the specified position, n
    */
    
    @Override
    public Object get(int index) {
        setCurrent(index);
        return curr;        
    }

    /**
     * remove() will delete the node at the specified index of the list.
     * We get the node at that index i.e. the curr node. This is the node we
     * want to delete.
     * If curr is actually the head of the list
     *  - Set head to be the node subsequent to the head node
     *  - Ensure this new head node's previous pointer is null.
     * 
     * If curr is actually the last in the list
     *  - Set last to be the node previous to the last node
     *  - Set this new last node's next pointer to be null
     * 
     * Otherwise, get the nodes before and after the current node, and change
     * their next and previous pointers such that they refer to each other
     * and bypass the current node.
     * 
     * @param index 
     */
    @Override
    public void remove(int index) {
        if(size > 0){
            setCurrent(index);
            
            if (curr == head){
                head = curr.getNext();
                head.setPrev(null);
            } else if (curr == last){
                last = curr.getPrev();
                last.setNext(null);
            } else {
                DLNode prev = curr.getPrev();
                DLNode next = curr.getNext();
                
                prev.setNext(next);
                next.setPrev(prev);
            }
           curr = null;
           size--;
        }
    }

    /**
    * Adds an item to the end of the list.
    * If the list is empty then the item become the new list, with both
    * head and last pointing at it
    * 
    * Otherwise, we insert the new node at the end of the list. To do this we:
    *  - Set the last node's next pointer to refer to the new node
    *  - Set the new node's previous pointer to refer to the last node
    *  - Set the last node to be this new node
    * 
    * @param item 
    */
    @Override
    public void add(Object item) {
            DLNode newNode = new DLNode(item, null, null);
            if(size == 0){
                head = newNode;
                last = newNode;
            } else {
                last.setNext(newNode);
                newNode.setPrev(last);
                last = newNode;
            }
            size++;
    }

    /**
     * formattedList() returns a string representation of the linked list. It 
     * goes through each node in the list, from the first node to the last
     * node, getting the value of the node on each iteration and
     * appending it to the string, strList.
     * @return 
     */
    @Override
    public String formattedList() {
        DLNode node = head;
        
        String strList = "";
        while(node != null){
            strList = strList + node.getElement() + " ";
            node = node.getNext();
        }
        return "[" + strList.trim() + "]";
    }
    
    /**
     * formattedBackwardList() returns a string representation of the linked
     * list in reverse. It goes through each node in the list, from the last
     * node to the first node, getting the value of the node on each iteration
     * and appending it to the string, strlist.
     */
    
    public String formattedBackwardList(){
        DLNode node = last;
        
        String strList = "";
        while(node != null){
            strList = strList + node.getElement() + " ";
            node = node.getPrev();
        }
        return "[" + strList.trim() + "]";
    }
        
        
}
