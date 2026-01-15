

import java.util.*; 
public class MAPP 
{  public static void main(String x[]) 
   {  Scanner xyz  = new Scanner(System.in); 
      int a[][]=new int[3][3]; 
   System.out.println("Enter values in array"); 
   for(int i=0; i<a.length; i++) 
   { 
      for(int j=0;j<a[i].length; j++) 
   { 
      a[i][j]=xyz.nextInt(); 
   } 
   } 
   System.out.println("display matrix"); 
   for(int i=0;i<a.length;i++) 
   { 
      for(int j=0; j<a[i].length; j++) 
   { System.out.printf("%d\t",a[i][j]); 
   } 
   System.out.printf("\n"); 
   } 
           
   }  
}



/* C:\Program Files\Java\jdk-21\bin\Array>javac MAPP.java

C:\Program Files\Java\jdk-21\bin\Array>java MAPP
Enter values in array
4
6
7
8
3
3
2
5
6
display matrix
4       6       7
8       3       3
2       5       6 */