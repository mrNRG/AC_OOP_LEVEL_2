package Homework_2;

public class TestArray {
    public static void main(String[] args) {
        Array arr = new Array();
        int[] arr1 = {1,5,3,11,8,0};
        int[] arr22 = {1,5,3,11,8,0};
        arr.setArray(arr1);
        System.out.println(Array.toString(arr.getIntArray()));
        System.out.println(Array.equals(arr.getIntArray(),arr1));
        System.out.println(arr.minOfIntArray());
        System.out.println(arr.maxOfIntArray());
        arr.bubbleSort();
        arr.enlargeArray(10);
        System.out.println(Array.toString(arr.getIntArray()));
        System.out.println(Array.equals(arr22, arr1));

        Array arr2 = new Array();
        arr2.createIntArray(10,100);
        System.out.println(Array.toString(arr2.getIntArray()));

        Array arr3 = new Array().createDoubleArray(5,10);
        System.out.println(Array.toString(arr3.getDoubleArray()));
        System.out.println(arr3.minOfDoubleArray());
        System.out.println(arr3.maxOfDoubleArray());

    }
}
