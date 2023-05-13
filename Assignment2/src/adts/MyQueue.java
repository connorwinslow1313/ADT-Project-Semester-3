package adts;

import java.util.Iterator;
import java.util.NoSuchElementException;

import interfaces.QueueADT;

public class MyQueue<E> implements QueueADT<E> {

	@Override
	public void enqueue(E newValue) throws NullPointerException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E dequeue() throws NoSuchElementException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E peek() throws NoSuchElementException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Iterator<E> iterator() throws NoSuchElementException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(E[] holderArray) throws NullPointerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean equals(QueueADT<E> queueTwo) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public E dequeueALL() {
		// TODO Auto-generated method stub
		return null;
	}

}
