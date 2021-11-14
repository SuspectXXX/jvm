package com.kk.java;

public class OverrideTest {

    static abstract class Human {
        public abstract void sayHello();
    }

    static class Man extends Human {
        @Override
        public void sayHello() {
            System.out.println("Man say hello");
        }
    }

    static class Woman extends Human {
        @Override
        public void sayHello() {
            System.out.println("Woman say hello");
        }
    }

    public static void main(String[] args) {
        Human man = new Man();
        Human woman = new Woman();
        man.sayHello();
        woman.sayHello();
        man = new Woman();
        man.sayHello();
    }

}
