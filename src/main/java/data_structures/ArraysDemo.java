package data_structures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Quicksort is faster in both cases, it is not a stable algorithm.
 * Merge sort is a stable algorithm, so it is used in the case of sorting an object array.
 * In the case of the primitive array, we don’t care about stability, so quicksort is used.
 * <p>
 * Stable sorting algorithms are algorithms that maintain the relative order of equal elements.
 * For example, we have an array [1,4,6,8,6], which we need to sort.
 * Now after sorting this array, the result is [1,4,6,6,8].
 * Although there are two sixes in the array, we don’t care which six came first in the sorted array.
 * But in the case of an object array, the relative order of elements also matters.
 * If two objects are the same in an object array,
 * then their relative order should be the same in the sorted array.
 */
public class ArraysDemo {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int index = Arrays.binarySearch(numbers, 2);

        System.out.println("The index of element 2 in the array is :" + index);

        index = Arrays.binarySearch(numbers, 5, 9, 4);

        System.out.println("The index of element 4 in the array is " + index);

        Employee[] employees = {
                new Employee(123, "Jay"),
                new Employee(124, "Roy"),
                new Employee(125, "Nikki"),
                new Employee(126, "Tom")
        };

        index = Arrays.binarySearch(employees, new Employee(124, "Roy"), (emp1, emp2) -> emp1.empId - emp2.empId);

        System.out.println("The index of employee object in the array is " + index);

        Integer[] numbersx = {10, 2, 32, 12, 15, 76, 17, 48, 79, 9};
        Arrays.sort(numbersx);

        for (int i : numbersx) {
            System.out.print(i + " ");
        }

        Integer[] numbersc = {10, 2, 32, 12, 15, 76, 17, 48, 79, 9};
        Arrays.parallelSort(numbersc);

        for (int i : numbersc) {
            System.out.print(i + " ");
        }

        int[] numbersv = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] newArray = Arrays.copyOf(numbersv, numbersv.length);

        System.out.println("The copied array is: ");

        for (int i : newArray) {
            System.out.print(i + " ");
        }

        int[] newArrayBiggerSize = Arrays.copyOf(numbersv, 20);
        System.out.println();
        System.out.println("The copied array is: ");

        for (int i : newArrayBiggerSize) {
            System.out.print(i + " ");
        }

        int[] newArrayc = Arrays.copyOfRange(numbersv, 0, 5);

        System.out.println("The copied array is: ");

        for (int i : newArrayc) {
            System.out.print(i + " ");
        }
        System.out.println("--------------------------");
        // Creating an Array of Employee objects.
        Employee[] employeesx = {
                new Employee(123, "Jay"),
                new Employee(124, "Ryan")
        };

        // Creating the copy of Array.
        Employee[] copiedArray = Arrays.copyOf(employeesx, 2);

        // Changing the name of first employee in original array.
        employeesx[0] = new Employee(123, "Changed Name");

        // Printing the name of first employee in original array.
        System.out.println(employeesx[0].empName);

        // Printing the name of first employee in copied array.
        System.out.println(copiedArray[0].empName);

        Integer[] numbersl = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        List<Integer> list = Arrays.asList(numbersl);

        System.out.println(list);
        // list.add(50); //UnsupportedOperationException


        Integer[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Integer[] numbers2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean isEqual = Arrays.equals(numbers1, numbers2);
        System.out.println("Checking if two arrays are equal : " + isEqual);
        System.out.println("--------------------");

        Integer[] numbersf = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.fill(numbersf, 20);

        for (int i : numbersf) {
            System.out.print(i + " ");
        }
        System.out.println("--------------------");

        List<Integer> listx = new ArrayList<>();
        listx.add(34);
        listx.add(12);
        listx.add(9);
        listx.add(76);
        listx.add(29);
        listx.add(75);

        System.out.println("The minimum element in the List is: " + Collections.min(list));
        System.out.println("The maximum element in the List is: " + Collections.max(listx));
        System.out.println("Total number of times,9 is present in the List is: " + Collections.frequency(list, 9));
        System.out.println("The minimum element in the List is: " + Collections.binarySearch(listx,new Integer(34)));


    }
}

