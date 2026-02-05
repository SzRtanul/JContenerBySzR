package hu.szamalk.model;

import java.util.HashMap;

public class HMapUsed {
    private HashMap<String, Integer> ll;

    public HMapUsed(){
        ll = new HashMap<>();
        ll.put("SQL", 5);
        ll.put("Magyar", 3);
        ll.put("Matek", 2);
        ll.put("Angol", 5);
    }

    public HashMap<String, Integer> getLL(){
        return (HashMap<String, Integer>) ll.clone();
    }
}
