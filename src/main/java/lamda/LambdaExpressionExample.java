package lamda;

public class LambdaExpressionExample {


    public static void main(String args[]){
        final int width=10;

        Drawable d=new Drawable() {
            public void draw() {
                System.out.println(width);
            }
        };
        d.draw();

    }
}
