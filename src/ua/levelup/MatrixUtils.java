package ua.levelup;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringReader;

public class MatrixUtils {

    public static void printMatrix(int[][] matrixFromString) {
        for (int i = 0; i < matrixFromString.length; i++) {

            for (int j = 0; j < matrixFromString[i].length; j++) {
                System.out.print(matrixFromString[i][j] + " ");
            }

            System.out.print("\n");
        }
        System.out.println("");
    }

    public static int[][] getMatrixFromString(String matrixAsString) {

        String[] lines = matrixAsString.split("\n");

        int[][] result = new int[lines.length][];
        for (int i = 0; i < lines.length; i++) {
            String[] elements = lines[i].split(",");
            result[i] = new int[elements.length];
            for (int j = 0; j < elements.length; j++) {
                result[i][j] = Integer.parseInt(elements[j].trim());

            }
        }

        return result;


    }

    public static void printMinPlusCoordinates(int[][] matrix ){
        int value = matrix[0][0];
        int x = 0;
        int y = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (value > matrix[i][j]){
                    value = matrix[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println("Найменьшее значение:" + value + "\nПо оси х: " + x + "\nПо оси у: " + y);
        System.out.println("");
    }

    public static void printMaxPlusCoordinates(int[][] matrix ){
        int value = matrix[0][0];
        int x = 0;
        int y = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (value < matrix[i][j]){
                    value = matrix[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println("Найменьшее значение:" + value + "\nПо оси х: " + x + "\nПо оси у: " + y);
        System.out.println("");
    }

    public static void minAndMaxInColumn(int[][] matrix, int column){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix[column].length; i++) {
            if (matrix[column][i] < min){
                min = matrix[column][i];
            } else if (matrix[column][i] > max){
                max = matrix[column][i];
            }
        }
        System.out.println("В колонке №" + column + "\nМинимальное: " + min + "\nМаксимальное: " + max);
    }

}