package ua.levelup;

public class Main {

    public static final String MATRIX_1 = "Matrix1.txt";
    public static final String MATRIX_2 = "Matrix2.txt";

    public static void main(String[] args) {

        //1 Use class Reader for read both Matrix1.txt and Matrix2.txt files

        //2 Use method getMatrixFromString from class MatrixUtils for parsing stringValue to matrix int[][]

        //3 Use method printMatrix from class MatrixUtils for printing matrix in console (Do not use deepToString)
        /*
        * It should look like
        * 3 0 4
        * 6 3 1
        * 8 2 1
        * and without any commas
         */


        //create method for looking min element in array and print its coordinates
        //create method for looking max element in array and print its coordinates

        //create methods for finding min and max in only one column we need to find

        //create method for sum of all elements in one line
        //create method for sum of all elements in one column

        //Create new array 20 x 20 fill with random int values
        //create method which collect all elements from diagonals

        Reader reader = new Reader();

        String strMatrix1 = new String(reader.readFromFile(MATRIX_1));
        String strMatrix2 = new String(reader.readFromFile(MATRIX_2));

        MatrixUtils.printMatrix(MatrixUtils.getMatrixFromString(strMatrix1));

        MatrixUtils.printMatrix(MatrixUtils.getMatrixFromString(strMatrix2));

        MatrixUtils.printMinPlusCoordinates(MatrixUtils.getMatrixFromString(strMatrix1));
        MatrixUtils.printMinPlusCoordinates(MatrixUtils.getMatrixFromString(strMatrix2));
        MatrixUtils.printMaxPlusCoordinates(MatrixUtils.getMatrixFromString(strMatrix1));
        MatrixUtils.printMaxPlusCoordinates(MatrixUtils.getMatrixFromString(strMatrix2));
        MatrixUtils.minAndMaxInColumn(MatrixUtils.getMatrixFromString(strMatrix1), 2);

    }


}
