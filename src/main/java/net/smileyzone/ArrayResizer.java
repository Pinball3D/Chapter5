package net.smileyzone;

import java.util.Arrays;

class ArrayResizer {
    private int[][] array2D;
    public ArrayResizer(int[][] grid){
        array2D = grid;
    }
    public static boolean isNonZero(int[][] array2D, int r){
        /**
         returns true if and only if every value in row r of array 2d is non-zero.
         r is a valid row index in array2D.
         return array2D is unchanged.
         */
        int count = 0;
        for(int i : array2D[r]) {
            count+=i;
        }
        return count == 0;
    }
    public static int numNonZeroRows(int[][] array2D){
        int count = 0;
        for(int i = 0; i < array2D.length; i++) {
            if(isNonZero(array2D, i)) {
                count++;
            }
        }
        return count;
    }
    public static int[][] resize(int [][] array2D){
        /**
         returns a new 2 dimensional array that contains only rows from array2D with no zeros.
         array2D contains at least one column and at least one row with no zeros.
         array2D is unchanged.
         */
        int[][] array = new int[numNonZeroRows(array2D)][array2D[0].length];
        for(int i = 0; i < array2D.length; i++) {
            if(isNonZero(array2D, i)) {
                for(int k = 0; k < array[0].length; k++) {
                    array[i][k] = array2D[i][]
                }
            }
        }
        return array;
    }
    public String toString(){

        /**
         Write a toString that will return all the same information from my print
         statements in the main.
         Call isNonZero() length times of the array.
         Call numNonZeroRows() one time on the original array passed
         Call resize() and then print the resized array
         */
    }
    public static void main(String[] args) {

        int[][] filled = {{2, 1, 0}, {1, 3, 2}, {0, 0, 0}, {4, 5, 6}};
        ArrayResizer test = new ArrayResizer(filled);

        System.out.println("There are no zeros in row 0  " + test.isNonZero(filled, 0));
        System.out.println("There are no zeros in row 1  " +test.isNonZero(filled, 1));
        System.out.println("There are no zeros in row 2  " +test.isNonZero(filled, 2));
        System.out.println("There are no zeros in row 3  " +test.isNonZero(filled, 3));

        System.out.println("There are " + test.numNonZeroRows(filled) + " rows with no 0's in the array provided.");

        System.out.println("The new array with all of the rows holding no zeros looks like this: ");
        for(int [] r : test.resize(filled))
            System.out.println(Arrays.toString(r));


    }
}
