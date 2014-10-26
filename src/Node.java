
public class Node<T> {
	private Node<T> next = null;
	private T item;
	
	public Node()
	{}
	
	public Node(T value)
	{
		item = value;
	}
	
	public Node(T value, Node<T> next)
	{
		item = value;
		this.next = next;
	}
	
	public void setNext(Node<T> next)
	{
		this.next = next;
	}
	
	public Node<T> getNext()
	{
		return next;
	}
	
	public void setItem(T item)
	{
		this.item = item;
	}
	
	public T getItem()
	{
		return item;
	}
}
