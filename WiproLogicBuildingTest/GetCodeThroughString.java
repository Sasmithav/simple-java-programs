given a string find the length of the strings and add them if it is more than a digit ,add the digits and make it as one.
example:INPUT STRING: "wipro technologies"
        OUTPUT:8
        5+12=17
        1+7=8
        import java.io.*;
import  java.util.*;

// Read only region start
class UserMainCode
{

	public int getCodeThroughStrings(String input1){
		// Read only region end
		// Write code here...
		String input[]=input1.split(" ");
		int sum=0,num;
		for(int i=0;i<input.length;i++){
			sum=sum+input[i].length();
		}
		/*StringBuilder sb=new StringBuilder();
		sb.append(sum);   
		while(sb.length()>1){
			num=0;
			for(int i=0;i<sb.length();i++){
				num=num+Character.getNumericValue(sb.charAt(i));
			}
			sb.setLength(0);
			sb.append(num);
		}
		int a=Integer.parseInt(sb.toString());*/
		int rem=0,sum1=0;
		while(sum>0){
			rem=sum%10;
			sum1=sum1+rem;
			sum=sum/10;
		}
		return sum1;
		
	}
}
