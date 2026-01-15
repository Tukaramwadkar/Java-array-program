



 
//Example: WAP to create 3 x 3 matrix and calculate sum of column  

import java.util.*; 
public class SUMAPP 
{  public static void main(String x[]) 
   {  Scanner xyz  = new Scanner(System.in); 
      int a[][]=new int[3][3]; 
   System.out.println("Enter values in array"); 
   for(int i=0; i<a.length; i++) 
   { for(int j=0;j<a[i].length; j++) 
   { a[i][j]=xyz.nextInt(); 
   } 
   } 
   System.out.println("display matrix"); 
   for(int i=0;i<a.length;i++) 
   {  for(int j=0; j<a[i].length; j++) 
   {   System.out.printf("%d\t",a[i][j]); 
   } 
   System.out.printf("\n"); 
   } 
      
      for(int j=0; j<a.length; j++) 
   {   int sum=0; 
      for(int i=0; i<a.length; i++) 
   { 
     sum = sum + a[i][j]; 
   } 
   System.out.printf("Sum  = %d\n",sum); 
   } 
   }  
} 
 
 /* C:\Program Files\Java\jdk-21\bin\Array>javac SUMAPP.java

C:\Program Files\Java\jdk-21\bin\Array>java SUMAPP
Enter values in array
4
6
8
9
3
2
7
9

6
display matrix
4       6       8
9       3       2
7       9       6
Sum  = 20
Sum  = 18
Sum  = 16 */