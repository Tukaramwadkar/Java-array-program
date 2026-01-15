

//✅ 14. Swap First and Last Element

public class Array8
{
	public static void main(String [] x)
	{
		int a[]={10,20,30,40};
		
		
		int temp=a[0];
		a[0]=a[a.length-1];
		a[a.length-1]=temp;
		
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]+" ");
		}
	}
}

/* C:\Program Files\Java\jdk-21\bin\Array>javac Array8.java

C:\Program Files\Java\jdk-21\bin\Array>java Array8
40
20
30
10 */