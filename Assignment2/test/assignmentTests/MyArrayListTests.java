

package assignmentTests;

import static org.junit.Assert.*;

import org.junit.Test;

import adts.MyArrayList;
import interfaces.Iterator;


public class MyArrayListTests {


	@Test
	public void testMyArrayList() {
		MyArrayList testList = new MyArrayList();
		assertTrue(testList.size() == 0);
	}


	@Test
	public void testSize() {
		MyArrayList testList = new MyArrayList();
		assertTrue(testList.size() == 0);
	}


	@Test
	public void testClear() {
		MyArrayList testList = new MyArrayList();
		testList.add(1);
		testList.clear();
		assertTrue(testList.size() == 0);
	}


	@Test
	public void testAddIntE() {
		MyArrayList testList = new MyArrayList();
		testList.add(1);
		testList.add(1);
		testList.add(1,2);
		assertEquals(testList.get(1), 2);
	}


	@Test
	public void testAddE() {
		MyArrayList testList = new MyArrayList();
		testList.add(1);
		assertTrue(testList.size() == 1);
	}


	@Test
	public void testAddAll() {
		MyArrayList testListA = new MyArrayList();
		MyArrayList testListB = new MyArrayList();
		testListB.add(1);
		testListB.add(2);
		testListB.add(3);
		
		assertTrue(testListA.addAll(testListB));
	}

	@Test
	public void testGet() {
		int testValue = 5;
		MyArrayList testList = new MyArrayList();
		testList.add(1);
		testList.add(1);
		testList.add(1);
		testList.add(1, testValue);
		
		assertEquals(testList.get(1), testValue);
	}


	@Test
	public void testRemoveInt() {
		String testValue = "5";
		MyArrayList testList = new MyArrayList();
		testList.add(1);
		testList.add(2);
		testList.add(3);
		testList.add(1, testValue);
		
		assertEquals(testList.remove(1), testValue);
	}


	@Test
	public void testRemoveE() {
		String testValue = "5";
		MyArrayList testList = new MyArrayList();
		testList.add(1);
		testList.add(2);
		testList.add(3);
		testList.add(1, testValue);
		
		assertEquals(testList.remove(testValue), testValue);
	}


	@Test
	public void testSet() {
		String testValue = "5";
		MyArrayList testList = new MyArrayList();
		testList.add(1);
		testList.add(2);
		testList.add(3);
		testList.set(1, testValue);
		
		assertEquals(testList.get(1), testValue);
	}


	@Test
	public void testIsEmpty() {
		MyArrayList testList = new MyArrayList();
		
		assertTrue(testList.isEmpty());
	}


	@Test
	public void testContains() {
		MyArrayList testList = new MyArrayList();
		testList.add(1);
		testList.add(2);
		testList.add(3);
		
		assertTrue(testList.contains(2));
	}

	
	@Test
	public void testToArrayEArray() {
		Object[] objArray = new Object[] {};
		MyArrayList testList = new MyArrayList();
		testList.add(1);
		testList.add(2);
		testList.add(3);
		int[] array = new int[] {1,2,3};
		
		assertEquals(array, testList.toArray(objArray));
	}


	@Test
	public void testToArray() {
		MyArrayList testList = new MyArrayList();
		testList.add(1);
		testList.add(2);
		testList.add(3);
		int[] array = new int[] {1,2,3};
		
		assertEquals(array, testList.toArray());
	}


	@Test
	public void testIterator() {
		MyArrayList testList = new MyArrayList();
		Iterator<Integer> iterator = (Iterator<Integer>)testList.iterator();
		testList.add(1);
		testList.add(2);
		testList.add(3);
		
		assertTrue(iterator.hasNext());
	}

}
