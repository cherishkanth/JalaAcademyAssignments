import java.util.*;

public class Collections {

    public void hashMapOperations() {

        System.out.println("HashMap Operations:");

        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Ram");
        map.put(102, "Sam");
        map.put(103, "Ravi");
        map.put(104, "Ajay");
        map.put(105, "Kiran");
        map.put(106, "Rahul");
        map.put(107, "Sita");
        map.put(108, "Anu");
        map.put(109, "John");
        map.put(110, "David");

        map.put(111, "Krishna");

        System.out.println("Value of Key 105: " + map.get(105));

        HashMap<Integer, String> cloneMap = new HashMap<>(map);
        System.out.println("Clone Map: " + cloneMap);

        System.out.println("Contains Key 103: " + map.containsKey(103));

        System.out.println("Contains Value Ram: " + map.containsValue("Ram"));

        System.out.println("Is Empty: " + map.isEmpty());

        System.out.println("Size: " + map.size());

        System.out.println("Keys: " + map.keySet());

        System.out.println("Values: " + map.values());

        map.remove(104);

        System.out.println("After Remove: " + map);

        HashMap<Integer, String> map2 = new HashMap<>();
        map2.putAll(map);

        System.out.println("Copied Map: " + map2);
    }

    public void hashSetOperations() {

        System.out.println("HashSet Operations:");

        HashSet<String> set = new HashSet<>();

        set.add("Java");
        set.add("Python");
        set.add("C");
        set.add("C++");
        set.add("HTML");
        set.add("CSS");
        set.add("JavaScript");
        set.add("SQL");
        set.add("Spring");
        set.add("React");

        System.out.println(set);

        set.add("MongoDB");

        System.out.println("After Add: " + set);

        System.out.println("Contains Java: " + set.contains("Java"));

        System.out.println("Is Empty: " + set.isEmpty());

        System.out.println("Size: " + set.size());

        set.remove("C");

        System.out.println("After Remove: " + set);

        HashSet<String> copySet = new HashSet<>(set);

        System.out.println("Copied Set: " + copySet);

        System.out.println("Iterating:");

        for (String s : set) {
            System.out.println(s);
        }

        set.clear();

        System.out.println("After Clear: " + set);

        System.out.println("Is Empty: " + set.isEmpty());
    }

    public static void main(String[] args) {

        CollectionPrograms obj = new CollectionPrograms();

        obj.hashMapOperations();

        obj.hashSetOperations();
    }
}
