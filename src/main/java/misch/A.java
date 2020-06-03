package misch;

public interface A {
     //void R();

    default void B(){
        System.out.println("In B=======>");
    }
    static void D(){
        System.out.println("In D=======>");
    }
}
