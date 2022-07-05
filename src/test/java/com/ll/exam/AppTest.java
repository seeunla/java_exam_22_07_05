package com.ll.exam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test // 컴퓨터가 읽을 수 있게 해준다.
    public void 더하기() {
        int rs = Calculator.run("10 + 20");
        assertEquals(30,rs);
    }

    @Test // 컴퓨터가 읽을 수 있게 해준다.
    public void 더하기_2() {
        int rs = Calculator.run("20 + 20");
        assertEquals(40,rs);
    }

    @Test // 컴퓨터가 읽을 수 있게 해준다.
    public void 더하기_3() {
        int rs = Calculator.run("10 + 10");

        assertEquals(20,rs);
    }

}
