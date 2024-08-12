package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CollectionClass {

    public static void main(String[] args) {
        //  hashSetExample();
        // listExample();
        hashMapExample();
    }

    private static void hashSetExample() {
        // Set does take a duplicate value/element e.g Basketball is added 2 times but only printed once in
        // console output
        HashSet<String> sports = new HashSet<>();
        sports.add("Football");
        sports.add("Tennis");
        sports.add("Basketball");
        sports.add("Basketball");
        //sports.add(true);
        sports.add("trvst");
        // sports.add(34.09);

        for (var sport : sports) {
            System.out.println("Lists of available sports are " + sport);
        }
        System.out.println("Does the sports collection contains 'Tennis' is " + sports.contains("Tennis"));
        System.out.println("Is available sport empty " + sports.isEmpty());
        System.out.println("sport size " + sports.size());
        sports.remove("Tennis");


        var listsOfSport = sports.iterator();
        while (listsOfSport.hasNext()) {
            System.out.println("Select your favourite sport " + listsOfSport.next());
        }
    }

    public static void listExample() {
        // Arraylist can store any data or you can specify the type of data you want it to store
        // e.g. var ArrayList<String> str = new new ArrayList<String>();
        var arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(32.0);
        arrayList.add("power");
        arrayList.addFirst("First");
        arrayList.addLast("Last Item");
        arrayList.remove(3);
        System.out.println(arrayList.getFirst());

        for (var sa : arrayList) {
            System.out.println(sa);
            if (sa.equals("First")) {
                System.out.println(" this is the first value in the collection");
            }
            System.out.println("second value in the collection is " + arrayList.get(1));
        }
    }

    public static void hashMapExample() {
        HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
        hashmap.put(101, "HR manager");
        hashmap.put(102, "Developer");
        hashmap.put(103, "QA Engineer");

        var keys = hashmap.keySet();

        for (var key : keys) {
            System.out.println("The values in the hashmap are " + hashmap.values());
            var availableValues = hashmap.values();
            for (var availableValue : availableValues) {
                System.out.println("Is QA role available " + availableValues.contains("QA Engineer"));
                System.out.println("Size " + hashmap.size());
            }
            System.out.println("Employee id is " + key + " and the role is " +
                    hashmap.get(key));
            System.out.println("My employee id is " + key + " and I work as " + hashmap.get(103));
            // hashmap.clear();
            // System.out.println(hashmap.isEmpty());
        }
        // loop using iterator
//       var key = keys.iterator();
//       while(key.hasNext())
//       {
//           System.out.println("One of the key in the hashmap collection is " +key.next() + " and the value" +
//                   hashmap.get(key));
//       }
    }
}
