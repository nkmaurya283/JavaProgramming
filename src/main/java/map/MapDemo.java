package map;

import java.util.HashMap;
import java.util.Map;

import static jdk.nashorn.internal.objects.NativeArray.forEach;

public class MapDemo {

    public static void main(String args[]){

        Map<Integer,String> map=new HashMap<>();
        map.put(1,"Navneet");
        map.put(2,"Rinku");


        for(Map.Entry hm:map.entrySet()){

            System.out.println("Keays are"+hm.getKey()+"values are"+hm.getValue());
        }
         map.forEach((K,V)->System.out.println(K+V));
        }
    }


