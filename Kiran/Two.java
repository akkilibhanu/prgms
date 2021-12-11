import java.util.*;

class Two {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.add(1);
        l1.add(2);
        l1.add(2);
        l1.add(4);
        Collections.sort(l1);
        // Collections.sort(a1, Collections.reverseOrder());
        System.out.println(l1.size());
        System.out.println(l1.get(2));
        System.out.println(l1);
        System.out.println(l1);
        Collections.sort(l1, Collections.reverseOrder());
        System.out.println(l1);

    }

}
