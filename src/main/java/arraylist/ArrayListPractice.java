package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListPractice {

    public static void main(String args[]) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(10);

        Iterator<Integer> itr = list.iterator();
       // list.add(54); // ConcurrentModificationException
        while (itr.hasNext()) {
            int next = itr.next();

            if (next == 30) {
                //list.remove(Integer.valueOf(30)); // ConcurrentModificationException
                itr.remove();
            }
        }

        System.out.println(list);
    }
}
