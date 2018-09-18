/*INPUT:(())
OUTPUT:valid
INPUT:)(
OUTPUT:Invalid*/

import java.util.*;
public class MyClass {
    public static void main(String args[]) {
       String s="((())";
       Stack st=new Stack();
       for(int i=0;i<s.length();i++){
       if(s.charAt(i)=='(')
              st.push(s.charAt(i));
       else{
           if(!st.isEmpty())
             st.pop();
        else{
            System.out.print("Invalid"); 
            System.exit(0);
        }
       }}
       if(st.isEmpty())
       System.out.print("Valid");
       else
       System.out.print("Invalid");
    }
}
