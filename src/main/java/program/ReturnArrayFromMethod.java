package program;

public class ReturnArrayFromMethod {

    public static int[] get(){

        return new int[]{1,2,3,4};
    }

    protected  static void  main(String args[]){

        int z[]=get();
        for(int i=0;i<z.length;i++){
            System.out.println(z[i]);
        }

    }
}
