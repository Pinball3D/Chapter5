package net.smileyzone;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListFunHouse{
    public static ArrayList<Integer> getListOfFactors(int number){
        ArrayList<Integer> factors = new ArrayList<Integer>();
        for(int i = 2; i < number; i++) {
            if(number % i == 0) {
                factors.add(i);//add the factor
            }
        }
        return factors;
    }

    public static void keepOnlyCompositeNumbers( ArrayList<Integer> nums ){
        for(int i = 0; i < nums.size(); i++) {
            if(getListOfFactors(nums.get(i)).size() == 0) {
                nums.remove(i);
            }
        }
    }

    public static void main( String args[] ){

//show me 5 test cases -
// number under 10, number under 25, number over 100, number over 500
        System.out.println(getListOfFactors(2));
        System.out.println(getListOfFactors(14));
        System.out.println(getListOfFactors(137));
        System.out.println(getListOfFactors(550));

//use the following array to test keepOnlyCompositeNumbers
//be sure to show the before and after running keepOnlyCompositeNumbers

        Integer[] nums = {2,6,8,9,10,12,13,15,17,24,55,66,78,77,79};
        ArrayList<Integer> numsList = new ArrayList<Integer>(Arrays.asList(nums));

        System.out.println(numsList);
        keepOnlyCompositeNumbers(numsList);
        System.out.println(numsList);
// hint you may have to turn the array into an arrayList

    }
    /*
    OUTPUT
    []
    [2, 7]
    []
    [2, 5, 10, 11, 22, 25, 50, 55, 110, 275]
    [2, 6, 8, 9, 10, 12, 13, 15, 17, 24, 55, 66, 78, 77, 79]
    [6, 8, 9, 10, 12, 15, 24, 55, 66, 78, 77]

    */
}
