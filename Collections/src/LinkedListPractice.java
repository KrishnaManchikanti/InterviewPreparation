import java.util.*;

public class LinkedListPractice {
    //When we delete an element from list whole array should shift [Drawback]
    //LL is efficient in Insertion and deletion of data
    public static void main(String[] args) {
//      List<Integer> LL = new LinkedList<>();
//      Queue<Integer> LL = new LinkedList<>();
//      Collection<Integer> LL = new LinkedList<>();
//      Iterable<Integer> LL = new LinkedList<>();
        //above is just reference

        LinkedList<String> l1 = new LinkedList<>();//item,prev,next
        System.out.println(l1);
        l1.add("Y1");
        l1.add("Y2");
        ArrayList<String> al = new ArrayList<>();
        al.add("Y3");
        al.add("Y4");
        l1.addAll(0, al);//addall/removeall rises when we use 2Objects
        System.out.println(l1);
        l1.removeAll(al);
        System.out.println(l1);
        System.out.println(l1.get(1));
        System.out.println(l1.contains("Y1"));
        l1.set(0, "wd");
        System.out.println(l1);
        for (String s : l1) {
            System.out.print(s + " ");
        }
    }
}
