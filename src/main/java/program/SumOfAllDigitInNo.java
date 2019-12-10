package program;

public class SumOfAllDigitInNo {

    public static void sumof(int x){

        int copyofnumber=x;
        int sum=0;
        while (copyofnumber!=0){

            int lstsdigit=copyofnumber%10;

            sum=sum+lstsdigit;
            copyofnumber=copyofnumber/10;
        }
        System.out.println("Sum o digit is:->"+sum);
    }

    public static void main(String args[]){

        sumof(234);
    }
}
