package hu.szamalk.model;

import java.util.ArrayList;
import java.util.List;

public class GenericList {
    private List<String> targyak;
    private List<List<Integer>> kulso;

    public GenericList(){
        targyak = new ArrayList<>();
        targyak.add("SQL");
        targyak.add("Prog");
        targyak.add("Math");
        kulso = new ArrayList<>();
        kulso.add(new ArrayList<>());
        kulso.get(0).add(1);
        kulso.get(0).add(1);
        kulso.get(0).add(4);
        kulso.get(0).add(1);
        kulso.add(new ArrayList<>());
        kulso.get(1).add(2);
        kulso.get(1).add(3);
        kulso.get(1).add(6);
        kulso.get(1).add(1);
        kulso.add(new ArrayList<>());
        kulso.get(2).add(2);
        kulso.get(2).add(3);
/*
        for(List<Integer> intle : kulso){
            for(int intl : intle){
                System.out.println(intl);
            }
        }
        */

    }

    public List<String> getTargyak() {
        List<String> targyakr = new ArrayList<>();
        for(String targy : targyak) targyakr.add(targy);
        return targyakr;
    }

    public List<List<Integer>> getKulso() {
        int lis = 0;
        List<List<Integer>> kulsor = new ArrayList<>();
        for(List<Integer> kuls : kulso){
            for(int kul : kuls) kulsor.get(lis).add(kul);
            lis++;
        }
        return kulso;
    }

  /*  public List<List<Integer>> getMulti() {
        int lis = 0;
        List<List<Integer>> kulsor = mul
        return kulso;
    }*/
}
