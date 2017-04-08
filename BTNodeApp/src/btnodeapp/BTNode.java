/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btnodeapp;

/**
 *
 * @author x15012743
 */
public class BTNode {
    int element;
    BTNode leftChild;
    BTNode rightChild;
    
    public BTNode(int item){
        this.element = item;
        this.leftChild = null;
        this.rightChild = null;
    }
    
    public int getItem(){
        return this.element;
    }
    
    public BTNode getLeft(){
        if(leftChild == null){
            return null;
        } else {
            return leftChild;
        }
    }
    
    public BTNode getRight(){
         if(this.rightChild == null){
            return null;
        } else {
            return rightChild;
        }
    }
    
    public boolean isInternal(){
        return !(isExternal());
    }
    
    public boolean isExternal(){
        return isLeaf();
    }
    
    public boolean isLeaf(){
        return ((leftChild == null) && (rightChild == null));
    }
    
    
    public int getElement(){
        return element;
    }
    
    
    
    
    
    
    
}
