package io.abhijith.javaspecific;

import io.abhijith.commons.Utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Supplier;

public class LearnLambda {

    public static void main(String[] args){

        /*
        Consumer Lambda creates a function which accepts a parameter and execute block of code
         */
        Utilities.printHeading("Consumer Lambda");
        List<String> students = new ArrayList<>();
        students.add("Meenu");
        students.add("Rishikesh");
        students.add("Anju");
        Consumer<String> printItem = s -> {
            System.out.println(s);
        };
        students.forEach(printItem);
        Utilities.printEndLine();


        /*
        Function Lambda works same as Consumer but having capability of returning values
         */
        Utilities.printHeading("Function Lambda");
        Function<Integer, Integer> doubleValue = n -> {
          return n * n;
        };
        System.out.println(doubleValue.apply(8));
        Utilities.printEndLine();


        /*
        Predicate Lambda return true or false. Different types based on input
         */
        Utilities.printHeading("Predicate Lambda");
        IntPredicate isDivByThree = n -> {
            return n % 3 == 0;
        };
        System.out.println("IntPredicate with isDivByThree - " + isDivByThree.test(3));
        System.out.println("Negated isDivByThree - " + isDivByThree.negate().test(3));
        Utilities.printEndLine();


        /*
        Supplier Lambda takes no input but returns output
         */
        Utilities.printHeading("Supplier Lambda");
        Supplier<Double> randomNumberUnder100 = () -> {
            return Math.random() * 100;
        };
        System.out.println(randomNumberUnder100.get());
        Utilities.printEndLine();
    }
}
