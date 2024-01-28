import java.util.*;
public class ll {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<String>();

        list.add("Rohit");
        list.add("sddvknds");
        list.add("gv");
        System.out.println(list);
        list.remove("gv");
        System.out.println(list);
        list.addLast("dfvdf");
        list.removeLast();
        System.out.println(list.size());
        System.out.println(list);

    }
}
