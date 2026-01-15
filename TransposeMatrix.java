
// WAP to create 3 x 3 matrix and transpose matrix 


import java.util.*;
public class TransposeMatrix
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
		
		System.out.println("Dsiaplay matrix");
		for(int i=0;i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
		
		System.out.println("display Transpose Matrix"); //convert row into column
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.print(a[j][i]+ " ");
			}
			System.out.println();
		}
	}
}
			
/* C:\Program Files\Java\jdk-21\bin\Array>javac TransposeMatrix.java

C:\Program Files\Java\jdk-21\bin\Array>java TransposeMatrix
Enter values:
2
3
4
1
6
7
8
9
0
Dsiaplay matrix
2 3 4
1 6 7
8 9 0
display Transpose Matrix
2 1 8
3 6 9
4 7 0
 */