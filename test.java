import java.util.*;

public class test {

    public static void main(String[] args) {


        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(9);
        al.add(22);
        al.add(5);
        al.add(45);
        al.add(45);
        System.out.println(al);
        HashSet<Integer> hs = new HashSet<>();
        hs.addAll(al);

        System.out.println(hs);
        TreeSet<Integer> ts = new TreeSet<>();
        ts.addAll(al);

        System.out.println(ts);
        Collections.sort(al);
        System.out.println(al);
        Collections.reverse(al);
        System.out.println(al);
        System.out.println( Collections.binarySearch(al,22));
        System.out.println(Collections.min(al));

    }
}
