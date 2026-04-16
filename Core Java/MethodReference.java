import java.util.*;

public class MethodReference {

    public static void main(String[] args) {
       
        List<String> list = Arrays.asList("Java", "Python", "C++", "Go");

        List<String> uName = list.stream()
                .map(String::toUpperCase)
                .toList();

        uName.forEach(System.out::println);
    }
}
