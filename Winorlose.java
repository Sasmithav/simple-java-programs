import java.io.*;
import java.util.*;
public class Winorlose  {
    public static void main(String args[]) {
        /* Read input from STDIN. Print your output to STDOUT*/




	//Write code here
   int t,ch=1;
   Scanner sc=new Scanner(System.in);
   t=sc.nextInt();
   
   while(ch<=t)
   {
     int n=sc.nextInt();
     int str[]=new int[n];
     int enr[]=new int[n];
     int i,j,pos=0,max;
     boolean bool=false;
     for( i=0;i<n;i++){
        str[i]=sc.nextInt();
     }
     for(j=0;j<n;j++){
        enr[j]=sc.nextInt();
     }
     for(i=0;i<n;i++){
        max=100000;
        bool=false;
     for(j=0;j<n;j++){
        if(enr[j]>str[i] && enr[j]<max)
        {
           bool=true;
           max=enr[j];
           pos=j;
        }
     }
        if(bool==true)
           enr[pos]=0;
        else
           break;
     
     }
     if(bool==true)
      System.out.println("WIN");
      else
      System.out.println("LOSE");
      ch=ch+1;
   }


  

    }
}
