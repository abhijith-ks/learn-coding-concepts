package io.abhijith;

import java.util.Arrays;

public class LearnStream {

    public static void main(String[] args) {
//        ----------------------------- Boxed -----------------------------
        int[] arr = {1,2,3,4, Integer.MAX_VALUE};
        Integer[] current = Arrays.stream(arr).boxed().toArray(Integer[]::new);
    }
}
