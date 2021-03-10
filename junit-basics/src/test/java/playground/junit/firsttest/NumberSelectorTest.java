package playground.junit.firsttest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NumberSelectorTest {

    @Test
    @DisplayName("When given array is passed to NumberSelector" +
            "then method selectEvenNumbers should return new array with"+
            "even elements")
    //happy path
    void test(){
        //given
        NumberSelector selector = new NumberSelector();
        int[] numbersToCheck = {1,2,3,4,5,6,7,8,9};
        int[] expectedResult = {2,4,6,8};
        //when
        int[] result = selector.selectEvenNumbers(numbersToCheck);
        //then
        //sprawdzam czy dwie tablice są takie same
        System.out.println(Arrays.toString(result));
        Assertions.assertArrayEquals(expectedResult,result);

    }

    @Test
    @DisplayName("When given array is passed to NumberSelector" +
            "then method selectEvenNumbers should return new array with"+
            "even elements")
    void test1(){
        //given
        NumberSelector selector = new NumberSelector();
        int[] numbersToCheck = null;
        int[] expectedResult = {0};
        //when
        int[] result = selector.selectEvenNumbers(numbersToCheck);
        //then
        //sprawdzam czy dwie tablice są takie same
        System.out.println(Arrays.toString(result));
        Assertions.assertArrayEquals(expectedResult,result);

    }

}