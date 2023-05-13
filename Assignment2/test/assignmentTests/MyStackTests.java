
package assignmentTests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import adts.MyArrayList;
import adts.MyStack;
import interfaces.Iterator;

public class MyStackTests {
	
	
	private MyStack stack;
	private MyStack stackB;

	@Before
	public void setUp() throws Exception {
		stack  = new MyStack();
		stackB = new MyStack();
		
	}


	@After
	public void tearDown() throws Exception {
		this.stack.clear();
	}
	
	@Test
	public void testMyStack() {

		assertTrue(stack.size() <= 0);
	}

	@Test
	public void testPush() {
		stack.push(1);
		
		assertEquals(stack.peek(), 1);
	}

	@Test
	public void testPop() {
		stack.push(1);
		stack.push(1);
		
		assertEquals(stack.pop(), 1);
	}

	@Test
	public void testPeek() {
		stack.push(1);
		
		assertEquals(stack.peek(), 1);
	}

	@Test
	public void testClear() {
		stack.clear();
		
		assertEquals(stack.size(), 0);
	}

	@Test
	public void testIsEmpty() {
		assertEquals(stack.size(), 0);
	}

	@Test
	public void testToArray() {
		stack.push(1);
		stack.push(2);
		stack.push(3);
		int[] array = new int[] {1,2,3};
		
		assertEquals(array, stack.toArray());
	}

	@Test
	public void testToArrayEArray() {
		Object[] objArray = new Object[] {};
		stack.push(1);
		stack.push(2);
		stack.push(3);
		int[] array = new int[] {1,2,3};
		
		assertEquals(array, stack.toArray(objArray));
	}

	@Test
	public void testContains() {
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		assertTrue(stack.contains(2));
	}

	@Test
	public void testSearch() {
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		assertEquals(stack.search(2), 2);
	}

	@Test
	public void testIterator() {

		Iterator<Integer> iterator = (Iterator<Integer>)stack.iterator();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		assertTrue(iterator.hasNext());
	}

	@Test
	public void testEqualsStackADTOfE() {
		
		assertTrue(stack.equals(stackB));
	}

	@Test
	public void testSize() {
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		assertEquals(3, stack.size());
	}

}
