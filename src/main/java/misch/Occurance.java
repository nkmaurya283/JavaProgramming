package misch;

import java.util.HashMap;

public class Occurance {

    public static void characterCount(String input){
        char[] w=input.toCharArray();
        HashMap<Character,Integer> charmapcount=new HashMap<Character, Integer>();

        for(char x:w){

            if(charmapcount.containsKey(x)){
                charmapcount.put(x,charmapcount.get(x)+1);
            }else {
                charmapcount.put(x,1);
            }
        }
        System.out.println(charmapcount);


    }
    public static void main(String[] args)
    {
        characterCount("Java J2EE Java JSP J2EE");

        characterCount("All Is Well");

        characterCount("Done And Gone");
    }
}
