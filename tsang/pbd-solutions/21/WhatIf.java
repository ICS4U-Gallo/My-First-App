//1. the code will keep running to see which statements the input is applicable to. 
//2. the purpose of the curly brackets help identify the conditions that need to be met in order to execute a certain function. 
//3. 

public class WhatIf {
    public static void main(String[] args) {
        int people = 20;
        int cats = 20;
        int dogs = 15;
        
        if (people < cats) {
          System.out.println("Too many cats!  The world is doomed!");
        }
        
        if (people > cats) {
          System.out.println("Not many cats!  The world is saved!");
        }
        
        if (people < dogs) {
          System.out.println("The world is drooled on!");
        }
        
        if (people > dogs) {
          System.out.println("The world is dry!");
        }
        
        dogs += 5;
        
        if (people >= dogs) {
          System.out.println("People are greater than or equal to dogs.");
        }
        
        if (people <= dogs) {
          System.out.println("People are less than or equal to dogs.");
        }
        
        if (people == dogs) {
          System.out.println("People are dogs.");
        }
    }
}
