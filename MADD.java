

//Example: WAP to create two matrix of 3 x  3 and calculate its addition and store in third 
//matrix 



import java.util.*; 
public class MADD 
{   public static void main(String x[]) 
 {  int a[][]=new int[3][3]; 
    int b[][]=new int[3][3]; 
    int c[][]=new int[3][3]; 
    Scanner xyz = new Scanner(System.in); 
    System.out.println("Enter values in first matrix "); 
    for(int i=0; i<a.length; i++) 
    { 
        for(int j=0; j<a[i].length; j++) 
     { 
         a[i][j]=xyz.nextInt(); 
     } 
    } 
  System.out.println("Enter values in second matrix"); 
    for(int i=0; i<b.length; i++) 
    { 
        for(int j=0; j<b[i].length; j++) 
     { 
         b[i][j]=xyz.nextInt(); 
     } 
    } 
   //perform addition logic  
    for(int i=0; i<b.length; i++) 
    { 
        for(int j=0; j<b[i].length; j++) 
     { 
         c[i][j]=a[i][j]+b[i][j]; 
     } 
    } 
    System.out.println("Display the first matrix"); 
    for(int i=0; i<a.length; i++) 
    { 
        for(int j=0; j<a[i].length; j++) 
     { 
         System.out.printf("%d\t",a[i][j]); 
     } 
     System.out.printf("\n"); 
    } 
     System.out.println("Display the second matrix"); 
    for(int i=0; i<a.length; i++) 
    { 
        for(int j=0; j<a[i].length; j++) 
     { 
         System.out.printf("%d\t",b[i][j]); 
     } 
     System.out.printf("\n"); 
    } 
     System.out.println("Display the Resultant matrix"); 
    for(int i=0; i<a.length; i++) 
    { 
        for(int j=0; j<a[i].length; j++) 
     { 
         System.out.printf("%d\t",c[i][j]); 
     } 
     System.out.printf("\n"); 
    } 
 } 
}