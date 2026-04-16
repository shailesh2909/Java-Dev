import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamPrac
{
    public static void main(String args[])
    {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);;

        Stream<Integer> st = list.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .sorted();

        st.forEach(n -> System.out.println(n));
    }
}