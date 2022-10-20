package io.abhijith.javaspecific;

import io.abhijith.commons.Utilities;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LearnString {

    public static void main(String[] args) {

        /*
        Normalize the string
         */
        Utilities.printHeading("Normalize String");
        String panda = " Panda";
        String fish = " fish ";
        String horse = "Horse ";
        String cat = "CAT";
        String nothing = " ";
        List<String> animals = List.of(panda, fish, horse, cat, nothing);
        List<String> trimmed = animals.stream()
                                .map(s -> s.trim())
                                .collect(Collectors.toList());
        System.out.println(trimmed);
        List<String> realAnimals = trimmed.stream()
                                .filter(s -> !s.isEmpty())
                                .collect(Collectors.toList());
        System.out.println(realAnimals);
        List<String> normaLizedAnimals = realAnimals.stream()
                                .map(s -> s.toLowerCase(Locale.ROOT))
                                .collect(Collectors.toList());
        System.out.println(normaLizedAnimals);
        Utilities.printEndLine();


        /*
        Palindrome check using stream
         */
        Utilities.printHeading("Palindrom check");
        String palindrome = "racecar";
        boolean result = IntStream.range(0, palindrome.length() / 2)
                .allMatch(item -> palindrome.charAt(item) == palindrome.charAt(palindrome.length() - item - 1));
        System.out.println(result);
        Utilities.printEndLine();
    }

}
