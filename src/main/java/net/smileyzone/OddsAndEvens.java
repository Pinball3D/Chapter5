package net.smileyzone;

// Andrew Smiley
// Program 31
import java.util.Arrays;
import java.util.Random;

public class OddsAndEvens{
    public static int[] getAllEvens(int[] array){
        int count = 0;
        for(int i : array) {
            if(i % 2 == 0) {
                count++;
            }
        }
        int[] arr = new int[count];
        count = 0;
        for(int i : array) {
            if(i % 2 == 0 && count < arr.length) {
                arr[count] = i;
                count++;
            }
        }
        return arr;
    }

    public static int[] getAllOdds(int[] array){
        int count = 0;
        for(int i : array) {
            if(i % 2 == 1) {
                count++;
            }
        }
        int[] arr = new int[count];
        count = 0;
        for(int i : array) {
            if(i % 2 == 1 && count < arr.length) {
                arr[count] = i;
                count++;
            }
        }
        return arr;
    }
    public static int[] createRandomArray(){
        int[] array = new int[new Random().nextInt(20)+1];
        for(int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(101);//random value
        }
        return array;
    }
    public String toString(){
        int[] rand = createRandomArray();
        return "This is the randomly generated array" + Arrays.toString(rand) + "\n" +
        "All the odds from the array are: " + Arrays.toString(getAllOdds(rand))  + "\n" +
        "All the Evens from the array are: " + Arrays.toString(getAllEvens(rand));//to string
    }
    public static void main( String args[] )
    {
        OddsAndEvens test = new OddsAndEvens();
        System.out.println(test);
        System.out.println(test);
        System.out.println(test);//test case 3
    }
    /*
    OUTPUT
This is the randomly generated array[32, 34, 53, 0, 57, 89, 60, 5, 90, 67, 63, 86, 3, 60, 70, 42, 57, 12, 87]
All the odds from the array are: [53, 57, 89, 5, 67, 63, 3, 57, 87]
All the Evens from the array are: [32, 34, 0, 60, 90, 86, 60, 70, 42, 12]
This is the randomly generated array[23, 14, 94, 57, 56, 40, 58, 26, 58, 54, 82, 79, 67, 90, 79, 5, 22, 90, 37, 87]
All the odds from the array are: [23, 57, 79, 67, 79, 5, 37, 87]
All the Evens from the array are: [14, 94, 56, 40, 58, 26, 58, 54, 82, 90, 22, 90]
This is the randomly generated array[89, 30, 66, 28, 51, 53, 47, 87, 91, 73, 43, 72, 21, 39, 12, 67, 43, 47]
All the odds from the array are: [89, 51, 53, 47, 87, 91, 73, 43, 21, 39, 67, 43, 47]
All the Evens from the array are: [30, 66, 28, 72, 12]
     */
}
