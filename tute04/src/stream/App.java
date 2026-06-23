package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<String> strings = List.of("1", "2", "3", "4", "5");
        // for (String string : strings) {
        //     System.out.println(string);
        // }

        strings.forEach(t -> System.out.println(t));
        strings.forEach(t -> {
            System.out.println(t);
        });
        

        List<String> strings2 = List.of("1", "2", "3", "4", "5");
        // List<Integer> ints = new ArrayList<Integer>();
        // for (String string : strings2) {
        //     ints.add(Integer.parseInt(string));
        // }
        // System.out.println(ints);
        List<Integer> ints = strings2.stream().map(i -> Integer.parseInt(i)).collect(Collectors.toList());
        // List<Integer> ints = strings2.stream().map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(ints);
    }
}
