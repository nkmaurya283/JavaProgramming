package program;

public class DriverClass {


    public static void main(String args[]){

        BaseClass b=new Base2();
        //b.run();
        Base2 b2;

       b2=(Base2)b;
        b2.run();
    }
}
