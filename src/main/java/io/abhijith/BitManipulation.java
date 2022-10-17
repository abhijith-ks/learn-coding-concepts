package io.abhijith;

public class BitManipulation {

    public static void main(String[] args) {
//        ----------------------------- Bitmask -----------------------------
        int mask = 1;
        for(int i = 0; i < 32; i++) {
            System.out.println(mask + " - " +Integer.toBinaryString(mask));
            mask = mask << 1;
        }

//        ----------------------------- Flip the least significant 1 bit to 0 -----------------------------
        int x = 11;
        System.out.println(Integer.toBinaryString(x));
        x = x & (x - 1);
        System.out.println(Integer.toBinaryString(x));
        x = x & (x - 1);
        System.out.println(Integer.toBinaryString(x));
        x = x & (x - 1);
        System.out.println(Integer.toBinaryString(x));
    }
}
