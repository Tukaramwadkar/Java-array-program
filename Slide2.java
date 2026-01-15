

//Example: WAP to calculate average of all sub array  

import java.util.*;
public class Slide2
{
	public static void main(String [] x)
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int [6];
		int k=3;
		System.out.println ("Enter values in array");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		int sum=0;
		for(int i=0; i<k; i++)
		{
			sum=sum+a[i];
			System.out.println("Window 1 avg is:" +(sum/k));
		}
		for(int i=k; i<a.length; i++)
		{
			sum=sum+a[i]-a[i-k];
			System.out.println("Next Window avg is:" +(sum/k));
		}
	}
}
		
		
/* C:\Program Files\Java\jdk-21\bin\Array>javac Slide2.java

C:\Program Files\Java\jdk-21\bin\Array>java Slide2
Enter values in array
1
4
7
6
4
3
Window 1 avg is:0
Window 1 avg is:1
Window 1 avg is:4
Next Window avg is:5
Next Window avg is:5
Next Window avg is:4 */