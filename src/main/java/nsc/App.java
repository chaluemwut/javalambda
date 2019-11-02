package nsc;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {
        List lst = Stream.of(1, 2, 3, 4, 45, 5, 6)
                .filter(e -> e > 5)
                .collect(Collectors.toList());
        System.out.println(lst);
    }
}
