


// calculate sum column 3*3 matrix

import java.util.*;
public class SumOfMatrix
{
	public static void main(String [] x)
	{
		Scanner sc=new Scanner(System.in);
		
		int a[][]=new int [3][3];
		
		System.out.println("Enter values:");
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Disaplay matrix");
		for(int i=0;i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
		
		
		
		for(int j=0; j<a.length; j++)
		{
			int sum=0;
			for(int i=0; i<a.length; i++)
			{
				sum=sum+a[i][j];
			}
			System.out.println("Sum is:" +sum);
		}
	}
}
		
		
		
/* C:\Program Files\Java\jdk-21\bin\Array>javac SumOfMatrix.java

C:\Program Files\Java\jdk-21\bin\Array>java SumOfMatrix
Enter values:
4
3
2
1
5
7
8
9
0
Disaplay matrix
4 3 2
1 5 7
8 9 0
Sum is:13
Sum is:17
Sum is:9 */