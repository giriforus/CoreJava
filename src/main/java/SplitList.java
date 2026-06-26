import java.util.*;
import java.util.stream.Collectors;

public class SplitList {

    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Map<String, List<Integer>> result = splitOddEven(numbers);

        System.out.println("Original List: " + numbers);
        System.out.println("Odd Numbers: " + result.get("odd"));
        System.out.println("Even Numbers: " + result.get("even"));

        splitList(numbers);
    }

    /**
     * Splits a list of integers into odd and even numbers using Java 8 Streams
     * @param numbers - the list of integers to split
     * @return a map with "odd" and "even" keys containing separated lists
     */
    public static Map<String, List<Integer>> splitOddEven(List<Integer> numbers) {
        Map<Boolean, List<Integer>> partitioned = numbers.stream()
                .collect(java.util.stream.Collectors.partitioningBy(n -> n % 2 == 0));

        Map<String, List<Integer>> result = new HashMap<>();
        result.put("even", partitioned.get(true));
        result.put("odd", partitioned.get(false));
        return result;
    }

    private static void splitList(List<Integer> numbers){
        extracted(numbers);


    }

    private static void extracted(List<Integer> numbers) {
        Map<Boolean, List<Integer>> numberslist =
                numbers.stream().collect(Collectors.partitioningBy(n->n%2==0));
        List<Integer> even = numberslist.get(true);
        List<Integer> odd = numberslist.get(false);

        System.out.println(numbers);
        System.out.println(even);
        System.out.println(odd);
    }
}
