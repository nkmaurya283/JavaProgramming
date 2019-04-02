package program;

public class PassArrayToMethod {

    static  void  min(int arr[]){

        int min=arr[0];

        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.print(min);
    }
    public static  void main(String args[]){
        int a[]={2,5,1,3,9,3};
        min(a);
    }
}
