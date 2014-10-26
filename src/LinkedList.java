
public class LinkedList<T> {

	private Node<T> head;
	private int size;
	
	public LinkedList()
	{
			head = new Node<T>();
			size = -1;
	}
	
	public int size()
	{
		return size + 1;
	}
	
	public void add(T item)
	{
		
		Node<T> newNode = new Node<T>(item);
		find(size).setNext(newNode);
		size++;
	}
	
	public void add(T item, int index)
	{
		Node<T> newNode = new Node<T>(item);
		Node<T> previousNode = find(index - 1);
		Node<T> currentNode = find(index);
		previousNode.setNext(newNode);
		newNode.setNext(currentNode);
		size++;
	}
	
	private Node<T> find(int index)
	{
		Node<T> currentNode = head;
		
		for(int i = -1; i < index; i++)
		{
			currentNode = currentNode.getNext();
		}
		return currentNode;
	}
	
	public T get(int index)
	{
		return find(index).getItem();
	}
	
}
