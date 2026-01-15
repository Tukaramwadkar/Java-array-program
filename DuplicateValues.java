

/* Duplicate Elemnet find out from array */


import java.util.*;
public class DuplicateValues
{
	public static void main(String [] x)
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int [5];
		
		System.out.println("Enter values in array");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		boolean flag=false;
		for(int i=0;i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					flag=true;
					System.out.println(a[i]+" ," +a[j]);
					break;
				}
			}
		}
		if(flag)
		{
			System.out.println("duplicate found");
		}
		else
		{
			System.out.println("No duplicate found");
		}
	}
}


/* C:\Program Files\Java\jdk-21\bin\Array>javac DuplicateValues.java

C:\Program Files\Java\jdk-21\bin\Array>java DuplicateValues
Enter values in array
1
2
2
3
1
1 ,1
2 ,2
duplicate found */