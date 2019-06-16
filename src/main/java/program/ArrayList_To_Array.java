package program;

import java.util.ArrayList;

class ArrayList_To_ {

    public static void main(String args[]){
        ArrayList<String>   list=new ArrayList<String>();

        list.add("navneet");
        list.add("Kumar");
        list.add("maurya");

        String[]  array=new String[list.size()];
        list.toArray(array);

        for (String string : array)
        {
            System.out.println(string);
        }
    }



}
