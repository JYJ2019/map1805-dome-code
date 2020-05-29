package com.it.code.demo01;

import java.util.Arrays;

/*
编写带数组参数的paiXu(int arr[])方法实现排序
测试时给定数组
 */
public class Test01 {
    public static void main(String[] args) {
        System.out.println("给定数组为:");
        int[] array = {77, 88, 45, 99, 46, 76, 80};
        print(array);
        paiXu(array);
    }

    public static void paiXu(int[] array) {
        System.out.println("排序结果");
        Arrays.sort(array);
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + "\t");
        }
    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i]);
            } else {
                System.out.print(array[i] + "\t");
            }
        }
    }
}
