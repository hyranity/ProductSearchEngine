/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 * This is the interface for the custom List class.
 * E = Element of the list
 */
public interface ListInterface<E> {

    E getRecord(int index);
    /*
    description: Returns an element
    precondition: Item must exist in the list
    postcondition: none
    return: E
    */

    void add(E e);
     /*
    description: Adds an element
    precondition: none
    postcondition: List size is increased
    return: none
    */
    
    void validateSize();
     /*
    description: Ensures that the list has enough space. It will increase the actual size 
    if the current size (just a size pointer, not the actual size) exceeds the actual size.
    This is used when adding an item.
    
    precondition: none
    postcondition: List actual size will be increased if not enough space.
    return: none
    */
    
    public E[] copyArray(E[] oldArray, E[] newArray);
     /*
    description: Copies oldArray elements to newArray, and returns the newArray
    precondition: none
    postcondition: newArray now has same elements as oldArray
    return: An array of E
    */
    
    void remove(int index);
     /*
    description: Removes an element
    precondition: list must not be empty, indexed item must exist
    postcondition: List size is decreased
    return: none
    */
    
    int indexOf(E e);
    /*
    description: Finds an item and returns its index. Returns -1 if not found
    precondition: 
    postcondition: none
    return: index of the item, or -1 if not found
    */
    
    String toString();
     /*
    description: Displays all elements in a string
    precondition: none
    postcondition: none
    return: a String
    */
    

}
