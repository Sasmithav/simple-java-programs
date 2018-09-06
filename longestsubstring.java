/*To find the length of longest substring without repeationg characters
INPUT:geeksforgeeks
OUTPUT:7 */


public class MyClass {
    public static void main(String args[]) {
       String inp=args[0];
       //System.out.print(s);
       String s="";
       int i,len=0,prevlen=0;
       for(i=0;i<inp.length();i++){
           if(!s.contains(inp.substring(i,i+1))){
               s=s+inp.charAt(i);
               len=s.length();
                 if(len>prevlen)
                    prevlen=len;
           }
    
       
             else{
                 s="";
                 s=s+inp.charAt(i);
             }
       }
             System.out.println(prevlen);
    }
}
