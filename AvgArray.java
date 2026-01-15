

//Example: WAP to calculate average of all sub array 

 
import java.util.*; 
public class AvgArray 
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
     
  System.out.printf("%f\t",(double)sum/k);  //3/2 
    for(int i=k; i<a.length; i++) 
    {   sum = sum + a[i]-a[i-k]; 
     System.out.printf("%f\t",(double)sum/k); 
    } 
     
   } 
} 



/* C:\Program Files\Java\jdk-21\bin\Array>java AvgArray.java
Enter values in array
2
4
5
6
7
3.000000        4.500000        5.500000        6.500000 */