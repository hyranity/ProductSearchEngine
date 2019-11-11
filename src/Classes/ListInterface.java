/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author mast3
 */

public interface ListInterface<E>{
	public E getRecord(int index);
	public void add(E e);
}
