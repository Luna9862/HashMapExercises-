import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> abbreviationsMap;

    // Constructor
    public Abbreviations() {
        abbreviationsMap = new HashMap<>();
    }

    // Method to add a new abbreviation and its explanation
    public void addAbbreviation(String abbreviation, String explanation) {
        abbreviationsMap.put(abbreviation, explanation);
    }

    // Method to check if an abbreviation has been added
    public boolean hasAbbreviation(String abbreviation) {
        return abbreviationsMap.containsKey(abbreviation);
    }

    // Method to find the explanation for an abbreviation
    public String findExplanationFor(String abbreviation) {
        return abbreviationsMap.get(abbreviation);
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc.", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precisely");

        String text = "e.g. i.e. etc. lol";
        for (String part : text.split(" ")) {
            if (abbreviations.hasAbbreviation(part)) {
                part = abbreviations.findExplanationFor(part);
            }

            System.out.print(part);
            System.out.print(" ");
        }

        System.out.println();
    }
}

//Solution to compare from TMC after you have finished exercise
//src/main/java/Abbreviations.java
//import java.util.HashMap;
//
//public class Abbreviations {
//
//    private HashMap<String, String> abbreviations;
//
//    public Abbreviations() {
//        this.abbreviations = new HashMap<>();
//    }
//
//    public void addAbbreviation(String abbreviation, String explanation) {
//        this.abbreviations.put(abbreviation, explanation);
//    }
//
//    public boolean hasAbbreviation(String abbreviation) {
//        return this.abbreviations.containsKey(abbreviation);
//    }
//
//    public String findExplanationFor(String abbreviation) {
//        return this.abbreviations.get(abbreviation);
//    }
//}
//src/main/java/Main.java
//public class Main {
//
//    public static void main(String[] args) {
//        // Test your program here!
//    }
//}