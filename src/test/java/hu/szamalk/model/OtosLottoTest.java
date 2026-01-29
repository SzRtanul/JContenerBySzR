package hu.szamalk.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OtosLottoTest {
    OtosLotto ol;

    @BeforeEach
    void vm() {
        ol = new OtosLotto();
    }

    @Test
    void testOt(){
        Assertions.assertTrue(ol.getHalmaz().size() == 5);
    }

    @Test
    void testBeetween1and90(){
        for(int szam : ol.getHalmaz()){
            Assertions.assertTrue(szam > 0 && szam < 91);
        }
    }
}