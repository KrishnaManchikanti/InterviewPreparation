import java.util.*;

public class SetInterface {
    //For unique data by avoiding duplicate Elements
    public static void main(String[] args) {
        //HashSet->HashMap->Array of Nodes(key,value)
        //Hashing Mechanism->hashcode generated with key, hashcodeOperation on length of an array which uses as index
        //no sorted
        HashSet<Integer> set = new HashSet<>();
        //add
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        //remove
        System.out.println(set);
        boolean b = set.remove(7);//takes element not index
        System.out.println(set + " " + b);
        //verify
        System.out.println(set.contains(5));
        //update-> need to remove and add

        for (Integer i : set)
            System.out.print(i + " ");


        //LinkedHashSet [given sortedOrder]-> LinkedHashMap -> link of nodes-> hashmap
        //but extends hashSet
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();


        //TreeSet -> treemap -> binaryTree
        //takes random order, store in ascending order
        TreeSet<Integer> tree = new TreeSet<>();
        //add
        tree.add(1);
        tree.add(6);
        tree.add(2);
        tree.add(4);
        tree.add(3);
        tree.add(7);
        tree.add(5);
        System.out.println(tree);
        System.out.println(tree.first());
        System.out.println(tree.last());
        System.out.println(tree.pollFirst());
        System.out.println(tree);
        System.out.println(tree.subSet(2, 5).removeFirst());
        System.out.println(tree.descendingSet());

    }

}

