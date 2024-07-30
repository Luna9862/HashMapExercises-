package Hashmaps.another;
import java.util.HashMap;

public class Program {

    // Method to print all values in the given HashMap
    public static void printValues(HashMap<String, Book> hashmap) {
        for (Book book : hashmap.values()) {
            System.out.println(book);
        }
    }

    // Method to print only the Books in the given HashMap whose names contain the given string
    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        for (Book book : hashmap.values()) {
            if (book.getName().contains(text)) {
                System.out.println(book);
            }
        }
    }

    // Main method to demonstrate the class methods
    public static void main(String[] args) {
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and Prejudice", 1813, "...."));

        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "prejud");
    }
}
//Solution to compare from TMC after you have finished exercise
//
//import java.util.HashMap;
//
//public class Hashmaps.Program {
//
//    public static void main(String[] args) {
//        // Test your program here!
//    }
//
//    public static void printValues(HashMap<String, Book> hashmap) {
//        for (Book value : hashmap.values()) {
//            System.out.println(value);
//        }
//    }
//
//    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
//        for (Book value : hashmap.values()) {
//            if (value.getName().contains(text)) {
//                System.out.println(value);
//            }
//        }
//    }
//}