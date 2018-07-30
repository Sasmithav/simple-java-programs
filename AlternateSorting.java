import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k;
        int arr[]=new int[n];
       
        int arr1[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
      Arrays.fill(arr1,0);
      k=0;
      int l=n-1;
      int m=0;
    for(int i=0;i<n;i++){
        if(k%2==0){
            arr1[k]=arr[l--];
            
    }
   else{
       arr1[k]=arr[m++];
   }
        k++;
       
    }
       for(int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
        } 
    
    
    }
}
