package com.example.prep1.atomicVariables;

public class Atomic1 {


    public static void main(String[] args){

    }
}



class Counter extends Thread {

    // Counter Variable
    int count = 0;

    // method which would be called upon
    // the start of execution of a thread
    public void run()
    {
        int max = 1_000_00_000;

        // incrementing counter
        // total of max times
        for (int i = 0; i < max; i++) {
            count++;
        }
    }
}



