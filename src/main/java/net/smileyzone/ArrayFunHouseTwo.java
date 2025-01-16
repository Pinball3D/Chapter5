package net.smileyzone;

import java.util.Arrays;
//Andrew Smiley
//Program 30
//Chapter 5 (Arrays)
public class ArrayFunHouseTwo {

    public static boolean goingUp(int[] numArray){
        int last = 0;
        for(int i : numArray) {
            if(i > last) {
                return true;
            }
            last = i;
        }
        return false;
    }


    public static boolean goingDown(int[] numArray){
        int last = 0;
        for(int i : numArray) {
            if(i < last) {
                return true;
            }
            last = i;
        }
        return false;
    }
    public static String toString(int[] array) {
        return Arrays.toString(array) + "\n" +
        "is going Up? " + goingUp(array)  + "\n" +
        "is going down? " + goingDown(array)  + "\n" +
        "first 7 values greater than 9 " + Arrays.toString(getCountValuesBiggerThanX(array, 7, 9)) + "\n" +
        "first 5 values greater than 15 " + Arrays.toString(getCountValuesBiggerThanX(array, 5, 15));

    }

    public static int[] getCountValuesBiggerThanX(int[] numArray, int count, int x) {
        int[] vals = new int[count];
        int arrCount = 0;
        for(int i : numArray) {
            if(arrCount < count) {
                if (i > x) {
                    vals[arrCount] = i;
                    arrCount++;//this keeps track of the number of values in the array to be returned
                }
            }
        }
        return vals;
    }

    public static void main(String[] args)
    {
        System.out.println(toString(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(toString(new int[]{1, 2, 3, 9, 11, 20, 30}));
        System.out.println(toString(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 0, -2}));
        System.out.println(toString(new int[]{3, 6, 9, 12, 15, 18, 21, 23, 19, 17, 15, 13, 11, 10, 9, 6, 3, 2, 1, 0}));
    }
    /* OUTPUT
    [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
is going Up? true
is going down? false
first 7 values greater than 9 [10, 0, 0, 0, 0, 0, 0]
first 5 values greater than 15 [0, 0, 0, 0, 0]
[1, 2, 3, 9, 11, 20, 30]
is going Up? true
is going down? false
first 7 values greater than 9 [11, 20, 30, 0, 0, 0, 0]
first 5 values greater than 15 [20, 30, 0, 0, 0]
[9, 8, 7, 6, 5, 4, 3, 2, 0, -2]
is going Up? true
is going down? true
first 7 values greater than 9 [0, 0, 0, 0, 0, 0, 0]
first 5 values greater than 15 [0, 0, 0, 0, 0]
[3, 6, 9, 12, 15, 18, 21, 23, 19, 17, 15, 13, 11, 10, 9, 6, 3, 2, 1, 0]
is going Up? true
is going down? true
first 7 values greater than 9 [12, 15, 18, 21, 23, 19, 17]
first 5 values greater than 15 [18, 21, 23, 19, 17]

     */
}
