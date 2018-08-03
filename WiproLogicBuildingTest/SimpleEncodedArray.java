import java.io.*;
import  java.util.*;

// Read only region start
class UserMainCode
{

	public class Result{
		public final int output1;
		public final int output2;

		public Result(int out1, int out2){
			output1 = out1;
			output2 = out2;
		}
	}
	
    public Result findOriginalFirstAndSum(int[] input1,int input2){
    	// Read only region end
        //Write code here...
        int sub=input1[input2-1];
		int index,sum=0;
		int a[]=new int[input2];
		a[0]=sub;
		int k=1;
		for( index=input2-2;index>=0;index--){
			sub=input1[index]-sub;
		     a[k++]=sub;
		}
		for(index=0;index<a.length;index++){
			sum=sum+a[index];
		}
		int first=a[input2-1];
		Result r=new Result(first,sum);
		return r;
    }
}
