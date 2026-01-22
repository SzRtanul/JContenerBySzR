package hu.szamalk.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericTomb {
    List<Integer> egeszek;
    public GenericTomb(){
        egeszek = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            egeszek.add((int)(Math.random()*89)+10);
        }
    }

    public List<Integer> getParos(){
       // List<Integer> egsz = Arrays.copyOf(egeszek, egeszek.size());
        for(int i = egeszek.size(); i > -1; i--){
            if(egeszek.get(i) % 2 != 0) egeszek.remove(i);
        }
        return egeszek;
    }
}
