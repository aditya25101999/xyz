/*
HashSet class uses a hash table for storing the elements.
        It implements the set interface.
        Duplicate values are not allowed.
        Before storing any object, the hashset uses the hashCode() and equals() method to check any duplicate entry in the hash table.
        Allows null value.
        Best suited for search operations.

 */

/*
HashSet(): 16 elements and have a load factor of 0.75.

HashSet(int initialCapacity): specified number of elements and having a load factor of 0.75.

HashSet(int initialCapacity, float loadFactor):
HashSet(Collection<? extends E> c): This constructor is used to create a HashSet using the elements of
 collection c.
 */


import java.util.HashSet;

public class cwh15_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);
        HashSet<Integer> myHashSet2 = new HashSet<>( );
        HashSet<Integer> myHashSet3 = new HashSet<>(6);
        // THE THREE TYPES BY WHICH HASHSET CAN BE DEFINED
        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(3);
        myHashSet.add(11);
        myHashSet.add(11);
        System.out.println(myHashSet);

        myHashSet2.add(16);
        myHashSet2.add(18);
        myHashSet2.add(13);
        myHashSet2.add(111);
        myHashSet2.add(111);
        System.out.println(myHashSet2);

        myHashSet3.add(164);
        myHashSet3.add(184);
        myHashSet3.add(143);
        myHashSet3.add(4111);
        myHashSet3.add(4111);
        System.out.println(myHashSet2);
    }
}
