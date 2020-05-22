package com.it.code.dome02;

import java.util.Scanner;

/*
写错了
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arrayName = new String[3];

        double[][] arrayScore = new double[3][8];

        for (int i = 0; i < arrayScore.length; i++) {
            System.out.println("请输入第" + (i + 1) + "位同学的名字");
            arrayName[i] = scanner.next();
            System.out.println("请输入" + arrayName[i] + "同学的成绩");
            for (int j = 0; j < arrayScore[i].length; j++) {
                arrayScore[i][j] = scanner.nextDouble();
            }
        }

        double sum = 0.0;
        for (int i = 0; i < arrayScore.length; i++) {
            double arrayTemp = 0.0;
            double temp = 0.0;
            arrayTemp = arrayScore[0][i];
            temp = arrayTemp;
            for (int j = 0; j < arrayScore[i].length; j++) {
                if (arrayTemp > arrayScore[i][j]) {
                    arrayTemp = arrayScore[i][j];
                }
                if (temp < arrayScore[i][j]) {
                    temp = arrayScore[i][j];
                }
                sum += arrayScore[i][j];
            }
            System.out.println(arrayName[i] + "\t" + "最小值:" + arrayTemp + "\t最大值:" + temp + "\t总和:" + ((sum - arrayTemp - temp) / (arrayScore[i].length - 1)));
        }
    }
}
