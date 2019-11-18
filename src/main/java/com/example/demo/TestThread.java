package com.example.demo;

public class TestThread {
    public static void main(String[] args) throws InterruptedException{
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello world");
            }
        });
        System.out.println("start");
        t.start();
        t.join();
        System.out.println("end");
    }
}
