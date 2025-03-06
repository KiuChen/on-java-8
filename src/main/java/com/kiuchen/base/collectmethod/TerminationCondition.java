package com.kiuchen.base.collectmethod;



public class TerminationCondition {
    public static void main(String[] args) throws InterruptedException {
        Book nova = new Book(true);
        nova.checkIn();
        // 因为这里对象新建的，并未确认，无法收集
        new Book(true);
//        new Book(true).checkIn() 这里因为主动确认，会收集;


        System.gc();

        Thread.sleep(1);
    }
}
