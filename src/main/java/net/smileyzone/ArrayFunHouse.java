package net.smileyzone;

// Andrew Smiley
// Program 29
// Chapter 5
import java.util.Arrays;
public class ArrayFunHouse{
    public static int getSum(int[] numArray, int start, int stop) {
        int sum = 0;
        for(int i = start; i < stop; i++) {
            sum += numArray[i];
        }
        return sum;
    }
    //getCount() will return number of times val is present
    public static int getCount(int[] numArray, int val){
        int count = 0;
        for(int num : numArray) {
            if (num == val) {
                count++;
            }
        }
        return count;
    }
    public static int[] removeVal(int[] numArray, int val){
        int[] withRemoved = new int[numArray.length-getCount(numArray, val)];
        int count = 0;
        for (int num : numArray) {
            if (num != val) {
                withRemoved[count] = num;
                count++;
            }
        }
        return withRemoved;
    }

    public static String toString(int[] array) {
        return Arrays.toString(array) + "\n" +
        "sum of spots 3 - 6 = " + ArrayFunHouse.getSum(array, 3, 6) + "\n" +
        "sum of spots 2 - 9 = " + ArrayFunHouse.getSum(array, 2, 9) + "\n" +
        "# of 4s = " + ArrayFunHouse.getCount(array, 4) + "\n" +
        "# of 9s = " + ArrayFunHouse.getCount(array, 9) + "\n" +
        "# of 7s = " + ArrayFunHouse.getCount(array, 7) + "\n" +
        "New array with all the 7s removed = " + Arrays.toString(ArrayFunHouse.removeVal(array, 7)) + "\n" +
        "# of 7s = " +  ArrayFunHouse.getCount(ArrayFunHouse.removeVal(array, 7),7);
    }

    public static void main(String args[]) {

        //arrays
        int[] one = {7, 4, 10, 0, 1, 7, 6, 5, 3, 2, 9, 7};
        System.out.println(toString(one));
        int[] two = {7, 4, 2, 7, 3, 4, 6, 7, 8, 9, 7, 0, 10, 0, 1, 7, 6, 5, 7, 3, 2, 7, 9, 9, 8, 7};
        System.out.println(toString(two));
    }
    /* OUTPUT
    [7, 4, 10, 0, 1, 7, 6, 5, 3, 2, 9, 7]
sum of spots 3 - 6 = 8
sum of spots 2 - 9 = 32
# of 4s = 1
# of 9s = 1
# of 7s = 3
New array with all the 7s removed = [4, 10, 0, 1, 6, 5, 3, 2, 9]
# of 7s = 0
[7, 4, 2, 7, 3, 4, 6, 7, 8, 9, 7, 0, 10, 0, 1, 7, 6, 5, 7, 3, 2, 7, 9, 9, 8, 7]
sum of spots 3 - 6 = 14
sum of spots 2 - 9 = 37
# of 4s = 2
# of 9s = 3
# of 7s = 8
New array with all the 7s removed = [4, 2, 3, 4, 6, 8, 9, 0, 10, 0, 1, 6, 5, 3, 2, 9, 9, 8]
# of 7s = 0
[7, 4, 10, 0, 1, 7, 6, 5, 3, 2, 9, 7]
sum of spots 3 - 6 = 8
sum of spots 2 - 9 = 32
# of 4s = 1
# of 9s = 1
# of 7s = 3
New array with all the 7s removed = [4, 10, 0, 1, 6, 5, 3, 2, 9]
# of 7s = 0

[7, 4, 2, 7, 3, 4, 6, 7, 8, 9, 7, 0, 10, 0, 1, 7, 6, 5, 7, 3, 2, 7, 9, 9, 8, 7]
sum of spots 3 - 16 = 69
sum of spots 2 - 9 = 37
# of 0s = 2
# of 3s = 2
# of 7s = 8
New array with all the 7s removed = [4, 2, 3, 4, 6, 8, 9, 0, 10, 0, 1, 6, 5, 3, 2, 9, 9, 8]
# of 7s = 0
     */
}
