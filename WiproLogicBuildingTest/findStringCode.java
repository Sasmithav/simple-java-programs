import java.util.*;
public class findStringCode {
    public static void main(String args[]) {
        String input1="WORLD WIDE WEB";
        input1=input1.toLowerCase();
		String s[]=input1.split(" ");
		String concat="";
		String key="abcdefghijklmnopqrstuvwxyz";
		StringBuffer  s1=new StringBuffer();
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int i=0;i<s.length;i++){
			for(int j=0;j<s[i].length();j++){
				for(int k=0;k<key.length();k++){
					if(s[i].charAt(j)==key.charAt(k))
						arr.add(k+1);
				}
			}
			System.out.println(arr);
			int len=arr.size();
			int sum=0;
		     int l=0,m=len-1;
				if(len%2==0)
				{
				    while(l<m){
					
						sum=sum+Math.abs(arr.get(l)-arr.get(m));
						l++;
						m--;
					}
						System.out.println(sum);
				}
			
				else{
				while(l<m){
					
						sum=sum+Math.abs(arr.get(l)-arr.get(m));
						l++;
						m--;
					}
					sum=sum+arr.get(len/2);
					System.out.println(sum);
				}
			
			
		    s1.append(sum);
			concat=concat+s1;
			s1.setLength(0);
			arr.clear();
		}
		int a=Integer.parseInt(concat);
		System.out.print(a);
	   
    }
}
