package org.rd.lessons.lesson8;


public class MultiDimensionArray1 {
    public MultiDimensionArray1() {
    }

    public static void main(String[] args) {
        int[][] matris = new int[3][3];
        matris[0][0] = 1;
        matris[0][1] = 2;
        matris[0][2] = 3;
        matris[1][0] = 4;
        matris[1][1] = 5;
        matris[1][2] = 6;
        matris[2][0] = 7;
        matris[2][1] = 8;
        matris[2][2] = 9;

        for (int satir = 0; satir < matris.length; ++satir) {
            for (int sutun = 0; sutun < matris[satir].length; ++sutun) {
                System.out.print(matris[satir][sutun] + "   ");
            }

            System.out.println();
        }

    }
}
