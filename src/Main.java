import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyHashTable<MyTestingClass, Integer> ht = new MyHashTable<>();

        // add 10000 random elements to the hash table
        Random rand = new Random();
        for (int i = 0; i < 10000; i++) {
            Integer value = rand.nextInt(100);
            MyTestingClass key = new MyTestingClass(rand.nextInt(10000), value.toString());
            ht.put(key, value);
        }

        // get the chain array of the hash table
        HashNode<MyTestingClass, Integer>[] chainArray = ht.getChainArray();

        // count the number of elements in each bucket (chain or linked list)
        int[] bucketSizes = new int[chainArray.length];
        for (int i = 0; i < chainArray.length; i++) {
            if (chainArray[i] != null) {
                HashNode<MyTestingClass, Integer> current = chainArray[i];
                while (current != null) {
                    bucketSizes[i]++;
                    current = current.getNext();
                }
            }
        }

        // print the number of elements in each bucket
        for (int i = 0; i < bucketSizes.length; i++) {
            System.out.println("Bucket " + i + ": " + bucketSizes[i]);
        }
    }
}