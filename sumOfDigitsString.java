import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
         Scanner sc=new Scanner(System.in);
      String s=sc.next();
      int sum=0,n;
      for(int i=0;i<s.length();i++){
          if(Character.isDigit(s.charAt(i)))
          {
              n=Character.getNumericValue(s.charAt(i));
              sum=sum+n;
              }
      }
      System.out.println(sum);
    }
}


//this alternate code will work until there is atleast one digit in the string
import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      String str = "abcx1yz";  
      int sum=0,i;
  str = str.replaceAll("[^0-9]+", "");
 System.out.print(str);
  String arr[]=str.split("");
  for(String s:arr){
  //System.out.println(s+" ");
  i=Integer.parseInt(s); 
  sum=sum+i;
}
      System.out.println(sum);
    }
}

