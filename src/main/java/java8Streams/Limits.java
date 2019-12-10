package java8Streams;

import java.util.ArrayList;
import java.util.List;

public class Limits {

    public static void main(String args[]){

        List<String> names = new ArrayList<>();

        names.add("David");

        names.add("Johnson");

        names.add("Samontika");

        names.add("Brijesh");

        names.add("John");

        names.add("David");

        names.add("Brijesh");

        names.stream().limit(4).forEach(System.out::println);
    }
}
