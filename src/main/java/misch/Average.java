package misch;

public class Average {

    int sum=0;
    int average=0;
    public int avg(int[] arr){

        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];




        }
        average=sum/ arr.length;
        return average;
    }

    public  static void main(String args[]){
        Average av=new Average();
        int[] x={1,2,3};
      System.out.println(av.avg(x));
    }
}
