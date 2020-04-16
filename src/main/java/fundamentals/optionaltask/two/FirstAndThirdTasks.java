package fundamentals.optionaltask.two;

import java.util.Scanner;

/**
 * Enter from the console n - the dimension of the matrix a [n] [n]. Set values of matrix elements in
 *   * a range of values from -M to M using a random number generator (class Random).
 *   * Task01 Sort the rows (columns) of the matrix in ascending order of values of the elements of the k-th column (row).
 *   * Task03 Find the sum of matrix elements located between the first and second positive elements of each row
 */

public class FirstAndThirdTasks {
    private static final Scanner scanner = new Scanner(System.in);
    private static int[][] matrix;


    public static void main(String[] args) {

        setMatrixDimension();
        printMatrix(matrix);
        sortIncreasingOfColumnOrder();  //task01
        System.out.println(sumBetweenPositiveOfMatrix(matrix)); //task03

    }

    private static void sortIncreasingOfColumnOrder() {
        System.out.print("Sort the rows of the matrix in increasing order of the values of the elements of column No.:");
        int k = scanner.nextInt();
        int[][] matrixTwo = orderMatrixRows(matrix, k);
        printMatrix(matrixTwo);
    }

    private static void setMatrixDimension() {
        System.out.print("Set matrix dimension: ");
        int n = scanner.nextInt();
        matrix = fillSquareMatrixRnd(n);
    }

    private static int[][] orderMatrixRows(int[][] matrix, int col) {

        if (isNull(matrix) || col < 1 || col > matrix.length) {
            throw new IllegalArgumentException();
        }

        int[][] m = matrix.clone();

        for (int i = 0, matrixLength = matrix.length; i < matrixLength - 1; i++) {
            for (int j = i + 1; j < matrixLength; j++) {
                if (m[i][col - 1] > m[j][col - 1]) {
                    m = shiftRows(m, i, j);
                }
            }
        }

        return m;
    }


    private static int sumBetweenPositiveOfMatrix(int[][] matrix) {
        System.out.print("Find the sum of the matrix elements located between the first and second positive elements of each row:  ");
        if (isNull(matrix)) {
            throw new IllegalArgumentException();
        }

        int sum = 0;

        for (int[] ints : matrix) {
            sum += sumBetweenPositiveOfRow(ints);
        }

        return sum;
    }

    private static int sumBetweenPositiveOfRow(int[] row) {

        if (isNull(row)) {
            throw new IllegalArgumentException();
        }


        int a = -1;
        int b = -1;
        int i = 0;
        int rowLength = row.length;

        while ((a == -1 || b == -1) & i < rowLength) {
            if (row[i] > 0) {
                if (a == -1) {
                    a = i;
                } else {
                    b = i;
                }
            }
            i++;
        }

        return sumBetweenTwoElements(row, a, b);
    }

    private static int sumBetweenTwoElements(int[] row, int a, int b) {

        if (isNull(row) || a < -1 || a > row.length || b < -1 || b > row.length || (a > b && b != -1)) {
            throw new IllegalArgumentException();
        }

        if (a == -1 || b == -1) {
            return 0;
        } else {
            int sum = 0;
            for (int i = a; i <= b; i++) {
                sum += row[i];
            }
            return sum;
        }
    }


    private static int[][] fillSquareMatrixRnd(int n) {

        if (n < 0) {
            throw new IllegalArgumentException();
        }

        int[][] m = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = (int) (Math.random() * (n * 2 + 2) - (n + 1));
            }
        }

        return m;
    }

    private static void printMatrix(int[][] matrix) {

        if (isNull(matrix)) {
            throw new IllegalArgumentException();
        }

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }

    private static int[][] shiftRows(int[][] matrix, int row1, int row2) {

        if (isNull(matrix) || row1 > matrix.length - 1 || row2 > matrix.length - 1) {
            throw new IllegalArgumentException();
        }

        int[][] m = matrix.clone();

        int[] t = m[row1];
        m[row1] = m[row2];
        m[row2] = t;

        return m;
    }

    private static boolean isNull(int[][] a) {
        return (a == null);
    }

    private static boolean isNull(int[] a) {
        return (a == null);
    }
}
