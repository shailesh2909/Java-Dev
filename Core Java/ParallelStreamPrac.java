import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStreamPrac {
    
    public static void main(String[] args) {
        
        System.out.println("Start...");
        int size = 10000;
        List<Integer> list = new ArrayList<>(size);
        Random rand = new Random();

        for(int i = 1; i <= size; i++)
        {
            list.add(rand.nextInt(100));
        }

        long startTime1 = System.currentTimeMillis();

        int sum = list.stream()
                .map(i -> {
                    try{
                        Thread.sleep(1);
                    } catch(Exception e){}
                    return i;
                })
                .mapToInt(i -> i)
                .sum();

        long endTime1 = System.currentTimeMillis();

        long startTime2 = System.currentTimeMillis();

        int sum1 = list.parallelStream()
                .map(i -> {
                    try{
                        Thread.sleep(1);
                    } catch(Exception e){}
                    return i;
                })
                .mapToInt(i -> i)
                .sum();

        long endTime2 = System.currentTimeMillis();

        System.out.println("Sum using stream: " + sum + " Time taken: " + (endTime1 - startTime1) + " ms");
        System.out.println("Sum using parallel stream: " + sum1 + " Time taken: " + (endTime2 - startTime2) + " ms");
                
    }
}
