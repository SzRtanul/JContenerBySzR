package hu.szamalk.model;

import java.util.Arrays;

public class Kozep {
    private int[][] matrix;
    private int[][] fureszes;

    public Kozep() {
        feltolt();
    }

    public void feltolt(){
        matrix = new int[5][2];
        fureszes = new int[5][];
        matrix[4][1] = 1;
        // return 0; //szamok[szamok.length/2];
    }

    public int[][] getMatrix(){
        return Arrays.copyOf(matrix, matrix.length);
    }

    public int[][] getFureszes(){
        return Arrays.copyOf(fureszes, fureszes.length);
    }
}
