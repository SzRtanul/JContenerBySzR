package hu.szamalk.model;

import java.util.List;

public class SajatGenerikus {
    public List<String> j;
    public List<Double> atlagok;
    public SajatGenerikus(){
        j = List.of("This", "is", "Teddy!");
        atlagok = List.of(13.0,14.0,12.0);
    }

    public String ListaKiir(List<?> lista){
        String s = "";
        for(Object elm : lista){
            s += elm;
        }
        return s;
    }

    public <T> String ListaKiirT(List<T> lista, T elem){
        String s = "";
        for(T elm : lista){
            s += elm;
        }
       // lista.add(elem);
        return s;
    }
}
