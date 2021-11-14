package com.kk.java;

public class OverloadTest {

    static abstract class Human {}
    static class Man extends Human {}
    static class Woman extends Human {}

    public void sayHello(Human human) {
        System.out.println("Hello, Human");
    }

    public void sayHello(Man man) {
        System.out.println("Hello, Man");
    }

    public void sayHello(Woman woman) {
        System.out.println("Hello, Woman");
    }

    public static void main(String[] args) {
        Human man = new Man();
        Human woman = new Woman();
        OverloadTest test = new OverloadTest();
        test.sayHello(man);
        test.sayHello(woman);
    }
}
