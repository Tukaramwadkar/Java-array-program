
//Remove duplicate from sorted array

public class Array3
{
	public static void main(String [] x)
	{
		int arr[]={2,3,5,7,7,8,8,9,9};
		
		int pos=1;
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]!=arr[pos-1])
			{
				arr[pos]=arr[i];
				pos++;
			}
		}
		for(int i=0; i<pos; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}


/* 
C:\Program Files\Java\jdk-21\bin\Array>javac Array3.java

C:\Program Files\Java\jdk-21\bin\Array>java Array3
2 3 5 7 8 9 */