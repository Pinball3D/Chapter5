package net.smileyzone;
import java.util.Arrays;

class Data {
    public static final int Max = 360;
    private int[][] grid;

    public Data(int[][] paramgrid){
        grid = paramgrid;

    }
    public void repopulate(){
        /**
         fills all elements of grid with randomly generated values
         value is between 1 and Max, inclusive
         value is divisible by 10
         value is NOT divisible by 100
         grid will never be null and has at least one element.
         Print your repopulated array with some kind of indication it has been
         repopulated.
         */

    }


    public int countIncreasingCols(){
        /**
         returns the number of columns in grid that are increasing in order
         A column with only one row is considered to be increasing.
         A column is considered to be increasing if teh element in each row after the first row is greater than or equal to the element in the previous row.
         grid will never be null and has at least one element.
         */
    }
    public static void main(String[] args) {

        int[][] filled = {{10, 50, 40}, {20, 40, 20}, {30, 50, 30}};
        Data test = new Data(filled);
        test.repopulate();
        System.out.println("\nThe number of increasing columns is: " + test.countIncreasingCols());


    }
}

