package map;

import java.util.*;

public class Employe {


    int id;
    String name;
    int age;
    String depratment;

    Employe(int id,String name,int age,String depratment){
        this.id=id;
        this.name=name;
        this.age=age;
        this.depratment=depratment;

    }

    public static void main(String args[]){

        Employe emp1=new Employe(1,"jai bajarngbali",35,"IT");
        Employe emp2=new Employe(2,"jai bajarngbali",36,"IT");
        Employe emp3=new Employe(3,"jai bajarngbali",37,"IT");
        Employe emp4=new Employe(4,"jai bajarngbali",38,"HR");

        List<Employe> list1=new ArrayList<>();
        list1.add(emp1);
        list1.add(emp2);
        list1.add(emp3);
        list1.add(emp4);
        List<Employe> list2=new ArrayList<>();
        Map<String, List<Employe>> mp=new HashMap<>();

        for(Employe x:list1){

            mp.put(x.depratment,list1);

       }

        mp.forEach((z,p)->System.out.println(z+(Employe)p.iterator().next()));
    }
}
