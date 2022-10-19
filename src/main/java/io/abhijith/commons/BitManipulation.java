package io.abhijith.commons;

import io.abhijith.commons.Utilities;

public class BitManipulation {

    public static void main(String[] args) {

        /*
        mask = mask << 1
        left shift bits and add fill zero at LSB
        ie: 10 << 1 => 100
         */
        Utilities.printHeading("BitMask");
        int mask = 1;
        for(int i = 0; i < 32; i++) {
            System.out.println(mask + " - " +Integer.toBinaryString(mask));
            mask = mask << 1;
        }
        Utilities.printEndLine();
        /*
        bit mask is useful in generating power of two
         */
        Utilities.printHeading("Power of two with BitMask");
        mask = 1;
        int n = 16;
        for(int i = 0; i < 32; i++) {
            if(mask == n) System.out.println(n + " is power of two");
            mask = mask << 1;
        }
        Utilities.printEndLine();


        /*
        x & (x - 1)
        convert least significant 1 bit to 0
        ie: 100010 => 100000
         */
        Utilities.printHeading("Flip the least significant 1 bit to 0");
        int x = 11;
        System.out.println(Integer.toBinaryString(x));
        x = x & (x - 1);
        System.out.println(Integer.toBinaryString(x));
        x = x & (x - 1);
        System.out.println(Integer.toBinaryString(x));
        x = x & (x - 1);
        System.out.println(Integer.toBinaryString(x));
        Utilities.printEndLine();



        /*
        x & (-x)
        Keeps the right most set bit as it is and unset all other bits
         */
        Utilities.printHeading("Keep right most set bit and unset everything else");
        n = 10;
        System.out.println("n = " + n);
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(n & (-n)));
        n = 15;
        System.out.println("n = " + n);
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(n & (-n)));
        Utilities.printEndLine();
    }
}
