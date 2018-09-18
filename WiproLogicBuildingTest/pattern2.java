/*Input :
4
Output:
1
2*2
3*3*3
4*4*4*4
4*4*4*4
3*3*3
2*2
1*/

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
		        if(j==1)
		        System.out.print(k);
		        else
		        System.out.print("*"+k);
		    }
		    k++;
		    System.out.println();
		}
		k--;
	    for(i=1;i<=m;i++){
	        for(j=m;j>=i;j--){
	            if(j==m)
	            System.out.print(k);
	            else
	            System.out.print("*"+k);
	        }
	        k--;
	        System.out.println();
	    }
       
    }
}
