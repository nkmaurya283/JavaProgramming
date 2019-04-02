package program;
//this string reverse programs

public class ReverseStringIterative {

    public static void  main(String args[]){
        String y="";
        String str="java";
        char[] x=str.toCharArray();
        for (int i=x.length-1;i>=0;i--){


            y=y+x[i];

        }
System.out.println(y);
    }
}
