package misch;

public class OverLoading {

    public static int abc(int x){

        return x;
    }
    public static int abc(byte x){

        return x;
    }

    public static void main(String args[]){

        byte y=(byte)OverLoading.abc(10);
        System.out.println(y);
    }
}
