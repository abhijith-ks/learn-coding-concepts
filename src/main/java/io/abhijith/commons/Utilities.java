package io.abhijith.commons;

public class Utilities {

    static int headingCount;

    public static void printEndLine() {
        System.out.println("-".repeat(headingCount));
        System.out.println("\n");
    }

    public static void printHeading(String heading) {
        heading = "-----------------------------> "
                + heading
                + " <-----------------------------";
        headingCount = heading.length();
        System.out.println(heading);
    }
}
