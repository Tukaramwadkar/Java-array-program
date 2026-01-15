

//✅ 10. Frequency of Each Element

public class Array7
{
	public static void main(String [] x)
	{
		int a[]={1,2,2,3,3,3};
		
		boolean visited[]=new boolean[a.length];
		
		for(int i=0; i<a.length; i++)
		{
			if(visited[i])
			{
				continue;
			}
			
			int count=1;
			
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					visited[j]=true;
					count++;
				}
			
			}
			System.out.println(a[i]+"----> " +count+ " times");
		}
		
	}
}

/* 
C:\Program Files\Java\jdk-21\bin\Array>javac Array7.java

C:\Program Files\Java\jdk-21\bin\Array>java Array7
1----> 1 times
2----> 2 times
3----> 3 times */