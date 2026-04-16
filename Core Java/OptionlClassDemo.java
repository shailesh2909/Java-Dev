import java.util.*;

public class OptionlClassDemo {
    
    public static void main(String[] args) {
        
        List<String> list = Arrays.asList("Java", "Python", "C++", "Go", "Rust");

        String name = list.stream()
                .filter(str -> str.contains("v"))
                .findFirst()
                .orElse("Not found");

        System.out.println(name);
    }
}
