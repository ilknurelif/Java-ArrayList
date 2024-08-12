package week09;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {
    public static void main(String[] args) {
        int[] numsArr = new int[3];
        numsArr[0] = 44;
        numsArr[1] = 33;
        numsArr[2] = 88;
        //1) Array is fixed size:
       // numsArr[3] = 99; ArrayIndexOutOfBoundsException

        //1) ArrayList is dynamic size:
        ArrayList<Integer> numsList = new ArrayList<>();
        numsList.add(44);
        numsList.add(653);
        numsList.add(34);
        numsList.add(234);

        //2) Array can hold both primitives and objects
        char[] charsArr = {'a','b','c'};
        Character[] charsArr2 = {'a','b','c'};
        String[] strArr = {"a","b","c"};

        //2) ArrayList and other classes in Collections Framework can only hold object types
        //we need to use Wrapper classes
        //ArrayList<char> charsList; error
        ArrayList<Character> charsList = new ArrayList<>();

        charsList.add('a'); //internally array is set to size 10(default capacity)
        charsList.add('b'); charsList.add('c'); charsList.add('d');

        //Printing array returns hashcode
        System.out.println(strArr);
        System.out.println(Arrays.toString(strArr));
        //printing arraylist returns values
        System.out.println(charsList);
    }
}
