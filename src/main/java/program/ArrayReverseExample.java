package program;

import java.util.Arrays;

public class ArrayReverseExample {

    static void arrayreverse(int[] input){

        System.out.println("Array before revese:"+Arrays.toString(input));
        int temp;
        for(int i=0;i<input.length/2;i++){
            temp=input[i];
            input[i]=input[input.length-1-i];
            input[input.length-1-i]=temp;
        }

        System.out.println("Array After Reverse : "+Arrays.toString(input));

    }

    public static void main(String args[]){
        arrayreverse(new int[]{4, 5, 8, 9, 10,11});
    }
}
