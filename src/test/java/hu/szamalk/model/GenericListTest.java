package hu.szamalk.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class GenericListTest {
    private GenericList glob;

    @BeforeEach
    void valami(){
        glob=new GenericList();
    }

    @Test
    void testLegalabb3(){
        for(List<Integer> intl : glob.getKulso()){
            Assertions.assertEquals(intl.size() > 2, true);
        }
    }

    @Test
    void test1and5kozottt(){
        for(List<Integer> intl : glob.getKulso()){
            for(int intle : intl){
                Assertions.assertEquals(intle > 0 && intle < 6, true);
            }
        }
    }
}
