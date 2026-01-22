package hu.szamalk.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class KozepTest {
    Kozep tt;

    @BeforeEach
    public void setup(){
        tt = new Kozep();
    }

    public boolean has1(int[][] matrix){
        boolean has1 = false;
        for(int i = 0; !has1 && i < matrix.length; i++){
            if(matrix[i] != null){
                System.out.println(i);
                for(int j = 0; !has1 && j < matrix[i].length; j++){
                    System.out.println("J: " + j);
                    has1 = matrix[i][j] == 1;
                    System.out.println(has1);
                }
            }
        }
        return has1;
    }

    public boolean has1Kozepen(int[][] matrix){
        boolean has1k = false;
        boolean fuss = true;
        int kozep = 0;
        int tartomany = 0;
        for (int i = 0; i < matrix.length; i++){
            if(matrix[i] != null) kozep += matrix[i].length;
        }
        if(kozep > 1) kozep /= 2;
        for(int i = 0; i < matrix.length && fuss; i++){
            if(matrix[i] != null){
                tartomany += matrix[i].length;
                if(kozep < tartomany) {
                    fuss = false;
                    has1k = matrix[i][matrix[i].length + (kozep - tartomany)] == 1;
                }
            }
        }
        return has1k;
    }

    @Test
    void getNotNullMatrix0th() {
        Assertions.assertNotNull(tt.getMatrix()[0][0]);
    }

    @Test
    void getNotNullFureszes0th() {
        Assertions.assertNotNull(tt.getFureszes()[0][0]);
    }

    @Test
    void getHas1Matrix() {
        Assertions.assertEquals(has1(tt.getMatrix()), true);
    }

    @Test
    void getHas1Fureszes() {
        Assertions.assertEquals(has1(tt.getFureszes()), true);
    }

    @Test
    void getHas1KozepenMatrix(){
        has1Kozepen(tt.getMatrix());
    }

    @Test
    void getHas1KozepenFureszes(){
        has1Kozepen(tt.getFureszes());
    }

    @Test
    void matrixNemValtozhat(){
        int origin = tt.getMatrix()[0][0];
        tt.getMatrix()[0][0]= tt.getMatrix()[0][0] - 1;
        System.out.println("Origin: " + origin);
        System.out.println(tt.getMatrix()[0][0]);
        Assertions.assertEquals(tt.getMatrix()[0][0], origin);
    }

    @Test
    void fureszesNemValtozhat(){
        int origin = tt.getFureszes()[0][0];
        tt.getFureszes()[0][0] = tt.getFureszes()[0][0] - 1;
        Assertions.assertEquals(tt.getFureszes()[0][0], origin);
    }

    @Test
    void ezTiz(){
        Assertions.assertEquals(tt.getTomb10().length, 10);
    }

    @Test
    void vanParatlan(){
        int[] yee = tt.getTomb10();
        for(int i = 0; i < yee.length; i++){
            Assertions.assertEquals(yee[i] % 2 == 0, true);
        }
    }
}
