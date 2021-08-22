import java.util.*;
public class duplicateword
{
  public static void main(String x[])
  {
    Scanner sc= new Scanner(System.in);
	System.out.println("enter a string");
	String s=sc.nextLine();
	String[] w= s.toLowerCase().trim().split(" ");
	int count=1;
	for(int i=0;i<w.length;i++)
	{
		count=1;
		for(int j=i+1;j<w.length;j++)
		{
			if(w[i].equals(w[j]))
			{
				count++;
			}
			
		}
		if(count>1)
		{
			System.out.print(w[i]+"    repeated    ");
			System.out.println(count+"    times");
		}
	}
	
	  

  }
}