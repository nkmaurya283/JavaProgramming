package lambda;

import java.util.ArrayList;
import java.util.Iterator;

public class Lambda {





    public  static void main(String args[]){

        ArrayList<String> ar=new ArrayList<>();
        ar.add("Ram");
        ar.add("Shyma");
        ar.add("mataSita");
        ar.add("Radha");

        ar.forEach(x->System.out.println(x));
        for(String y:ar){
            System.out.println(y);
        }
        Iterator itr=ar.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
