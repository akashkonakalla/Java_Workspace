package com.threads.task_14_11_2026;

class RedSignal extends Thread {
    public void run() {
        try {
            System.out.println("RED - STOP");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class YellowSignal extends Thread {
    public void run() {
        try {
            System.out.println("YELLOW - WAIT");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class GreenSignal extends Thread {
    public void run() {
        try {
            System.out.println("GREEN - GO");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class TrafficThreads3 {
    public static void main(String[] args) throws InterruptedException {

        RedSignal red = new RedSignal();
        YellowSignal yellow = new YellowSignal();
        GreenSignal green = new GreenSignal();

        red.start();
        red.join();

        yellow.start();
        yellow.join();

        green.start();
        green.join();
    }
}