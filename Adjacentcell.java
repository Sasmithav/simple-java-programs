/* The two cells on the ends have a single adjacent cell, so the other adjacent cell can be assumed to be always inactive. Even after updating the cell state. Consider its previous state for updating the state of other cells. Update the cell information of all cells simultaneously.

Write a function cellCompete which takes one 8 element array of integers cells representing the current state of 8 cells and one integer days representing the number of days to simulate. An integer value of 1 represents an active cell and value of 0 represents an inactive cell.

Input: [1,0,0,0,0,1,0,0],1

Expected return value: [0,1,0,0,1,0,1,0]*/
 import java.util.*;
public class MyClass {
    void cellComplete(int arr[]){
        int n=arr.length;
        int a[]=new int[n];
        int i;
        for(i=0;i<n;i++){
            a[i]=arr[i];
        }
        for(i=0;i<n;i++){
            if(i==0){
                arr[i]=a[i+1];
            }
            else if(i==n-1)
            {
                arr[i]=a[i-1];
            }
            else
            {
                if(a[i-1]==a[i+1]){
                    arr[i]=0;
                }
                else
                 arr[i]=1;
            }
        }
            for(i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
    }
    public static void main(String args[]) {
        MyClass mc=new MyClass();
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int ar[]=new int[m];
        int i;
        //int a[]=new int[n];
        for(i=0;i<m;i++){
            ar[i]=sc.nextInt();
        }
        for(i=0;i<2;i++){
             mc.cellComplete(ar);
        }
        
    }
}
