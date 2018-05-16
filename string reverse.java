import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
       	Scanner sc=new Scanner(System.in);
		System.out.print("enter the string:");
		String s=sc.next();
		char ch[]=s.toCharArray();
		String rev="";
		if(s!=""&& s.length()<=10000)
		{
			for(int i=ch.length-1;i>=0;i--)
			{
				rev=rev+ch[i];
			}
		}
		System.out.println("the reversed string:"+rev);
		
    }
}
