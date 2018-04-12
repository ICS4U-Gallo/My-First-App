//1. Else if and else are checking the different conditions based on the input. If the input does not qualify into the first set of conditions, it will move on to the next set until they qualify.
//2. The difference is that they are seperate conditions. 

public class ElseAndIf {
    public static void main(String[] args) {
        int people = 30;
        int cars = 40;
        int buses = 15;
        
        if (cars > people) {
            System.out.println("We should take the cars.");
        } 
        
        if (cars < people) {
            System.out.println("We should not take the cars.");
        } else {
            System.out.println("We can't decide.");
        }
        
        
        if (buses > cars) {
            System.out.println("That's too many buses.");
        } else if (buses < cars) {
            System.out.println("Maybe we could take the buses.");
        } else {
            System.out.println("We still can't decide.");
        }
        
        
        if (people > buses) {
            System.out.println("All right, let's just take the buses.");
        } else {
            System.out.println("Fine, let's stay home then.");
        }
    }
}
