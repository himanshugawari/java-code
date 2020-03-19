package Hashing;

import java.util.LinkedList;

public class MyHash {
  int bucket;
  LinkedList<Integer>[] table;
  // List<LinkedList<Integer>> table;

  MyHash(int b) {
    bucket = b;
    table = new LinkedList[bucket];
  }

  int hash(int key) {
    return key % bucket;
  }

  boolean search(int key) {
    int i = hash(key);

    for (Integer x : table[i]) {
      if (x == key) {
        return true;
      }
    }
    return false;
  }

  void insert(int key) {
    int i = hash(key);
    table[i].addLast(key);
  }

  void remove(int key) {
    int i = hash(key);
    table[i].remove(key);
  }

}