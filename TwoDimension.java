



//Simple two dimension array


import java.util.*;
public class TwoDimension
{
	public static void main(String [] x)
	{
		int a[] []=new int [3][2];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values in array");
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Display matrix");
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.print(a[i][j]+ "  ");
			}
			System.out.println();
		}
	}
}

/* C:\Program Files\Java\jdk-21\bin\Array>javac TwoDimension.java

C:\Program Files\Java\jdk-21\bin\Array>java TwoDimension
Enter values in array
2
3
1
5
4
6
7
8
9
Display matrix
2  3  1  5  4  6  7  8  9
C:\Program Files\Java\jdk-21\bin\Array>javac TwoDimension.java

C:\Program Files\Java\jdk-21\bin\Array>java TwoDimension
Enter values in array
2
3
4
5
6
1
7
8
9
Display matrix
2  3  4
5  6  1
7  8  9

C:\Program Files\Java\jdk-21\bin\Array>javac TwoDimension.java

C:\Program Files\Java\jdk-21\bin\Array>java TwoDimension
Enter values in array
2
4
5
1
6
7
Display matrix
2  4
5  1
6  7 */