package hu.szamalk.model;

import java.util.Arrays;

public class Kozep {
    private int[][] matrix;
    private int[][] fureszes;
    private int[] tomb10;

    public Kozep() {
        feltolt();
    }

    public void feltolt(){
        matrix = new int[5][2];
        fureszes = new int[5][];
        matrix[4][1] = 1;
        tomb10 = new int[10];
        for(int i = 0; i < tomb10.length; i++){
            tomb10[i] = (int)((Math.random() * 90) + 10);
        }
        // return 0; //szamok[szamok.length/2];
    }

    public int[][] doDeepCopy(int[][] matrix){
        int[][] newMatrix = new int[matrix.length][];
        for(int i = 0; i < matrix.length; i++){
            if(matrix[i] != null) newMatrix[i] = Arrays.copyOf(matrix[i], matrix[i].length);
        }
        return newMatrix;
    }

    public int[][] getMatrix(){
        return doDeepCopy(matrix);
    }

    public int[][] getFureszes(){
        return doDeepCopy(fureszes);
    }

    public int[] getTomb10(){
        return Arrays.copyOf(tomb10, tomb10.length);
    }
}
