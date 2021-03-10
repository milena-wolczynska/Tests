package playground.junit.firsttest;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class NumberSelector {

    //przekazuję listę [1,2,3,4,5,6,7,8]

    // (list nie było)
    // public List<Integer>  selectOddNumbers(List<Integer> numbers) {
    //przekazuję tablicę, nie listę
    public int[]  selectEvenNumbers
    //(List<Integer> numbers) {
    (int[] numbers){
        if (numbers == null) {
            return new int[]{0};
        }
        int[] evenNumbers = new int[numbers.length];
        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            int numberToCheck = numbers[i];
            if (numberToCheck %2 == 0){
                evenNumbers[index] = numberToCheck;
                index++;

            }
        }

        //pdrzycinam tablicę do ostatnio dodanego elementu
        //Arrays.copyOf(evenNumbers, index);
        //return evenNumbers;
        //lub
        return Arrays.copyOf(evenNumbers,index);


        //na wyjściu mają być l parzyste[2,6,8]
        //5/2-->2,5
        //4/2 -> 2,0  x%2 ==0 --> warunek na l parzystą
        //tworzymy klasę NumberSelectorTest
        //(ctrl+shift+t)
    }
}
