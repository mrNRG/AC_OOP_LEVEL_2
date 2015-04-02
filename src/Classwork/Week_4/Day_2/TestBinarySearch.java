package Classwork.Week_4.Day_2;

import helper.ArrayHelper;

import java.util.Arrays;

public class TestBinarySearch {
    public static void main(String[] args) {
        int [] arr = new int[10];
        arr[0] = 1;
        arr[1] = 3;
        arr[2] = 5;
        arr[3] = 7;
        arr[4] = 7;
        arr[5] = 7;
        arr[6] = 10;
        arr[7] = 15;
        arr[8] = 21;
        arr[9] = 30;

        System.out.println(Arrays.toString(arr));
//        System.out.println(ArrayHelper.binarySearch(arr,0));
        System.out.println(ArrayHelper.recBinarySearch(arr, 30, 0, 9));
        System.out.println("\n"+ArrayHelper.factorial(-1));



    }
}
