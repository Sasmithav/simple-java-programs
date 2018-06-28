import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        //System.out.println("Hello World");
        Scanner sc=new Scanner(System.in);
        int arr[]={10,20,30,40,50,60};
     //  int s=sc.nextInt();
     // int e=sc.nextInt();
    int s=0,e=arr.length-1,sum=0;
     int flag;
     for(int i=s;i<=e;i++){
         flag=0;
         if(i<=1)
            flag=1;
         for(int j=2;j<=i/2;j++){
                 if(i%j==0)
             {
              flag=1;
              break;
             }
         }
          if(flag==0){
     System.out.print(arr[i]+" ");
     sum=sum+arr[i];
     }}
    System.out.print(sum);
    }
}
