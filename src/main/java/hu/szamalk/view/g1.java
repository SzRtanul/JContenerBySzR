package hu.szamalk.view;

import hu.szamalk.model.SajatGenerikus;

import java.util.HashMap;
import java.util.Map;

public class g1 {
    void valami(String g){
        System.out.println(g);
    }

    void EgyediNezet(HashMap<String, Integer> ll){
        for(Map.Entry<String, Integer> elem : ll.entrySet()){
            String k = elem.getKey();
            int ertek = elem.getValue();
            System.out.printf("[%s] = %d", k, ertek);
        }
    }
}
