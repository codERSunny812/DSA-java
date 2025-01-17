package DataStructure.Hashing;
import java.util.*;

public class HashSetInJava {
    static class customHashSet<T>{
        //node to store the value of the element
        private class Node{
            T value;

//            constructor
            public Node (T value){
                this.value=value;

            }
        }

        // Instance variables
        private int n; // Number of elements in the set
        private int N; // Number of buckets
        private LinkedList<Node>[] buckets; // Array of linked lists (buckets)

        // Constructor
        @SuppressWarnings("unchecked")
        public customHashSet() {
            this.N = 4; // Initial size of the buckets array
            this.buckets = new LinkedList[N];
            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }
            this.n = 0;
        }

//        hash function to hash the value
        private int hashFunction(T value){
            int hashCode = value.hashCode();
            return Math.abs(hashCode) % N;
        }

        // Helper method to search for an element in a bucket
        private int searchInBucket(T value, int bucketIndex) {
            LinkedList<Node> bucket = buckets[bucketIndex];
            for (int i = 0; i < bucket.size(); i++) {
                if (bucket.get(i).value.equals(value)) {
                    return i; // Element found, return index
                }
            }
            return -1; // Element not found
        }

//        add function to add element in the hashset
        public void  addElement(T value){
            int bi = hashFunction(value);
            int index = searchInBucket(value,bi);

//            if the element is not present then only add it
            if(index == -1){
                buckets[bi].add(new Node(value));
                n++; //increse the size of the node
            }

            // Rehash if load factor exceeds 2.0
            double loadFactor = (double) n / N;
            if (loadFactor > 2.0) {
                rehash();
            }

        }


//        function to check the existance of an element

        public boolean  isContain(T value){
            int bi = hashFunction(value);
            int index = searchInBucket(value,bi);

            return index != -1;
        }

        //function to remove any element
        public boolean removeElement(T value){
            int bi = hashFunction(value);
            int index = searchInBucket(value,bi);

            if(index != -1){
              buckets[bi].remove(index);
              n--;
              return  true; //element found
            }
            return false; //element not found
        }

        public boolean isEmpty(){
            return n == 0;
        }

        public int size(){
            return n;
        }

        // Rehash: Resize the buckets array and redistribute elements
        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node>[] oldBuckets = buckets;

            // Double the size of the buckets array
            N = N * 2;
            buckets = new LinkedList[N];
            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }

            // Rehash all elements
            for (LinkedList<Node> bucket : oldBuckets) {
                for (Node node : bucket) {
                    addElement(node.value); // Reinsert each element into the new buckets array
                }
            }
        }



    }
    public static void main(String[] args) {
      customHashSet<Integer> hash = new customHashSet<>();
        System.out.println(hash.isEmpty()); //true
      hash.addElement(1);
      hash.addElement(2);
      hash.addElement(3);
      System.out.println(hash.isEmpty()); //false
        System.out.println(hash.size());  //3
        hash.addElement(1);
        System.out.println(hash.size()); // 3

    }
}
