package misch;

import java.util.Scanner;

public class Comb {

    public static int factorial(int n) {
        //1
        int fact = 1;
        //2
        for (int i = 1; i <= n; i++) {
            //3
            fact = fact * i;
        }
        //4
        return fact;
    }
    public  static void main(String args[]){
        int n, r;
        Scanner scan = new Scanner(System.in);
        System.out.println("To calculate the nCr and nPr values, we need 'n' and 'r' value .");
        System.out.println("Enter the value of n : ");
        n = scan.nextInt();
        System.out.println("Enter the value of r : ");
        r = scan.nextInt();
        int ncr = (factorial(n) / (factorial(n - r) * factorial(r)));
        int npr = (factorial(n) / (factorial(n - r)));
        System.out.println("nPr is : " + npr);
        System.out.println("nCr is : " + ncr);
    }
}
