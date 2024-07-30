import java.util.HashMap;

public class Program {
    // Method to print all keys in the given HashMap
    public static void printKeys(HashMap<String, String> hashmap) {
        for (String key : hashmap.keySet()) {
            System.out.println(key);
        }
    }

    // Method to print keys in the HashMap that contain the given text
    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(key);
            }
        }
    }

    // Method to print values of keys that contain the given text
    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(hashmap.get(key));
            }
        }
    }

    // Main method to demonstrate the class methods
    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        // Call the methods and print the results
        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");
    }
}
//Solution to compare from TMC after you have finished exercise
//import java.util.HashMap;
//
//public class Program {
//
//    public static void main(String[] args) {
//        // Test your program here!
//    }
//
//    public static void printKeys(HashMap<String, String> hashmap) {
//        for (String key : hashmap.keySet()) {
//            System.out.println(key);
//        }
//    }
//
//    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
//        for (String key : hashmap.keySet()) {
//            if (key.contains(text)) {
//                System.out.println(key);
//            }
//        }
//    }
//
//    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
//        for (String key : hashmap.keySet()) {
//            if (key.contains(text)) {
//                System.out.println(hashmap.get(key));
//            }
//        }
//    }
//}
//