package program;

public class Array {


    public static void  main(String args[]){

        int a[]={2,3,4,5,6,2,9};
        int y=0;

        for (int x  :a)
              {

                  //System.out.print(x);


                  y=y+x;
        }

        System.out.print(y);
    }
}
