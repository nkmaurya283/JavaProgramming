package java8Streams;

import java.util.ArrayList;
import java.util.List;

public class SortingByStreams {

    public static void main(String args[]){
        List<String> names = new ArrayList<>();

        names.add("David");
        names.add("Johnson");
        names.add("Samontika");
        names.add("Brijesh");
        names.add("John");

        names.stream().sorted().forEach(System.out::println);


    }
}
