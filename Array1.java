

//count the frequency of element in array 

public class Array1
{
	public static void main(String [] x)
	{
		int arr[]={1,2,2,3,3,3,4};
		
		boolean visited[]=new boolean[arr.length];
		
		
		for(int i=0;i<arr.length; i++)
		{
			if(visited[i])
			{
				continue;
			}
			int count=1;
			
			for (int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					visited[j]=true;
					
				}
			}
			System.out.println(arr[i]+ "->" +count+ "times");
		}
	}
}




/* C:\Program Files\Java\jdk-21\bin\Array>javac Array1.java

C:\Program Files\Java\jdk-21\bin\Array>java Array1
1->1times
2->2times
3->3times
4->1times */