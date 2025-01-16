package net.smileyzone;

// Name
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
    public int[] countInHistogram() {

        int[] rand = createRandomArray();
        int[] array = new int[rand.count]

    }

    //toString method
    public String toString(){
    }

    public static void main(String args[])
    {

    }
}
