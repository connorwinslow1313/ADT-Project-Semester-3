package adts;

public class MyDLLNode<E> {

	private Object data;
	private MyDLLNode<E> next;
	private MyDLLNode<E> prev;
	
	public MyDLLNode(E data) {
		this.data = data;
	}

	public MyDLLNode<E> getNext() {
		return next;
	}

	public void setNext(MyDLLNode<E> next) {
		this.next = next;
	}

	public MyDLLNode<E> getPrev() {
		return prev;
	}

	public void setPrev(MyDLLNode<E> prev) {
		this.prev = prev;
	}

}
