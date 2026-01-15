

 /*Example: WAP to create array of size 10 and store 10 values in it and find the duplicated 
values from array */ 
 
import java.util.*; 
public class FD 
{    public static void main(String x[]) 
  {  int a[]=new int[10]; 
     Scanner xyz  = new Scanner(System.in); 
  System.out.println("Enter values in array"); 
  for(int i=0; i<a.length; i++) 
  { 
     a[i]=xyz.nextInt(); 
  } 
      Arrays.sort(a); 
     System.out.println("Display array after sorting"); 
        for(int i=0; i<a.length; i++) 
        { System.out.printf("%d\t",a[i]); 
        }    
  int count=1; 
  //duplicate logics  
  for(int i=1; i<a.length; i++) 
  { 
      if(a[i]==a[i-1]) 
      {  ++count; 
      } 
      else{ 
       if(count>1) 
       { System.out.printf("\n%d ---->%d",a[i-1],count); 
       } 
       
      } 
  } 
   
   
  } 
}

/* C:\Program Files\Java\jdk-21\bin\Array>javac FD.java

C:\Program Files\Java\jdk-21\bin\Array>java FD
Enter values in array
2
5
8
9
2
3
4
5
6
7
Display array after sorting
2       2       3       4       5       5       6       7  89
2 ---->2
3 ---->2
4 ---->2
5 ---->3
6 ---->3
7 ---->3
8 ---->3 */