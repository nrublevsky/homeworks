package com.company;

import java.util.Arrays;

   /* static int[][] arr = {{1, 2, 3, 4},
                            {5, 6, 7, 8},
                            {9, 10, 11, 12},
                            {13, 14, 15, 16}};

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(arr));
        for (int i = 1; i < arr.length; i++) {
            int temp=arr[0][i];
            arr [0][i]=arr[i][i];
            arr[i][i]=temp;
        }
        System.out.println(Arrays.deepToString(arr));
    }*/




class TwoDAgain{
    public static void main(String[] args) {
        int twoD[][]=new int [4][];
        twoD[0]=new int[1];
        twoD[1]=new int[2];
        twoD[2]=new int[3];
        twoD[3]=new int[4];

        int i,j,k =0;

        for (i = 0; i < 4; i++)
            for ( j = 0; j <i+1 ; j++) {
             twoD[i][j]=k;
             k++;
            }
        for (i = 0; i < 4; i++){
            for (j = 0; j <i+1 ; j++)
                System.out.print(twoD[i][j]+ " ");
            System.out.println();
        }
    }
}