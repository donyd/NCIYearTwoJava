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
public interface LinearListInterface {
    public boolean isEmpty();
    public int size();
    public Object get(int index);
    public void remove(int index);
    public void add(int index, Object item);
    public void add(Object item);
    public String formattedList();
    
}
