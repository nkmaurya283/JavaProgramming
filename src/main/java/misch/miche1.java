package misch;

public class miche1 {
     int x;
     double y;
     String z;

     miche1(){}

    miche1(int x,double y, String z){

         this.x=x;
         this.y=y;
         this.z=z;
    }

    @Override
    public String toString() {
        return ("x is :"+x+"y is :"+y+"z is :"+z);
    }

    public String name(){
         return "Navneet";
    }

    public static void main(String args[]){
        miche1 m=new miche1(1,3,"Navneet");
        System.out.println(m);

    }
}
