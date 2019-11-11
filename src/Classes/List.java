package Classes;

// The following is a custom implementation of the List class

/* Coding made possible thanks to the following references:
* https://howtodoinjava.com/data-structure/list-implementation-example-in-java/
* https://stackoverflow.com/questions/529085/how-to-create-a-generic-array-in-java
 */

public class List<E> {

    public int size; // Size of list
    private E[] records;

    // Constructor
    public List() {

        // Default capacity is 10
        records = (E[]) new Object[10];

        // Default size is 0
        size = 0;
    }

    // Parameterized Constructor
    public List(int capacity) {

        // Default capacity is set by the user
        records = (E[]) new Object[capacity];

        // Default size is 0
        size = 0;
    }

    // Getter
    public E getRecord(int index) {
        return records[index];
    }

    // Add record
    public void add(E e) {
        // Add to list
        records[size] = e;

        // Increase size
        size++;
        validateSize();
    }

    // Make sure size is adequate
    private void validateSize() {

        // If current/new size is more than actual array length
        if (size > records.length) {
            // Extend
            E[] newArray = copyArray(records, (E[]) new Object[records.length + 5]);
        }
    }

    // Allows copy of arrays
    private E[] copyArray(E[] oldArray, E[] newArray) {
        int count = 0;

        for (E obj : oldArray) {
            // Copy current element into the new array
            newArray[count] = obj;
            count++;
        }

        return newArray;
    }

    // Allows pop method like stack
    public E pop() {
        // lower the size by 1
        size--;

        // Pop the Object
        E poppedObject = records[size];

        // Set to null
        records[size] = null;

        return poppedObject;
    }

    // Allows push method like stack
    public void push(E e) {
        add(e);
    }

    // Removes from list
    public void remove(int index) {

        // remove the current time
        records[index] = null;

        // Shift all content up
        for (int i = index; i < size; i++) {
            // Replace current record with next one
            records[i] = records[i + 1];
            records[i + 1] = null;
        }

        // reduce the size
        size--;
    }

    public String toString() {

        if (size != 0) {
            String str = "";
            int index = 0;

            for (int i = 0; i < size; i++) {
                str += "\n" + i + ". " + records[i].toString();
                index++;
            }

            return str;
        } else {
            return "No record available";
        }
    }

}
