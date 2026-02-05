package hu.szamalk.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class HMapUsedTest {
    public HMapUsed s;

    @BeforeEach
    void valami(){
        s = new HMapUsed();
    }

    @Test
    void olaa(){
        for(Map.Entry<String, Integer> elem : s.getLL().entrySet()){
            String k = elem.getKey();
            int ertek = elem.getValue();
            Assertions.assertTrue(ertek > 0 && ertek < 6);
        }
    }
}
