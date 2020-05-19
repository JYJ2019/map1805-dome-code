package com.it.code.dome01;

public class Test03 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (j <= i) {
                    System.out.print(j + "*" + i + "=" + (i * j) + " \t");
                }
            }
            System.out.println();
        }
    }
}
