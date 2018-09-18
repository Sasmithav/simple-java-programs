/*Input:
              3  4
Output:
               3
              44
              555
              6666
              555
              44
              3*/
              
 import java.util.*;
public class MyClass {
    public static void main(String args[]) {
     
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int m=sc.nextInt();
		int i,j;
		for(i=1;i<=m;i++){
		    for(j=1;j<=i;j++){
		        System.out.print(k);
		    }
		    k++;
		    System.out.println();
		}
		k--;
	    for(i=1;i<m;i++){
	        k--;
	        for(j=m-1;j>=i;j--){
	            System.out.print(k);
	        }
	        System.out.println();
	    }
       
    }
}
