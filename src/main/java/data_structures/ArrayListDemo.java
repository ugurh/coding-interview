package data_structures;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("A");
        arr.add("B");

        Iterator it = arr.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
            arr.remove("B");
        }
    }
}
