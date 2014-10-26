
public class CustomLinkedList {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Tobias");
		list.add("Simon");
		list.add("Patrick");
		list.add("julemanden", 2);
		System.out.println(list.get(2));
		System.out.println("Dump:");
		for(int i = 0; i < list.size(); i++)
		{
			System.out.println(i + ": " + list.get(i));
		}
	}

}

