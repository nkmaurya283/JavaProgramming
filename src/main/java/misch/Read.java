package misch;

import java.util.ArrayList;
import java.util.Iterator;

public class Read {

    public static void main(String args[]){
        Student s=new Student(1,"Navneet",2000);

        ArrayList<Student> al=new ArrayList<Student>();

        al.add(s);
        Iterator<Student> itr=al.iterator();

        while (itr.hasNext()){

            Student s1=(Student)itr.next();
            System.out.println(s1.id+" "+s1.name+" "+s1.salary);
        }
    }
}
