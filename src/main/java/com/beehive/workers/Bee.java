package com.beehive.workers;

public class Bee {
    public static void main(String[] args) {


        for (int i = 0; i < 5; i++) {

            System.out.println("Worker com.beehive.workers.Bee");
            DoSomeMoreWork dsmw = new DoSomeMoreWork();

            dsmw.off();
        }

        for (int i = 0; i < 5; i++) {

            System.out.println("Worker com.beehive.workers.Bee 2");
            DoSomeMoreWork dsmw = new DoSomeMoreWork();

            dsmw.off();
        }
    }
}
