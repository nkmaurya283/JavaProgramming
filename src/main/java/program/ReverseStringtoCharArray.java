package program;
import java.util.*;

public class ReverseStringtoCharArray {

    static  String nav="navneet";



    public static void main(String args[]){

        ReverseStringtoCharArray rev=new ReverseStringtoCharArray();
        char[] ch=nav.toCharArray();


        String str = "";

       // str = str + nav.substring(1, nav.length()-1);

        //System.out.println(str);
        StringBuilder str1=new StringBuilder();
        for(int i=1;i<nav.length()-1;i++){

            str=str1.append(ch[i])+"      ";

        }
           System.out.println(str);


    }
}
