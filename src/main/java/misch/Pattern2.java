package misch;

import java.util.Scanner;

public class Pattern2 {

    public static void main(String...args){
        System.out.println("Enter 1st pattern");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){

            for(int j=1;j<=n;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}