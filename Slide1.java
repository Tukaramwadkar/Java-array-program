
//Example: count the sub arrays with Sum Equals to Target (fixed windows size) 

import java.util.*;
public class Slide1
{
	public static void main(String [] x)
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[6];
		int k=2;
		int targetsum=7;
		System.out.println("Enter values in array");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		int count=0;
		int sum=0;
		for(int i=0; i<k; i++)
		{
			sum=sum+a[i];
			if(sum==targetsum)
			{
				count++;
			}
		}
		for(int i=k; i<a.length; i++)
		{
			sum=sum+a[i]-a[i-k];
			if(sum==targetsum)
			{
				count++;
			}
		}
		System.out.println("count is:" +count);
	}
}
		
		

/* C:\Program Files\Java\jdk-21\bin\Array>javac Slide1.java

C:\Program Files\Java\jdk-21\bin\Array>java Slide1
Enter values in array
1
2
3
4
5
6
count is:1

C:\Program Files\Java\jdk-21\bin\Array>java Slide1
Enter values in array
6
5
4
7
3
2
count is:0 */