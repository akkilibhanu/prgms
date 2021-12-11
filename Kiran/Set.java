import java.util.*;

public class Set {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        // HashSet hs=new HashSet();
        hs.add("Tendul kumar");
        hs.add("Tendul kumar");
        hs.add("Bhargav");
        hs.add("Sai kiran");
        // hs.remove(3);
        Collections.sort(hs);
        System.out.println(hs);
        System.out.println(hs.size());
        // System.out.println(hs);

    }

}
