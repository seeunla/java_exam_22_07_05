package com.ll.exam;

public class Calculator {
    public static int run(String s) {
        String[] sBits = s.split(" \\+ ");
        int no1 = Integer.parseInt(sBits[0]); // '1'
        int no2 = Integer.parseInt(sBits[1]);
        return no1 + no2;
    }
}
