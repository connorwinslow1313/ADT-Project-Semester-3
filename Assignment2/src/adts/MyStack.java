package adts;

import java.util.EmptyStackException;

import interfaces.Iterator;
import interfaces.StackADT;

public class MyStack<E> implements StackADT<E> {

    private Object[] stack;
    private int topOfStack;


    public MyStack() {
        this.stack = new Object[]{};
        this.topOfStack = -1;
    }

    @Override
    public void push(E toAdd) throws NullPointerException {
        if (topOfStack + 1 == stack.length) {
            Object[] newStack = new Object[stack.length + 1];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
        }
        stack[ ++topOfStack] = toAdd;

    }

    @Override
    public E pop() throws EmptyStackException {
        if (size() == 0) throw new EmptyStackException();

        E poppedValue = (E) stack[topOfStack];
        topOfStack--;

        Object[] newStack = new Object[stack.length - 1];
        System.arraycopy(stack, 0, newStack, 0, stack.length - 1);
        stack = newStack;


        return (E) stack[topOfStack];

    }

    @Override
    public E peek() throws EmptyStackException {
        if (size() == 0) throw new EmptyStackException();
        return (E) stack[topOfStack];
    }

    @Override
    public void clear() {
        this.stack = new Object[]{};
        this.topOfStack = -1;
    }

    @Override
    public boolean isEmpty() {
        return topOfStack == -1;
    }
    //toArray not done c:
    @Override
    public Object[] toArray() {
        return this.stack;
    }

    @Override
    public E[] toArray(E[] holder) throws NullPointerException {
        return (E[]) this.stack;
    }

    @Override
    public boolean contains(E toFind) throws NullPointerException {
        for (Object o : stack) {
            if (toFind.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int search(E toFind) {
        for (int index = 0; index < stack.length; index++) {
            if (toFind.equals(stack[index])) {
                return index + 1;
            }
        }
        return -1;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < stack.length && stack[currentIndex] != null;
            }

            @Override
            public E next() {
                return (E) stack[currentIndex++];
            }
        };
    }

    @Override
    public boolean equals(StackADT<E> that) {
        if (that.size() != this.size()) return false;
        for(Object o : stack) {
            if(!that.contains((E) o)) return false;
        }
        return true;
    }

    @Override
    public int size() {
        return stack.length;
    }

}
