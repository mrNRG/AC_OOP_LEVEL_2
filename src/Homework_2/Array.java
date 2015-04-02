package Homework_2;

public class Array {
    private int intArray[];
    private double doubleArray[];

    public int[] getIntArray() {
        return intArray;
    }

    public double[] getDoubleArray() {
        return doubleArray;
    }

    public void setArray(int[] array) {
        this.intArray = array;
    }

    public void setArray(double[] array) {
        this.doubleArray = array;
    }

    public Array createIntArray(int arraySize, int range) {
        intArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            intArray[i] = (int) (Math.random() * range);
        }
        return this;
    }

    public Array createDoubleArray(int arraySize, int range) {
        doubleArray = new double[arraySize];
        for (int i = 0; i < arraySize; i++) {
            doubleArray[i] = (Math.random() * range);
        }
        return this;
    }

    public int minOfIntArray() {
        int min = this.getIntArray()[0];
        for (int i = 0; i < this.getIntArray().length; i++) {
            if (this.getIntArray()[i] < min) {
                min = this.getIntArray()[i];
            }
        }
        return min;
    }

    public double minOfDoubleArray() {
        double min = this.getDoubleArray()[0];
        for (int i = 0; i < this.getDoubleArray().length; i++) {
            if (this.getDoubleArray()[i] < min) {
                min = this.getDoubleArray()[i];
            }
        }
        return min;
    }

    public int maxOfIntArray() {
        int max = this.getIntArray()[0];
        for (int i = 0; i < this.getIntArray().length; i++) {
            if (this.getIntArray()[i] > max) {
                max = this.getIntArray()[i];
            }
        }
        return max;
    }

    public double maxOfDoubleArray() {
        double max = this.getDoubleArray()[0];
        for (int i = 0; i < this.getDoubleArray().length; i++) {
            if (this.getDoubleArray()[i] > max) {
                max = this.getDoubleArray()[i];
            }
        }
        return max;
    }

    public Array enlargeArray(int newSizeArray) {
        if (newSizeArray > this.getIntArray().length) {
            int[] tmp = new int[newSizeArray];
            for (int i = 0; i < this.getIntArray().length; i++) {
                tmp[i] = this.getIntArray()[i];
            }
            this.setArray(tmp);
        }
        return this;
    }

    public void bubbleSort() {
        for (int i = 0; i < this.getIntArray().length - 1; i++) {
            for (int j = 0; j < this.getIntArray().length - 1 - i; j++) {
                if (this.getIntArray()[j] > this.getIntArray()[j + 1]) {
                    swap(this.getIntArray(), j, j + 1);
                }
            }
        }
    }

    private void swap(int[] array, int i, int j) {
        int c = array[j];
        array[j] = array[i];
        array[i] = c;
    }

    public static String toString(int[] array) {
        if (array == null)
            return "null";
        int iMax = array.length - 1;
        if (iMax == -1)
            return "{}";

        StringBuilder sb = new StringBuilder();
        sb.append('{');
        for (int i = 0; ; i++) {
            sb.append(array[i]);
            if (i == iMax)
                return sb.append('}').toString();
            sb.append(" ");
        }
    }

    public static String toString(double[] array) {
        if (array == null)
            return "null";
        int iMax = array.length - 1;
        if (iMax == -1)
            return "{}";

        StringBuilder sb = new StringBuilder();
        sb.append('{');
        for (int i = 0; ; i++) {
            sb.append(array[i]);
            if (i == iMax)
                return sb.append('}').toString();
            sb.append(" ");
        }
    }

    public static boolean equals(int[] a1, int[] a2) {
        if (a1 == a2)
            return true;
        if (a1 == null || a2==null)
            return false;
        int length = a1.length;
        if (a2.length != length)
            return false;

        for (int i = 0; i < length; i++) {
            Object e1 = a1[i];
            Object e2 = a2[i];

            if (e1 == e2)
                continue;
            if (e1 == null)
                return false;
        }
        return true;
    }


}
