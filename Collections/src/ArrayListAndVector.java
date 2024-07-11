import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListAndVector {
    public static void main(String[] args) {
        //For Dynamic size
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        System.out.println(arrayList.size());
        System.out.println(arrayList.getFirst());
        System.out.println(arrayList.removeFirst());
        System.out.println(arrayList);
        System.out.println(arrayList.contains(3));
        System.out.println(arrayList);
        System.out.println(arrayList.set(0,100));
        System.out.println(arrayList);
        System.out.println(arrayList.indexOf(3));
        System.out.println(arrayList.getFirst());
        System.out.println(arrayList.getLast());

        Object[] oA =  arrayList.toArray();
        System.out.println(Arrays.toString(oA));

        for (Integer i: arrayList){
            System.out.print(i+" ");
        }
        System.out.println();
        Integer[] arr = new Integer[]{9,7,6,55,4,3};
        List<Integer> arrayList1 = new ArrayList<>(Arrays.asList(arr));
        System.out.println(arrayList+"arrayList");

        arrayList.addAll( arrayList1);
        System.out.println(arrayList);
        arrayList.removeAll(arrayList1);//removes all with similar values from oneList to another List returns Boolean
        System.out.println(arrayList);
        arrayList.addAll( arrayList1);
        arrayList.addAll(2, arrayList1);
        System.out.println(arrayList);

        arrayList.clear();
        System.out.println(arrayList);

        ArrayList<Integer> arli = new ArrayList<>(20);
        arli.add(1);
        System.out.println(arli.size());
    }
}