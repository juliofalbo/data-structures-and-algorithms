package datastructure.hashtable;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class HashTableTest {

    private HashTable hashTable;

    @Before
    public void setUp() throws Exception {
        hashTable = new HashTable();
    }

    @Test
    public void putAndGet() {
        hashTable.put("John Smith", "521-1234");
        hashTable.put("Lisa Smith", "521-8976");
        hashTable.put("Sam Doe", "521-5030");
        hashTable.put("Ted Baker", "418-4165");

        Assert.assertEquals("521-1234", hashTable.get("John Smith"));
        Assert.assertEquals("521-8976", hashTable.get("Lisa Smith"));
        Assert.assertEquals("521-5030", hashTable.get("Sam Doe"));
        Assert.assertEquals("418-4165", hashTable.get("Ted Baker"));

        System.out.println(hashTable.toString());
    }

    @Test
    public void collision() {
        hashTable.put("John Smith", "521-1234");
        hashTable.put("Sandra Dee", "521-9655");

        Assert.assertEquals("521-1234", hashTable.get("John Smith"));
        Assert.assertEquals("521-9655", hashTable.get("Sandra Dee"));
    }
}
