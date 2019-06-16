package misch;


public class Miche2 extends miche1 {

    public String address(miche1 m){

        return  m.toString();
    }
    public static void main(String args[]){

        miche1 m1=new miche1();

        Miche2 m2=new Miche2();
        m2.name();
        System.out.println(m2.name());
       System.out.println(m2.address(m1));
    }
}
