package com.kingbear.eureka.client.eurekaclient;

/**
 * @Author: xionglei
 * @Date: 2018/11/26 9:20
 */
public class ThreadTest {

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            try {
                Thread.sleep(5000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(112);
        }).start();
        new Thread(() -> {
            try {
                Thread.sleep(5000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(112);
        }).start();
        new Thread(() -> {
            try {
                Thread.sleep(5000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(112);
        }).start();
        int threadCount = Thread.activeCount();
        System.out.println(threadCount);
    }
}
