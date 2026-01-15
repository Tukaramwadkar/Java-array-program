

//Find the k th highest value in  array          k=2;



public class KApp
{
	public static void main(String []x)
	{
		int a[]={15,8,22,4,10,18};
		
		int max=a[0];
		int smax=Integer.MIN_VALUE;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max)
			{
				smax=max;
				max=a[i];
			}
			else if(a[i]>smax  && a[i]!=max)
			{
				smax=a[i];
			}
			else{
			}
		}
		if(smax!=Integer.MIN_VALUE)
		{
			System.out.println("K th postion value is: " +smax);
		}
		else
		{
			System.out.println("No value found");
		}
	}
}

/* C:\Program Files\Java\jdk-21\bin\Array>javac KApp.java

C:\Program Files\Java\jdk-21\bin\Array>java KApp
K th postion value is: 18 */