package com.rubypaper;

public class test {
    int x = 1;
    public static void main(String[] args) {

    }

    public void foo() {
        int x = 1;
        bar();
    }

    public void bar() {
        System.out.println(x);
    }
}
