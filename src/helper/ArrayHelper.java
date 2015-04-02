package helper;

public class ArrayHelper {
    public static int[] createArray(int size) {
        int[] mas = new int[size];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 100);
        }
        return mas;
    }

    public static void fillArray(int[] arr, int range) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * range);
        }
    }

    public static void printArray(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }

    public static void printArrayRec(int[] mas, int i) {
        if (i > mas.length - 1) {
            return;
        }
        System.out.print(mas[i++] + " ");
        printArrayRec(mas, i);
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    public static void swap(int[] array, int i, int j) {
        int c = array[j];
        array[j] = array[i];
        array[i] = c;
    }

    public static int[] shiftRight(int[] arr, int count) {
        for (int i = 0; i < count; i++) {
            int tmp = arr[arr.length - 1];
            System.arraycopy(arr, 0, arr, 1, arr.length - 1);
            arr[0] = tmp;
        }
        return arr;
    }

    public static int[] shiftLeft(int[] arr, int count) {
        for (int i = 0; i < count; i++) {
            int tmp = arr[0];
            System.arraycopy(arr, 1, arr, 0, arr.length - 1);
            arr[arr.length - 1] = tmp;
        }
        return arr;
    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        if (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else return mid;
        }
        return -1;
    }

    public static int recBinarySearch(int[] arr, int target, int start, int end) {
        if (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] > target)
                return recBinarySearch(arr, target, start, mid - 1);
            else if (arr[mid] < target)
                return recBinarySearch(arr, target, start + 1, end);
            else return mid;
        }
        return -1;
    }

    public static int factorial(int value) {
        if(value == 1) {
            return 1;
        }
        while (value > 1) {
            return value*factorial(value-1);
        }
        return 0;
    }
}
