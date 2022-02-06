package data_structures.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListMain {

    public static void main(String[] args) {
        List<String> list = new ArrayList();

        System.out.println("Size : " + list.size()); // Size:0 , Capacity:0

        list.add("ArrayList");
        System.out.println("Size : " + list.size()); // size:1 , Capacity :  DEFAULT_CAPACITY -> 10

        // When arraylist is fulfilled, Lazy innitializatin : n + n/2 +1 new capacity

        list.remove("ArrayList");
        System.out.println("Size : " + list.size());

        List<String> list2 = new ArrayList(1);
        list2.add("ArrayList");
        list2.add("ArrayList1");
        System.out.println("Size : " + list2.size()); // size:

        List list3 = new ArrayList(list2);
        System.out.println("Size :" + list3.size());
        list3.add("ArrayList3");

        System.out.println("Size List 2 : " + list2.size()); //
        System.out.println("Size List 3: " + list3.size()); //


       // list3.add(-1,"Nagative"); // .IndexOutOfBoundsException
       // list3.add(3, "Out of");   // .IndexOutOfBoundsException
        list3.add(2, "Out of");

        System.out.println("list3 :" + list3);

        list3.add(list2);

        System.out.println("list3 :" + list3);

        list3.add(1,list);

        List<Object> list4 = new ArrayList<>();
        list4.add(list);
        list4.add(list2);
        list4.add(true);

        System.out.println("list4 :" + list4);

        list4.remove(list2);
        System.out.println("list4 :" + list4);

        list4.clear();

        List<String> teams = new ArrayList<>();
        teams.add("gs");
        teams.add("fb");

        teams.replaceAll(team -> team.toUpperCase());
        System.out.println(teams);
        teams.set(0,"GOZ");

        System.out.println(teams);

        System.out.println(teams.indexOf("GOZ"));
        System.out.println(teams.lastIndexOf("FB"));
        System.out.println(teams.lastIndexOf("GS"));

        Iterator<String> itr = teams.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Iterating using forEachRemaining() method");
        Iterator<String> newItr = teams.iterator();
        newItr.forEachRemaining(element -> System.out.println(element));

    }
}
