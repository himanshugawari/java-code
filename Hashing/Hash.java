package Hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Hash {
  public static void main(String[] args) {
    // MyHash m = new MyHash(7);
    // m.insert(50);
    // m.insert(21);
    // m.insert(58);
    // m.insert(17);
    // m.insert(15);
    // m.insert(49);
    // m.insert(56);
    // m.insert(22);
    // m.insert(23);
    // m.insert(25);
    // System.out.println(m.search(22));
    // m.remove(22);
    // System.out.println(m.search(22));

    // HashSet
    // Set<String> h = new HashSet<>();
    // h.add("gfg");
    // h.add("himanshu");
    // h.add("hardik");
    // System.out.println(h);
    // h.remove("gfg");
    // System.out.println(h);
    // System.out.println(h.contains("hardik"));
    // Iterator<String> i = h.iterator();
    // while (i.hasNext()) {
    // System.out.print(i.next() + " ");
    // }
    // System.out.println(h.size());
    // for (String s : h) {
    // System.out.print(s + " ");
    // }

    // HashMap
    Map<String, Integer> m = new HashMap<>();
    m.put("himanshu", 10);
    m.put("hardik", 20);
    m.put("rohidas", 30);
    System.out.println(m);
    System.out.println(m.size());
    for (Entry<String, Integer> e : m.entrySet()) {
      System.out.println(e.getKey() + " " + e.getValue());
    }
    if (m.containsKey("rohidas")) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
    m.remove("himanshu");
    System.out.println(m.size());
    if (m.containsValue(30)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
    System.out.println(m.get("hardik"));
    System.out.println(m.get("himanshu"));

  }
}