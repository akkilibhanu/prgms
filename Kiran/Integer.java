import java.util.*;

public class Integer {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(2);
        hs.add(6);
        hs.add(8);
        hs.add(1);
        Collections.sort(hs);
        System.out.println(hs);
    }
}
