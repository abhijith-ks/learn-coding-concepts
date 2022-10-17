package io.abhijith;

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
    }
}
