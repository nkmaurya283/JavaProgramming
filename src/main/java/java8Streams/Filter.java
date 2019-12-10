package java8Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Filter {

    public static void main(String args[]){

        List<String> names = Arrays.asList("Melisandre","Sansa","Jon","Daenerys","Joffery");
        Stream<String>  list=names.stream().filter(x->x.length()>5);
        list.forEach(y->System.out.println(y));






    }
}
