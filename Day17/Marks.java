package com;

public class Marks {
    public static void main(String[] args) {

        // Individual variables (not recommended)
        int teluguMarks = 99;
        int hindiMarks = 98;
        int englishMarks = 89;
        int mathsMarks = 99;

        // Using array
        int[] marks = new int[6];
        marks[0] = 99;
        marks[1] = 100;
        marks[3] = 78;
        System.out.println(marks[0]); // 99
        System.out.println(marks[1]); // 100
        System.out.println(marks[2]); // 0 (default value)
        System.out.println(marks[3]); // 78

        // Integer array
        int[] arr = new int[4];

        // Character array
        char[] grades = {'A', 'B'};
        System.out.println(grades[0]);
        grades[0] = 'C';
        System.out.println(grades[0]);

        // Boolean array
        boolean[] arr2 = new boolean[1];
        arr2[0] = true;
        System.out.println(arr2[0]);

        // String array
        String[] str = new String[2];
        System.out.println(str[0]); // null

        str[0] = "Pradeep";
        str[1] = "Sai";

        System.out.println(str[0]);
    }
}





