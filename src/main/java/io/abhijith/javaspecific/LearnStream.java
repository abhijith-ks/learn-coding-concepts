package io.abhijith.javaspecific;

import io.abhijith.commons.Utilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LearnStream {

    public static void main(String[] args) {

        /*
        Create stream with Steam.of
         */
        Utilities.printHeading("Steam.of");
        Stream<String> shoppingStream = Stream.of("apples", "bananas", "oranges");
        shoppingStream.forEach(System.out::println);
        Utilities.printEndLine();


        /*
        Create stream from array
         */
        Utilities.printHeading("Arrays.stream");
        String[] shoppingArray = new String[]{"apples", "bananas", "oranges"};
        Stream<String> shoppingArrayStream = Arrays.stream(shoppingArray);
        shoppingArrayStream.forEach(System.out::println);
        Utilities.printEndLine();


        /*
        Create stream from list
         */
        Utilities.printHeading("list.steam");
        List<String> shoppingList = List.of("apples", "bananas", "oranges");
        Stream<String> shoppingListStream = shoppingList.stream();
        shoppingListStream.forEach(System.out::println);
        Utilities.printEndLine();


        /*
        Execute stream in parallel
         */
        Utilities.printHeading("Parallel execution");
        shoppingList.parallelStream().forEach(System.out::println);
        Utilities.printEndLine();


        /*
        Boolean match for item in stream
         */
        Utilities.printHeading("Match in stream");
        boolean isOnList = shoppingList.stream().anyMatch(item -> item.contains("apples"));
        System.out.println(isOnList);
        Utilities.printEndLine();


        /*
        Filter returns another stream which matches condition
         */
        Utilities.printHeading("Filter and create a new stream");
        Stream<String> filteredStream = shoppingList.stream().filter(item -> item.startsWith("a"));
        filteredStream.forEach(System.out::println);
        Utilities.printEndLine();


        /*
        Maps every element and creates a new stream
         */
        Utilities.printHeading("Map and create new stream");
        List<Integer> numbersList = List.of(4, 2, 6, 9, 10, 17, 3);
        Stream<Integer> doubledStream = numbersList.stream().map(item -> item * item);
        doubledStream.forEach(System.out::println);
        Utilities.printEndLine();


        /*
        Collects the stream to a list
         */
        Utilities.printHeading("Collect to list from stream");
        List<Integer> doubledList = numbersList.stream().collect(Collectors.toList());
        doubledList.forEach(System.out::println);
        Utilities.printEndLine();


        /*
        All Match checkes for a condition matches for all elements in the stream
         */
        Utilities.printHeading("All Match");
        String palindrome = "racecar";
        boolean result = IntStream.range(0, palindrome.length() / 2)
                        .allMatch(item -> palindrome.charAt(item) == palindrome.charAt(palindrome.length() - item - 1));
        System.out.println(result);
        Utilities.printEndLine();


        /*
        Returns Stream consistent of the elements of this stream, each boxed to an Integer
         */
        Utilities.printHeading("Boxed");
        int[] arr = {1,2,3,4, Integer.MAX_VALUE};
        Integer[] current = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.stream(current).forEach(System.out::println);
        Utilities.printEndLine();


    }
}
