package com.company;

public class test {
    public static void main (String[] args) {

        String students = "John Smith: (88 65 98 68 66) Fred Lin: (59 0 76 56 77)";
        String fredLinInfo = getStudentInfo(students, "Fred Lin");

        System.out.println("fredLinInfo = " + fredLinInfo);

    }

    private static String getStudentInfo(String students, String name) {
        int start = students.indexOf(")") + 2;
        String studentName = students.substring(students.indexOf(start), students.indexOf(":") - 2);
        return studentName;
    }

}
