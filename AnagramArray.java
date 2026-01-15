
//Example: WAP to create two array of size 5 and check array is anagram or not 

import java.util.*;
public class AnagramArray
{
	public static void main(String [] x)
	{
		int a[]=new int[5];
		int b[]=new int [5];
		Scanner sc=new Scanner(System.in);
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
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		boolean flag=true;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]!=b[i])
			{
				flag=false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Arrays are Anagram");
		}
		else
		{
			System.out.println("Arrays not Anagram");
		}
	}
}
		
	/* 	C:\Program Files\Java\jdk-21\bin\Array>javac AnagramArray.java

C:\Program Files\Java\jdk-21\bin\Array>java AnagramArray
Enter values in first array
1
4
3
5
2
Enter values in second array
1
2
3
4
5
Arrays are Anagram

C:\Program Files\Java\jdk-21\bin\Array>java AnagramArray
Enter values in first array
5
6
4
3
2
Enter values in second array
3
4
5
6
7
Arrays not Anagram
 */