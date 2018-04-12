package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] marks/home/robuntu/Desktop/javadoc = inputMarks();

        printMarks(marks);

        bumpMarks(marks, 5);

        printMarks(marks);

    }

    private static int[] inputMarks() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] marks = new int[size];
        for (int i = 0; i < marks.length; i ++) {
            marks[i] = sc.nextInt();
        }
        return marks;
    }

    private static void bumpMarks(int[] marks, int bumpBy) {
        System.out.println("\nModifying marks");
        for (int i = 0; i < marks.length; i ++) {
            marks[i] += bumpBy;
        }
    }
    //void: return type; intMarks: name; int[] marks: parameters
    private static void printMarks(int[] marks) {/home/robuntu/Desktop/javadoc
        System.out.println("\nPrinting marks");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("marks [" + i + "] = " + marks[i]);
        }
    }
}

