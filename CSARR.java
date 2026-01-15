

//Example: count the sub arrays with Sum Equals to Target (fixed windows size)

import java.util.*; 
public class CSARR 
{  public static void main(String x[]) 
   {  Scanner xyz  = new Scanner(System.in); 
       int a[]=new int[5]; 
    int k=2,target=3; 
    System.out.println("Enter values in array"); 
    for(int i=0; i<a.length; i++) 
    { a[i]=xyz.nextInt(); 
    } 
    int sum=0,count=0; 
    for(int i=0; i<k; i++) 
    { 
       sum =sum+a[i]; 
    } 
    if(sum==target) 
      ++count; 
   
    for(int i=k; i<a.length; i++) 
    {   sum = sum + a[i]-a[i-k]; 
     if(sum==target) 
       ++count; 
    } 
    System.out.printf("Count is %d\n",count); 
   } 
} 

/* C:\Program Files\Java\jdk-21\bin\Array>javac CSARR.java

C:\Program Files\Java\jdk-21\bin\Array>java CSARR
Enter values in array
32
4
5
6
7
Count is 0

C:\Program Files\Java\jdk-21\bin\Array>java CSARR
Enter values in array
1
2
3
0
2
Count is 2 */