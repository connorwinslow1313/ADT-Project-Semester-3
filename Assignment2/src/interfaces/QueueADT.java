package interfaces;

import java.io.Serializable;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * QueueADT defines the interface of a queue collection.
 *
 * @author Group3
 */
public interface QueueADT<E> extends Serializable
{
    /**
     * Mutator method which will add new values to the queue  
     * Pre condition: Queue exists
     * Post Condition: Adds one value to the end of this queue. 
     * @param newValue  the value to be added to the end of the queue  
     * @throws NullPointerException when a value which is null is added to the queue 
     */
    public void enqueue(E newValue) throws NullPointerException;

    /**
     * Method to remove the first value of the queue
     * Pre condition: Queue exists
     * Post Condition: Removes and returns the first value in the queue
     * @return the first value of queue
     * @throws NoSuchElementException exception if this queue is empty or values are not valid.
     */
    public E dequeue() throws NoSuchElementException;
    
    /**
     * Method to check what the first value of the queue is
     * Pre condition: Queue must exist 
     * Post Condition: Returns the first value without affecting or removing the value at the start of this queue.
     * @return The first value in the queue
     * @throws NoSuchElementException exception if this queue is empty or values are not valid.
     */
    public E peek() throws NoSuchElementException;
   
    /**
     * Method to check if there is anything in the queue
     * Pre condition: Queue must exist
     * Post Condition: Queue is not effected.
     * Returns true if this queue has no values.
     * @return true if this queue is empty
     */
    public boolean isEmpty();

    /**
     * Method which will check the length of the queue
     * Pre condition: Queue must exist
     * Post Condition: Returns number of elements in queue
     * @return size of queue as an integer
     */
    public int size();

    /**
     * Method which displays the queue as a string value
     * Pre condition: Queue must exist  
     * Post Condition: Returns queue as a string
     * @return representation of the queue as a string
     */
    public String toString();

    /**
     * Method that returns an iterator over values in the queue
     * @return an Iterator with all values of the queue in sequence
	 * @throws NoSuchElementException exception if this queue is empty or the objects are invalid.
     */
    public Iterator<E> iterator() throws NoSuchElementException;

    /**
     * Removes all values from queue
     */
    public E dequeueALL();

    /**
     * Returns an array containing all values of the queue in proper sequence
     * Precondition: A valid queue object exists.
	 * Postcondition: Array is returned, queue is unaffected
     * @return an array containing all of the items in the queue.
     */
    public Object[] toArray();

    /**
     * Returns an array containing all values of the queue in proper sequence. Runtime is of the passed array type.
     * Precondition: A valid queue object exists.
	 * Postcondition: Array is returned, queue is unaffected
     * @param holderArray 
     *                  Array which will hold all of the elements in the queue.
     *                  If array does not exist one is created with same runtime type
     * @return an array containing all of the items in the queue.
	 * @throws NullPointerException if array passed is null.
     */
    public Object[] toArray(E[] holderArray) throws NullPointerException;

    /**
	 * Method which will check if two queues have same size and values in the same order
	 * Precondition: Queues must both exist
	 * Postcondition: True value is returned if queues are equal, false otherwise. Queues are both unaffected
     * @param queueTwo is the other queue object being compared to the first queue
	 * @return true if both queues are the same size and their values are equal and in the same order, otherwise false.
	 */
    public boolean equals(QueueADT<E> queueTwo);
}
