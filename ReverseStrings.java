import java.util.*;
public class ReverseStrings {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       String a[]=s.split(" ");
       StringBuilder sb=new StringBuilder();
       for(int i=0;i<a.length;i++){
           sb.append(a[i]);
           String s1=sb.reverse().toString();
           System.out.print(s1+" ");
           sb.delete(0,sb.length());
       }
    }
}
