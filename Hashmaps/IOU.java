package Hashmaps;

import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> debts;

    // Constructor
    public IOU() {
        debts = new HashMap<>();
    }

    // Method to set the amount owed to a person
    public void setSum(String toWhom, double amount) {
        debts.put(toWhom, amount);
    }

    // Method to get the amount owed to a person
    public double howMuchDoIOweTo(String toWhom) {
        return debts.getOrDefault(toWhom, 0.0);
    }

    // Main method to demonstrate the class functionality
    public static void main(String[] args) {
        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Michael", 30);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));  // Output: 51.5
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael")); // Output: 30.0

        // Demonstrate updating the amount owed to a person
        mattsIOU.setSum("Arthur", 10.5);
        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));  // Output: 10.5
    }
}
//Solution to compare from TMC after you have finished exercise
//src/main/java/Hashmaps.IOU.java
//
//import java.util.HashMap;
//
//public class Hashmaps.IOU {
//
//    private HashMap<String, Double> debt;
//
//    public Hashmaps.IOU() {
//        this.debt = new HashMap<>();
//    }
//
//    public void setSum(String toWhom, double amount) {
//        debt.put(toWhom, amount);
//    }
//
//    public double howMuchDoIOweTo(String toWhom) {
//        return debt.getOrDefault(toWhom, 0.0);
//    }
//}
// src/main/java/Main.java
//
//public class Main {
//
//    public static void main(String[] args) {
//        // Test your program here
//    }
//}