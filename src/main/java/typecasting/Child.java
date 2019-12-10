package typecasting;

public class Child extends Parent {

    public void m1(){
        System.out.println("in m1");
    }
    public void m2(){
        System.out.println("in m2");
    }

    public static void main(String args[]){

        Parent obj=new Parent();
        Child ch1=new Child();
        Child a=(Child)obj;
        a.m1();
    }
}
