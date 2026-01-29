package hu.szamalk.model;

import java.util.HashSet;
import java.util.Set;

public class OtosLotto {
    private Set<Integer> halmaz;

    public OtosLotto(){
        halmaz = new HashSet<>();
        while(halmaz.size() < 5){
            int rand = (int)(Math.random()*90)+1;
            halmaz.add(rand);
        }
    }

    public Set<Integer> getHalmaz(){
        Set<Integer> halmaz2 = new HashSet<>();
        halmaz2.addAll(halmaz);
        return halmaz2;
    }
}
