import java.io.*;
import  java.util.*;

// Read only region start
class UserMainCode
{

	public int countPrimesInRange(int input1,int input2){
		// Read only region end
		// Write code here...
		int i,count=0;
	for( i=input1;i<=input2;i++){
		int c=isprime(i);
    if(c==1)
		count++;
}
	return count;
	
}
 static int isprime(int n)
	{
		if(n!=2 && n%2==0)
			return 0;
		for(int j=3;j<n/2;j++){
			if(n%j==0)
				return 0;
		}
		return 1;
	}
		
	}
