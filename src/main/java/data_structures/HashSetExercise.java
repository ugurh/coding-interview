package data_structures;

import java.util.HashSet;
import java.util.Set;

public class HashSetExercise {

    public static void main(String[] args) {
        int[] data = {12, 34, 1, 56, 43, 34, 65};
        Set<Integer> set = new HashSet<>();
        int duplicate = 0;

        for (Integer item: data) {
            if (set.contains(item)){
                duplicate = item;
            }else{
                set.add(item);
            }
        }

        System.out.println(duplicate);
    }
}
