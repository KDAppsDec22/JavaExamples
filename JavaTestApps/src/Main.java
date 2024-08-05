import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /////       Simple Program for find out Vowels and Consonants
        String stringsss = "My name is KD Programmer";
        int vowelCount = 0;
        int consCount = 0;
        for (int i = 0; i < stringsss.length(); i++) {
            char ch = stringsss.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            } else {
                consCount++;
            }
        }
        System.out.println("Number of vowels & Consonants in the input string: " + stringsss.length() +" -- "+ vowelCount +" -- "+ consCount);

        System.out.println(" \n##############################################");
        hashMap_Concept();
        System.out.println("############################################## \n");

        System.out.println(" \n##############################################");
        find_vowel_consonants_in_String();
        System.out.println("############################################## \n");

        System.out.println(" \n##############################################");
        getGeneric_Output();
        System.out.println("############################################## \n");

        System.out.println(" \n##############################################");
        // Create an ArrayList of Integers
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

        // Create an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        // Print the ArrayLists using the generic method
        System.out.println("Integer ArrayList:");
        printArrayList(intList);

        System.out.println("String ArrayList:");
        printArrayList(stringList);
        System.out.println("############################################## \n");

    }

    public static void find_vowel_consonants_in_String() {
        /////////////       Using Java 8 Stream API
        String stringsss = "My name is KD Programmer";
        long vowelCounts = stringsss.chars()
                .mapToObj(c -> (char) c)
                .filter(ch -> ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                .count();
        long consCounts = stringsss.length() - vowelCounts;
        System.out.println("Vowels & Consonants using Stream API : Total Length - " + stringsss.length() + " -||- Vowels " + vowelCounts + " -||- Consonants " + consCounts);
    }

    public static void hashMap_Concept() {
        // Creating a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Inserting key-value pairs
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        // Retrieving a value
        int value = map.get("two"); // Returns 2
        System.out.println("Value for key 'two': " + value);

        // Checking if a key exists
        if (map.containsKey("three")) {
            System.out.println("Key 'three' exists in the map");
        }

        // Removing a key-value pair
        map.remove("one");

        // Iterating over the map
        for (HashMap.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

    }


    /*
        psvm - public static void main(String[] args)
        sout - System.out.println()
        psfs - public static final String
        ifn  - if (var == null) {
        fori - for (int i = 0; i < ; i++)
    */

    public static void getGeneric_Output() {
        Box<Integer> integerBox = new Box<>();
        integerBox.setContent(123);
        Integer integerValue = integerBox.getContent();
        System.out.println("Integer "+ integerValue);

        Box<String> stringBox = new Box<>();
        stringBox.setContent("Hello, Generics");
        String stringValue = stringBox.getContent();
        System.out.println("String "+ stringValue);
    }

    public static class Box<T> {
        private T content;

        public void setContent(T content) {
            this.content = content;
        }

        public T getContent() {
            return content;
        }
    }

    // Generic method to print ArrayList elements
    public static <T> void printArrayList(ArrayList<T> list) {
        for (T element : list) {
            System.out.println(element);
        }
    }



}