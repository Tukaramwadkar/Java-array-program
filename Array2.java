

//check the array is sirted or not


public class Array2
{
	public static void main(String [] x)
	{
		int arr[]={1,2,4,6};
		
		boolean sorted=true;
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]<arr[i-1])
			{
				sorted=false;
				break;
			}
		}
		if(!sorted)
		{
			System.out.println("array is unsorted");
		}
		else
		{
			System.out.println("array is sorted");
		}
	}
}


/* C:\Program Files\Java\jdk-21\bin\Array>javac Array2.java

C:\Program Files\Java\jdk-21\bin\Array>java Array2
array is sorted
 */