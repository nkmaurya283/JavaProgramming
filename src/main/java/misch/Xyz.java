package misch;

public class Xyz {

    public static   void def(X x){

        System.out.println("My name is navneet");
        x.y();


    }

    public static void main(String args[])
    {
        //Xyz obj1=new Xyz();
        X obj=new X();
        Xyz.def(obj);
    }
}
