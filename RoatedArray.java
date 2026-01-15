



//Example: WAP to create array of size 5 and rotate by in clock wise direction using specified size.


import java.util.*;
public class RoatedArray
{
	public static void main(String [] x)
	{
		Scanner sc=new Scanner(System.in);
		
		int a[]=new int[5];
		
		System.out.println("Enter values in array");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enetr rotate values");
		int rotate=sc.nextInt();
		
		rotate=rotate%a.length;   // To avoid extra rotation
		
		for(int r=0; r<rotate; r++)  // Rotate array clockwise
		{
			int last=a[a.length-1];   // store last element
			
			for(int i=a.length-1; i>0; i--) // shift all elements right
			{
				a[i]=a[i-1];
			}
			a[0]=last;     // place last element at first
		}
		System.out.println("Array after clockwise rotation");      // Print result
		for(int i=0; i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
		
	
	
/* C:\Program Files\Java\jdk-21\bin\Array>javac RoatedArray.java

C:\Program Files\Java\jdk-21\bin\Array>java RoatedArray
Enter values in array
1
2
3
4
5
Enetr rotate values
2
Array after clockwise rotation
4 5 1 2 3
C:\Program Files\Java\jdk-21\bin\Array>java RoatedArray
Enter values in array
6
7
8
4
3
Enetr rotate values
4
Array after clockwise rotation
7 8 4 3 6 */