package Classwork.Week_4.Day_2;

public class Bricks {
    public static void main(String[] args) {
        System.out.println(makeBricks(3, 1, 8));
        System.out.println(makeBricks(3, 1, 9));
        System.out.println(makeBricks(3, 2, 10));
        System.out.println();
        System.out.println(makeSecondBricks(3, 1, 8));
        System.out.println(makeSecondBricks(3, 1, 9));
        System.out.println(makeSecondBricks(3, 2, 10));
    }

    public static boolean makeBricks(int small, int big, int goal) {
        int smallBrick = 1;
        int bigBrick = 5;
        for(int i = 0; i <= big; i++) {
            for (int j = 0; j <= small; j++) {
                if (j*smallBrick+i*bigBrick == goal) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean makeSecondBricks(int small, int big, int goal) {
        int smallBrick = 1;
        int bigBrick = 5;
        if (small*smallBrick+big*bigBrick < goal) {
            return false;
        }
        if(goal%bigBrick > small) {
            return false;
        }
        return true;
    }
}
