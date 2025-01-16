package net.smileyzone;

// Andrew Smiley
// Program 32

import java.util.Arrays;
import java.util.Random;
public class Histogram{
    //add and int[] array instance variable

    public int[] createRandomArray(){
        int[] array = new int[new Random().nextInt(20)];
        for(int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(10);//random value
        }
        return array;
    }
    public int[] countInHistogram(int[] rand) {


        int[] array = new int[10];
        for(int i = 0; i < rand.length; i++) {
            for(int k : rand) {
                if(k == i) {
                    array[i]++;//count up
                }
            }
        }
        return array;//return histogram array
    }

    //toString method
    public String toString(){
        int[] rand = createRandomArray();
        return "The randomly sized and filled array is: "+ Arrays.toString(rand) +"\n"+
        "The newly generated array indicating how many of each value 0-9 stored within the respective index:" + "\n" + Arrays.toString(countInHistogram(rand));


    }

    public static void main(String args[])
    {
        System.out.println(new Histogram());
        System.out.println(new Histogram());
        System.out.println(new Histogram());
    }
    /* OUTPUT
    The randomly sized and filled array is: [3, 4, 9, 6, 1, 9, 4, 6, 4, 3, 6, 4, 9]
The newly generated array indicating how many of each value 0-9 stored within the respective index:
[0, 1, 0, 2, 4, 0, 3, 0, 0, 3]
The randomly sized and filled array is: [3, 1]
The newly generated array indicating how many of each value 0-9 stored within the respective index:
[0, 1, 0, 0, 0, 0, 0, 0, 0, 0]
The randomly sized and filled array is: []
The newly generated array indicating how many of each value 0-9 stored within the respective index:
[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
     */
}
