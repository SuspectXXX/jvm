package com.kk.java;

/**
 * 1.配置新生代和老年代在堆结构的占比
 *      -XX:NewRatio=2表示新生代占1，老年代占2，新生代占整个堆的1/3，默认这个比例
 *      这个参数开发中一般不会调整
 * 2.配置新生代中Eden区和Survivor区的占比
 *      -XX:SurvivorRatio=8表示Eden区占8，Survivor0区占1，Survivor1区占1，默认这个比例，但实际看的时候，是6:1:1，要想是8:1:1需要显示设置
 *      -XX:-UseAdaptiveSizePolicy不使用自适应的内存分配策略（暂时用不到）
 * 3.设置新生代内存大小
 *      -Xmn100m设置新生代内存大小为100m，优先级高于-XX:NewRatio
 */

public class YoungOldTest {

    public static void main(String[] args) {
        System.out.println("YoungOldTest");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
