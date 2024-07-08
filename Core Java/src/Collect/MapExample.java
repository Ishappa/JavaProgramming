package Collect;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");

        String value1 = hashMap.get(1);
        String value2 = hashMap.get(2);
        String value3 = hashMap.get(3);

        System.out.println("Value for key 1: " + value1);
        System.out.println("Value for key 2: " + value2);
        System.out.println("Value for key 3: " + value3);

        boolean containsKey = hashMap.containsKey(2);
        System.out.println("Contains key 2: " + containsKey);

        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        hashMap.remove(3);

        System.out.println("After removing key 3:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
