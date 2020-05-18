package com.it.code.dome01;

import java.util.Scanner;

/*
3.	循环输入有5个元素的整型数组，
求出数组中的最大值和最小值。（20分）
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        int num = array[0];
        for (int i = 0; i < array.length; i++) {
            if (num < array[i] ) {
                num = array[i];
            }
        }
        System.out.println(num);

    }
}
