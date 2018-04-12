import java.util.Scanner;
class Person {
    String name;
    int age;
    double average;
}

public class basicRecords {
    public static void main(String agrs[]) {
    Scanner sc = new Scanner(System.in);
    
    Person first = new Person();
    Person second = new Person();
    Person third = new Person();
    
    System.out.print("Enter the first student's name:");
    first.name = sc.next();
    
    System.out.print("Enter the first student's age:");
    first.age = sc.nextInt();
    
    System.out.print("Enter the first student's average:");
    first.average = sc.nextDouble();
    
    System.out.print("Enter the second student's name:");
    second.name = sc.next();
    
    System.out.print("Enter the second student's age:");
    second.age = sc.nextInt();
    
    System.out.print("Enter the second student's average:");
    second.average = sc.nextDouble();
    
    System.out.print("Enter the third student's name:");
    third.name = sc.next();
    
    System.out.print("Enter the third student's age:");
    third.age = sc.nextInt();
    
    System.out.print("Enter the third student's average:");
    third.average = sc.nextDouble();
    
    System.out.println("Names entered are " + first.name + " " + second.name + " " + third.name);
    System.out.println("Ages entered are " + first.age + " " + second.age + " "  + third.age);
    System.out.println("Averages entered are " + first.average + " " + second.average + " " + third.average);
    
    double average = (first.average + second.average + third.average) / 3;
    System.out.println("Their averages are " + average);
    }
}
