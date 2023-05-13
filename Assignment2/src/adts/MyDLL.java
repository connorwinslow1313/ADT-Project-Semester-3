package adts;

import interfaces.Iterator;
import interfaces.ListADT;

public class MyDLL<E> implements ListADT<E> {

	private Object[] list;
    private int size;

    public MyDLL() {
    	this.list = new Object[]{};
    	this.size = 0;
    }
    @Override
    public int size() {
        return this.size;
    }
    @Override
    public void clear() {
        this.list = new Object[]{};
    }
    @Override
    public boolean add(int index, E toAdd) {
        int newSize = list.length + 1;
        Object[] newList = new Object[newSize];
        System.arraycopy(list, 0, newList, 0, list.length);

        System.arraycopy(newList, index, newList, index + 1, size - index);
        
        newList[index] = toAdd;
        this.list = newList;
        size++;

        return true;
    }

    @Override
    public boolean add(E toAdd) {

        int newSize = list.length + 1;

        Object[] newList = new Object[newSize];

        System.arraycopy(list, 0, newList, 0, list.length);
        newList[size++] = toAdd;
        this.list = newList;
        return true;

    }
    @Override
    public boolean addAll(ListADT<? extends E> toAdd ) {
        Iterator<E> iterator = (Iterator<E>) toAdd.iterator();
        while (iterator.hasNext()) {
            this.add(iterator.next());
        }
        return true;
    }

	@SuppressWarnings("unchecked")
	@Override
	public E get(int index) throws IndexOutOfBoundsException {
		return (E) list[index];
	}
	@Override
    public E remove(int index) throws IndexOutOfBoundsException {
        E valueToRemove = (E) list[index];

        int shift = size - index - 1;
        if (shift > 0)
            System.arraycopy(list, index + 1, list, index,
                    shift);

        size--;
        Object[] newList = new Object[size];
        System.arraycopy(list, 0, newList, 0, size);
        this.list = newList;

        return valueToRemove;
    }
	@Override
    public E remove(E toRemove) throws NullPointerException {

        for (int index = 0; index < size; index++) {
            if (toRemove.equals(list[index])) {
                E valueToRemove = (E) list[index];
                int shift = size - index - 1;
                System.arraycopy(list, index + 1, list, index,
                        shift);

                size--;
                Object[] newList = new Object[size];
                System.arraycopy(list, 0, newList, 0, size);
                this.list = newList;
                return valueToRemove;
            }
        }

        return null;
    }

	@Override
	public E set(int index, E toChange) throws NullPointerException, IndexOutOfBoundsException {
		E[] holdValue = (E[]) new Object[1];
		holdValue[0] = (E) list[index];
		list[index] = toChange;
		return holdValue[0];
	}

	@Override
	public boolean isEmpty() {
		return list.length == 0;
	}

	@Override
	public boolean contains(E toFind) throws NullPointerException {
		for(int i = 0; i < list.length; i++) {
			if(list[i] == toFind) {
				return true;
			}
		}
		return false;
	}

	@Override
	public E[] toArray(E[] toHold) throws NullPointerException {
		
		return (E[]) this.list;
	}

	@Override
	public Object[] toArray() {
		return this.list;
	}

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size && list[currentIndex] != null;
            }

            @Override
            public E next() {
                return (E) list[currentIndex++];
            }
        };
    }
    }
    

