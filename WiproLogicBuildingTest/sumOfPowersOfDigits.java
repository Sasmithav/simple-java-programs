/*INPUT:233
OUTPUT:36
EXPLANATION:(2 raised to power of 3)+(3 raised to power of 3)+(3 raised to power of 0)*/


public class MyClass {
    public static void main(String args[]) {
       int input1=233;
       String inp=String.valueOf(input1);
       int d1,d2;
       int index,sum=0;
  //  System.out.print(inp);
    for( index=0;index<inp.length()-1;index++){
        d1=Character.getNumericValue(inp.charAt(index));
        d2=Character.getNumericValue(inp.charAt(index+1));
        sum=sum+(int)Math.pow(d1,d2);
    }
    int a=Character.getNumericValue(inp.charAt(inp.length()-1));
    sum=sum+(int)Math.pow(a,0);
    System.out.println(sum);
    }    
}
