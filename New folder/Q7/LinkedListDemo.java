import java.util.*;

class LinkedListDemo
{
	public static void main(String args[])
	{
		LinkedList ll=new LinkedList();
		System.out.println (ll.size());
		
		ll.add("A");
		ll.add("B");
		ll.add("C");
		ll.add("D");
		ll.add("E");
		
		System.out.println (ll);
		
		ll.addFirst("F");
		System.out.println (ll);
		
		ll.addLast("G");
		System.out.println (ll);
		
		System.out.println (ll.contains("A"));
		System.out.println (ll.contains("L"));
		
		ll.removeFirst();
		System.out.println (ll);
		
		
		ll.removeLast();
		System.out.println (ll);
		
		System.out.println (ll.getFirst());
		System.out.println (ll.getLast());
		
		Iterator itr=ll.iterator();
		while(itr.hasNext())
		{
			System.out.println (itr.next());
		}
		
		ListIterator litr=ll.listIterator();
		while(litr.hasNext())
		{
			System.out.println (litr.next());
		}
		
		while(litr.hasPrevious())
		{
			System.out.println (litr.previous());
		}
	}
}