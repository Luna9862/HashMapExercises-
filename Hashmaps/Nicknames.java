package Hashmaps;

import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the ope
        HashMap<String, String> nicknames = new HashMap<>();

        // Store names and nicknames in the HashMap
        nicknames.put("matthew", "matt");
        nicknames.put("michael", "mix");
        nicknames.put("arthur", "artie");

        // Retrieve Matthew's nickname from the HashMap
        String matthewNickname = nicknames.get("matthew");

        // Print Matthew's nickname
        System.out.println(matthewNickname);
    }

}

//Solution to compare from TMC after you have finished exercise
//import java.util.HashMap;
//
//public class Hashmaps.Nicknames {
//
//    public static void main(String[] args) {
//        // Do the operations required here!
//        HashMap<String, String> nicknames = new HashMap<>();
//        nicknames.put("matthew", "matt");
//        nicknames.put("arthur", "artie");
//        nicknames.put("michael", "mix");
//        System.out.println(nicknames.get("michael"));
//    }
//
//}
