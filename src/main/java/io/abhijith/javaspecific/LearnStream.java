package io.abhijith.javaspecific;

import io.abhijith.commons.Utilities;

import java.util.Arrays;

public class LearnStream {

    public static void main(String[] args) {

        /*
        Returns Stream consistent of the elements of this stream, each boxed to an Integer
         */
        Utilities.printHeading("Boxed");
        int[] arr = {1,2,3,4, Integer.MAX_VALUE};
        Integer[] current = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Utilities.printEndLine();


    }
}
