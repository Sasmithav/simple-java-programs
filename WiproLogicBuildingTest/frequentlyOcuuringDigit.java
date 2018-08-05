/*QUESTION
input1------Array of Integers
input2------Size of the array
Return the most frequently ocuuring digit in all 
the integers.
If two integers have the same frequency return the 
largest integer*/


import java.io.*;
import  java.util.*;

// Read only region start
class UserMainCode
{

	public int mostFrequentlyOccurringDigit(int[] input1,int input2){
		// Read only region end
		// Write code here...
		int out[]=new int[10];
		int ind,count=0,result=0;
		String s1="";
		for(ind=0;ind<input1.length;ind++){
			s1=s1+String.valueOf(input1[ind]);
		}
		Arrays.fill(out,count);
		for(ind=0;ind<s1.length();ind++){
			int a=Character.getNumericValue(s1.charAt(ind));
			out[a]++;
		} 
		int max=out[0];
		for(ind=1;ind<out.length;ind++){
			if(out[ind]>=max){
				max=out[ind];
				result=ind;
			}
		}
		return result;
	}
}
