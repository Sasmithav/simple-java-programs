/*INPUT:54
OUTPUT:13
EXPLANATION:(5+4)+(4)=13*/
import java.io.*;
import  java.util.*;

// Read only region start
class UserMainCode
{

	public int sumOfSumsOfDigits(int input1){
		// Read only region end
		// Write code here...
		String input=String.valueOf(input1);
		int k=0,adder=0;
		while(k<input.length()){
			for(int index=k;index<input.length();index++){
				adder=adder+Character.getNumericValue(input.charAt(index));
			}
			k++;
		}
		return adder;
	}
}
