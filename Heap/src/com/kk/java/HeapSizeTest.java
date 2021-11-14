package com.kk.java;

/**
 * 1.设置堆空间大小的参数
 * -Xms：用来设置堆空间（新生代+老年代）的初始内存大小
 * -Xmx：用来设置堆空间的最大内存大小
 *
 * 2.默认堆空间大小
 *      初始内存大小：电脑物理内存大小/64
 *      最大内存大小：电脑物理内存大小/4
 *
 * 3.手动设置
 *      -Xms600m -Xmx600m
 *      开发中建议将初始堆内存和最大堆内存设置成相同的值
 *
 * 4.查看设置的参数
 *      -XX:+PrintGCDetails
 */

public class HeapSizeTest {
    public static void main(String[] args) {
        //返回Java虚拟机中初始化堆内存总量
        long initialMemory = Runtime.getRuntime().totalMemory() / 1024 / 1024;
        //返回Java虚拟机中最大堆内存总量
        long maxMemory = Runtime.getRuntime().maxMemory() / 1024 / 1024;

        System.out.println("-Xms : " + initialMemory + "M");
        System.out.println("-Xmx : " + maxMemory + "M");

        //默认堆内存大小下可以查看系统内存大小
//        System.out.println("系统内存大小为：" + initialMemory * 64.0 / 1024 + "G");
//        System.out.println("系统内存大小为：" + maxMemory * 4.0 / 1024 + "G");
    }
}
