

//Example:WAP to create two arrays of size 5 and merge them in third array 


import java.util.*;
public class MergeArray
{
	public static void main(String [] x)
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int [5];
		int b[]=new int [5];
		int c[]=new int [a.length+b.length];
		System.out.println("Enter values in first array");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter values in second array");
		for(int i=0; i<b.length; i++)
		{
			b[i]=sc.nextInt();
		}
		
		
		for(int i=0; i<a.length;i++)
		{
			c[i]=a[i];
		}
		for(int i=0; i<b.length; i++)
		{
			c[a.length+i]=b[i];
		}
		System.out.printf("merge array: ");
		for(int i=0; i<c.length; i++)
		{
			
			System.out.print(c[i]+" ");
		}
		
	}
}
			
	/* 	
		C:\Program Files\Java\jdk-21\bin\Array>javac MergeArray.java

C:\Program Files\Java\jdk-21\bin\Array>java MergeArray
Enter values in first array
1
2
3
4
5
Enter values in second array
6
7
8
9
0
merge array
merge array: 1 2 3 4 5 6 7 8 9 0 */