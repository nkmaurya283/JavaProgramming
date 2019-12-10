package typecasting;

public class Concept {

    public String color="White";
    Concept(String color){
        this.color=color;
    }

    public static void main(String args[]){
        Concept c=new Concept("Red");
        System.out.println(c.color);
    }
}
