package data_structures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Following is the list of methods available to make Collections unmodifiable:
 *
 * unmodifiableList(List<? extends T> list)
 * unmodifiableSet(Set<? extends T> s)
 * unmodifiableMap(Map<? extends K, ? extends V> m)
 * unmodifiableCollection(Collection<? extends T> c)
 * unmodifiableSortedMap(SortedMap<K,? extends V> m)
 * unmodifiableSortedSet(SortedSet<T> s)
 *
 * The Collections class provides us with the following methods
 * that can be used to make our existing collection thread-safe.
 *
 * synchronizedCollection(Collection<T> c)
 * synchronizedList(List<T> list)
 * synchronizedMap(Map<K,V> m)
 * synchronizedSet(Set<T> s)
 * synchronizedSortedMap(SortedMap<K,V> m)
 * synchronizedSortedSet(SortedSet<T> s)The Collections class provides us with the following methods
 * that can be used to make our existing collection thread-safe.
 *
 * synchronizedCollection(Collection<T> c)
 * synchronizedList(List<T> list)
 * synchronizedMap(Map<K,V> m)
 * synchronizedSet(Set<T> s)
 * synchronizedSortedMap(SortedMap<K,V> m)
 * synchronizedSortedSet(SortedSet<T> s)
 */
public class CollectionsDemo {

    public static void main(String args[]) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(9);
        list1.add(12);
        list1.add(34);
        list1.add(54);
        list1.add(66);
        list1.add(76);

        List<Integer> list2 = new ArrayList<>();
        list2.add(90);
        list2.add(12);
        list2.add(98);
        list2.add(43);

        Collections.copy(list1, list2);

        System.out.println(list1);

        Collections.fill(list1, 10);

        System.out.println(list1);

        List<String> list = new ArrayList<String>();
        list.add("India");
        list.add("USA");
        list.add("Russia");

        List<String> unmodifiableList = Collections.unmodifiableList(list);
        // This will throw exception because element can't be added to unmodifiable list.
        // unmodifiableList.add("China"); //UnsupportedOperationException
    }
}

/*
    static class UnmodifiableList<E> extends UnmodifiableCollection<E> implements List<E> {
        private static final long serialVersionUID = -283967356065247728L;

        final List<? extends E> list;

        UnmodifiableList(List<? extends E> list) {
            super(list);
            this.list = list;
        }

        public boolean equals(Object o) {return o == this || list.equals(o);}
        public int hashCode()           {return list.hashCode();}

        public E get(int index) {return list.get(index);}
        public E set(int index, E element) {
            throw new UnsupportedOperationException();
        }
        public void add(int index, E element) {
            throw new UnsupportedOperationException();
        }
        public E remove(int index) {
            throw new UnsupportedOperationException();
        }
        public int indexOf(Object o)            {return list.indexOf(o);}
        public int lastIndexOf(Object o)        {return list.lastIndexOf(o);}
        public boolean addAll(int index, Collection<? extends E> c) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void replaceAll(UnaryOperator<E> operator) {
            throw new UnsupportedOperationException();
        }
        @Override
        public void sort(Comparator<? super E> c) {
            throw new UnsupportedOperationException();
        }
        .
        .
        .
        .
   }
 */
