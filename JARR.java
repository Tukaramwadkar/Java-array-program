

//jagged array

import java.util.*; 
public class JARR 
{ 
   public static void main(String x[]) 
   {   Scanner xyz  = new Scanner(System.in); 
       int a[][]=new int[3][]; 
    a[0]=new int[3]; 
    a[1]=new int[2]; 
    a[2]=new int[4]; 
    System.out.println("Enter values in matrix"); 
    for(int i=0; i<a.length;i++) 
    { 
        for(int j=0; j<a[i].length; j++) 
     { 
        a[i][j]=xyz.nextInt(); 
     } 
    } 
    System.out.println("Display matrix"); 
    for(int i=0; i<a.length;i++) 
    { 
        for(int j=0; j<a[i].length; j++) 
     { 
        System.out.printf("%d\t",a[i][j]); 
     } 
     System.out.printf("\n"); 
    } 
   } 
}

/* C:\Program Files\Java\jdk-21\bin\Array>javac JARR.java

C:\Program Files\Java\jdk-21\bin\Array>java JARR
Enter values in matrix
3
5
6
2
3
4
5
6
7
Display matrix
3       5       6
2       3
4       5       6       7 */