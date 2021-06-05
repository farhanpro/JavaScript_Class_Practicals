import java.util.*;
class ArrayListDemo
{
	public static void main(String args[])
	{
		ArrayList al=new ArrayList();
		
		System.out.println (al.isEmpty());
		System.out.println (al.size());
		
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("E");
	
		System.out.println (al.size());
		
		System.out.println (al);
		
		al.add(1,"F");
		
		System.out.println (al);
		
		System.out.println (al.contains("F"));
		System.out.println (al.contains("G"));
		
		System.out.println (al.isEmpty());
		
		System.out.println (al.get(1));
		
		al.remove(1);
		System.out.println (al);
		
		al.remove("E");
		System.out.println (al);
		
		System.out.println (al.indexOf("C"));
		
		al.add("C");
		System.out.println (al);
		System.out.println (al.indexOf("C"));
		
		System.out.println (al.lastIndexOf("C"));
		
		al.set(4,"E");
		System.out.println (al);
		
		Object arr[]=al.toArray();
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println ((String)arr[i]);
		}
		
		ArrayList al1=new ArrayList();
		
		al1.add("F");
		al1.add("G");
		al1.add("H");
		al1.add("I");
		
		System.out.println (al1);
		
		al.addAll(al1);
		System.out.println (al);
		
		System.out.println (al.containsAll(al1));
		
		al.remove("F");
		
		System.out.println (al.containsAll(al1));
		
		Iterator itr=al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println (itr.next()+"");
		}
		System.out.println ("-------------------");
		ListIterator litr=al.listIterator();
		while(litr.hasNext())
		{
			System.out.println (litr.next());
		}
		System.out.println ("-------------------");
		while(litr.hasPrevious())
		{
			System.out.println (litr.previous());
		}
	}
}