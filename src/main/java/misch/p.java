package misch;

import java.util.Scanner;

class p
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int j;
        for(int i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
                System.out.print(j);
            for(int k=j;k<=n;k++)
                System.out.print("*");
            System.out.println();
        }
    }
}