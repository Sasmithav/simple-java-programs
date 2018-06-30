import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      String str = "abc123x1yz";  
      int sum=0,i;
  str = str.replaceAll("[^0-9]+", " ");
 // System.out.print(str);
  String arr[]=str.trim().split(" ");
  for(String s:arr){
  //System.out.println(s+" ");
  i=Integer.parseInt(s); 
  sum=sum+i;
}
      System.out.println(sum);
    }
}
