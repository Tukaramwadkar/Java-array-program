

/* max sum find in sliding window
 */
import java.util.*;
public class MaxSum
{
	public static void main(String [] x)
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int k=4;
		System.out.println("Enter values in array");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=0;
		int max=Integer.MIN_VALUE;
		for(int i=0; i<k; i++)
		{
			sum=sum+a[i];
		}
		for(int i=k;i<a.length; i++)
		{
			sum=sum+a[i]+a[i-k];
			if(sum>max)
			{
				max=sum;
			}
		}
		System.out.println("max sum is : " +max);
	}
}
		

C:\Program Files\Java\jdk-21\bin\Array>javac MaxSum.java

C:\Program Files\Java\jdk-21\bin\Array>java MaxSum
Enter values in array
1
3
4
6
8
max sum is : 23