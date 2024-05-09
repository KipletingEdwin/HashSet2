import java.util.HashSet;
import java.util.Iterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        HashSet <Integer> h = new HashSet<Integer>();

        h.add(13);
        h.add(23);
        h.add(33);
        h.add(43);

        Object[] h1 = h.toArray();


        System.out.println(h.size());
        System.out.println(h.hashCode());
        System.out.println("--------------------------------");

        Iterator<Integer> it = h.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }



    }
}