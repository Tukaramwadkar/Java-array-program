

import java.util.*; 
public class CAAPP 
{   public static void main(String x[]) 
 { 
    Scanner xyz  = new Scanner(System.in); 
    int a[]=new int[5]; 
     System.out.println("Enter values in first array"); 
    for(int i=0; i<a.length; i++) 
    { 
        a[i]=xyz.nextInt(); 
    } 
    System.out.println("\nOriginal Array\n"); 
    for(int i=0; i<a.length; i++) 
    { System.out.printf("%d\t",a[i]); 
    } 
    int start=0,end=(a.length-1); 
    while(start<=end) 
    {int temp=a[start]; 
         a[start]=a[end]; 
   a[end]=temp; 
   start++; 
   end--; 
    } 
    System.out.println("\nArray after reverse"); 
    for(int i=0; i<a.length; i++) 
    { System.out.printf("%d\t",a[i]); 
    } 
     int k=2; 
      start=0; 
      end=k-1; 
   while(start<=end) 
   { int temp=a[start]; 
         a[start]=a[end]; 
   a[end]=temp; 
   start++; 
   end--; 
   } 
      System.out.println("\nArray after reverse"); 
    for(int i=0; i<a.length; i++) 
    { System.out.printf("%d\t",a[i]); 
    }
 }
}