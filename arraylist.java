import java.util.*;
public class arraylist
{
	public static void main(String x[])
	{
		 ArrayList<Integer> list=new ArrayList<>();
		 for(int i=10;i<=100;i+=10)
		 list.add(i);
	     for(int i=0;i<list.size();i++)
			 System.out.print(list.get(i)+" ");
		 System.out.println();
		 for(int i : list)
			 System.out.print(i+" ");
		 System.out.println();
		 list.set(2,400);
		 System.out.println(list.contains(Integer.valueOf(50)));
		 Iterator<Integer> it=list.iterator();
		 while(it.hasNext())
			 System.out.print(it.next()+" ");
	}
}