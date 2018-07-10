/* package whatever; // don't place package name! */  
 
import java.util.*;
import java.lang.*;
 
public class CurrencyNote
{
public static void main (String[] args) throws java.lang.Exception 
  { 
   // your code goes here 
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
  int b,count=0;
    if(n>=1000){
    b=n/1000;
     count=count+b;
    n=n-(b*1000);
    System.out.println(n);
    }
  if(n>=500){
    b=n/500;
    count=count+b;
    n=n-(b*500);
     System.out.println(n);
  }
    
    if(n>=100){
      b=n/100;
      count=count+b;
      n=n-(b*100);
      System.out.println(n);
    }
    if(n>=50){
      b=n/50;
      count=count+b;
      n=n-(b*50);
      System.out.println(n);
    }
      if(n>=10){
        b=n/10;
        count=count+b;
        n=n-(b*10);
        System.out.println(n);
      }
        if(n>=1){
         b=n/1;
        count=count+b;
        n=n-(b*1);
        System.out.println(n);
        }
        
        if(n==0){
        System.out.print(count);
}}
 }
