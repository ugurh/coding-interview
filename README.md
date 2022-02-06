**Binary Search** can run only on a sorted list of elements.

Some common Big O run times fastest to slowest:
- **O(log n)**, also known as log time. Example: Binary search.
- **O(n)**, also known as linear time. Example: Simple search.
- **O(n * log n)**. Example: A fast sorting algorithm, like quicksort
- **O(n 2 )**. Example: A slow sorting algorithm, like selection sort
- **O(n!)**. Example: A really slow algorithm
 
![](src/main/resources/algorithms.png)

- Algorithm speed isn’t measured in seconds, but in growth of the
number of operations.
- Instead, we talk about how quickly the run time of an algorithm
increases as the size of the input increases.
- Run time of algorithms is expressed in Big O notation.
- O(log n) is faster than O(n), but it gets a lot faster as the list of items
you’re searching grows.

**Recap**
- _Binary search is a lot faster than simple search._
- _O(log n) is faster than O(n), but it gets a lot faster once the list of
items you’re searching through grows._
- _Algorithm speed isn’t measured in seconds._
- _Algorithm times are measured in terms of growth of an algorithm._
- _Algorithm times are written in Big O notation._


![](src/main/resources/array_and_linkedlist.png)

**Selection sort**
 - This takes O(n × n) time or O(n*2 ) time.
 - Sorting algorithms are very useful. Now you can sort
 - Names in a phone book
 - Travel dates
 - Emails (newest to oldest)
 
_Selection sort is a neat algorithm, but it’s not very fast. **Quick sort** is a
   faster sorting algorithm that only takes O(n log n) time_

![](src/main/resources/quick_sort.png)

**HashTable**

You started this chapter at the grocery store. You wanted to build
something that would give you the prices for produce instantly. Well,
hash tables are really fast.
In the average case, hash tables take O(1) for everything. O(1) is called
constant time. You haven’t seen constant time before. It doesn’t mean instant. It means the time taken will stay the same, regardless of how
big the hash table is.

![](src/main/resources/hash_table.png)

_See how it’s a flat line? That means it doesn’t matter whether your hash
table has 1 element or 1 billion elements—getting something out of
a hash table will take the same amount of time._
![](src/main/resources/hash_table_time.png)

In the worst case, a hash table takes O(n)—linear time—for everything,
which is really slow.

_Let’s compare hash tables to arrays and lists._
![](src/main/resources/compare_data_store_types.png)

- You can make a hash table by combining a hash function
with an array.
- Collisions are bad. You need a hash function that
minimizes collisions.
- Hash tables have really fast search, insert, and delete.
- Hash tables are good for modeling relationships from one
item to another item.
- Once your load factor is greater than .07, it’s time to resize
your hash table.
- Hash tables are used for caching data (for example, with
a web server).
- Hash tables are great for catching duplicates.

