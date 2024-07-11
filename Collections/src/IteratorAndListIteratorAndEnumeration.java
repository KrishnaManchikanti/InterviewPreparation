import java.util.*;

public class IteratorAndListIteratorAndEnumeration {
    public static void main(String[] args) {
        //IteratorAndListIteratorAndEnumeration are interfaces, used to iterate a collection of Objects

//Enumeration - Interface //OneDirection,readOnly // hasMoreElements(),nextElement()
        //return only values not Keys
        // Introduced for iterating the legacy collection objects
        // Legacy classes - v1.0 -> HashTable, Stack, Vector, Dictionary and Properties
        // New classes - v1.2
        Vector<Integer> v = new Vector<>();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(7);
        v.add(0);
        Enumeration<Integer> e = v.elements();

        while (e.hasMoreElements())
            System.out.print(e.nextElement() + " ");

        Hashtable<String, Integer> ages = new Hashtable<>();
        ages.put("India", 500);
        ages.put("Sri lanka", 600);
        ages.put("London", 1000);
        Enumeration<Integer> enumeration = ages.elements();
        System.out.println();
        while (enumeration.hasMoreElements())
            System.out.print(enumeration.nextElement() + " ");
        System.out.println();

//Iterator Interface is for both all Collection Objects[legacy+new], but not for map u need to use keySet
        //readOnly&OneDirection, hasNext() next() remove()-> u need to point the ref first using Next()
        // for map get keySet for iteration
        Iterator<Integer> i = v.iterator();
        while (i.hasNext())
            System.out.print("Iterator" + " " + i.next());
        System.out.println();

        HashMap<String, Integer> hm = new HashMap<>();
        //hm.ite not available bcoz iterator is available only on Collection interface
        //Sol
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        hm.put("e", 1);
        for (Map.Entry<String, Integer> entry : entries)
            System.out.print(entry.getKey() + "," + entry.getValue());
        System.out.println();

//ListIterator - Interface // hasNext next , hasPrevious previous
        //Introduced for iterating the only list type of collection objects,
        //Legacy classes - v1.0 + New classes - v1.2
        //Bi direction, Read and Write works here

        List<Integer> arraylist = new ArrayList<>();
        arraylist.add(1);
        arraylist.add(5);
        arraylist.add(4);
        arraylist.add(2);
        ListIterator<Integer> li = arraylist.listIterator();
        while (li.hasNext())
            System.out.print(li.next() + " ");
        System.out.println();
        while (li.hasPrevious())
            System.out.print(li.previous() + " ");


    }
}
