

/* Given an array [] an integer determine whether there exists a pair of elements (i,j) in any 
match with target elements   */


import java.util.*;
public class MatchPair
{
	public static void main(String [] x)
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int [5];
		int targetsum=3;
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
				if(a[i]+a[j]==targetsum)
				{
					flag=true;
					System.out.println("pair are: " +a[i]+" ," +a[j]);
					break;
				}
			}
		}
		if(flag)
		{
			System.out.println("pair found");
		}
		else
		{
			System.out.println("No pair found");
		}
	}
}
		
/* C:\Program Files\Java\jdk-21\bin\Array>javac MatchPair.java

C:\Program Files\Java\jdk-21\bin\Array>java MatchPair
Enter values in array
1
2
3
4
5
pair are: 1 ,2
pair found */