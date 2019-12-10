package program;

import java.util.Arrays;

public class Anargam {

    public static void isAnagram(String s1,String s2){

        String copyOfs1=s1.replaceAll("\\s","");
        String copyOfs2=s2.replaceAll("\\s","");

        boolean status=true;

        if(copyOfs1.length()!=copyOfs2.length()){
            status=false;
        }

        else{

            char[] c1=copyOfs1.toLowerCase().toCharArray();
            char[] c2=copyOfs2.toLowerCase().toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);

            status=Arrays.equals(c1,c2);
        }
        if(status){
            System.out.println("anargam number");

        }else {
            System.out.println("not anargam");
        }

    }
    public static void main(String[] args)
    {
        isAnagram("Mother In Law", "Hitler Woman");

        isAnagram("keEp", "peeK");


    }
}
