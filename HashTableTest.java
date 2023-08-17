import java.util.ArrayList;
import java.util.LinkedList;

public class Hash {
    int bucket;
    ArrayList<LinkedList<Integer>> table;

    Hash(int b) {
        bucket = b;
        table = new ArrayList<LinkedList<Integer>>();
        for (int i = 0; i < b; i++) {
            table.add(new LinkedList<Integer>());
        }
    }

    void insert(int key) {
        int i = key % bucket;
        table.get(i).add(key);
    }

    void remove(int key) {
        int i = key % bucket;
        table.get(i).remove((Integer) key);
    }
}

public class HashTableTest {
    public static void main(String[] args) {
        Hash hashTable = new Hash(10);

        hashTable.insert(5);
        hashTable.insert(15);
        hashTable.insert(25);

        hashTable.remove(15);

        // Print hash table contents
        for (int i = 0; i < hashTable.bucket; i++) {
            System.out.print("Bucket " + i + ": ");
            hashTable.table.get(i).forEach(key -> System.out.print(key + " "));
            System.out.println();
        }
    }
}
