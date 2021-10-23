import java.util.*;

class One {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        a1.add("kiran");
        a1.add("Bhanutej");
        a1.add("Tendul kuamr");
        a1.add("Girish");
        Collections.sort(a1);
        Collections.sort(a1, Collections.reverseOrder());
        System.out.println(a1.size());
        System.out.println(a1.get(2));
        System.out.println(a1);
        System.out.println(a1);
    }

}
