package nsc;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {
        List lst = List.of("a", "b", "c", "d", "e");
        Stream s3 = lst.stream();
        Set s = Set.of(1, 2, 3);
        Stream s4 = s.stream();
    }
}
