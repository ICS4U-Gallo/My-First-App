package com.company;

public class Main {

    public static void main(String[] args) {
	    //String[] students = new String[3];
	    //students[0] = "Frank";
	    //students[1] = "Jim";
	    //students[2] = "Fred";
	    String[] students = {"Frank", "Jim", "Fred", "Kayla"};

	    students[1] = "Jimmy";

	    for (String name : students) {
            System.out.println("name =" + name);
        }

        for (int i = 0; i < students.length; i ++) {
	        students[i] += " (last name)";
        }

        String[] tempArray = new String[students.length + 1];
	    for (int i = 0; i < students.length; i++) {
	        tempArray[i] = students[i];
        }
        tempArray[tempArray.length - 1] = "Donald";
	    students = tempArray;

    }
    private static void printStudents(String[] students) {
        for (int i = 0; i < students.length; i ++) {
            System.out.println("students[" + i +  "] = " + students[i]);
        }
    }
}
