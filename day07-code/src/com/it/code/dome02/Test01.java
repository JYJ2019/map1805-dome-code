package com.it.code.dome02;

public class Test01 {
    public static void main(String[] args) {
        System.out.println("编号\t账号\t密码\t姓名\t年龄\t性别\t余额");
        String[][] arrayStr = {
                {"1", "百里半", "111", "李小鹏", "18", "男", "1000"},
                {"2", "002", "123", "曹操", "12", "男", "100000"},
                {"3", "admin", "admin", "是的", "52", "男", "1000000"},
                {"4", "004", "456", "斯蒂芬", "68", "女", "500"},
                {"5", "005", "456", "所发生的", "28", "男", "5000"},
                {"6", "006", "456", "果然翁", "58", "女", "200100"},
        };

        for (int i = 0; i < arrayStr.length; i++) {
            for (int j = 0; j < arrayStr[i].length; j++) {
                if (j == arrayStr[i].length - 1) {
                    System.out.println("\t" + arrayStr[i][j]);
                } else {
                    System.out.print(arrayStr[i][j] + "\t\t");
                }
            }
        }
    }
}
