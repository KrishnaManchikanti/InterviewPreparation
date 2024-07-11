import java.util.*;

public class MapInterface {
    //List u always need to access by index[Hard to remember]
    //map can be access by Key, so u can get value
    public static void main(String[] args) {
        //put, remove, containsKey/Value, map.keySet(), map.values(), putIfAbsent, ContainsKey, entrySet
        //keySet give only keys, entrySet gives both keys&values
        //Hashing Mechanism->hashcode generated with key, hashcodeOperation on length of an array which uses as index
        Map<Integer, String> map = new HashMap<>();
        //add
        map.put(523240, "hyderabad");
        map.put(600019, "chennai");
        map.put(234949, "Delhi");
        map.put(334234, "mumbai");
        //retrieve keys
        Set<Integer> keys = map.keySet();
        for (Integer key : keys)
            System.out.println(key);
        //retrieve values
        //or Collection<String> m = map.values();
        for (Integer key : keys)
            System.out.println(map.get(key));

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries)
            System.out.println(entry.getKey() + "->" + entry.getValue());

        //update
        if (!map.containsKey(234949))
            map.put(234949, "bangalore");
        System.out.println(map);
        map.putIfAbsent(234948, "bangalore");
        System.out.println(map);
        map.replace(234948, "kerala");
        System.out.println(map);

        //verify
        System.out.println(map.containsKey(234949));
        System.out.println(map.containsValue("hyderabad"));

        //deletion
        System.out.println(map);
        map.remove(334234);
        System.out.println(map);
        map.clear();
        System.out.println(map);
        PriorityQueue<Integer> queue;
    }


}
