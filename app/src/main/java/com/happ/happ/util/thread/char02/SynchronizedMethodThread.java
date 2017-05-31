package com.happ.happ.util.thread.char02;


/**
 * Created by byhieg on 17/1/1.
 * Mail to byhieg@gmail.com
 */
public class SynchronizedMethodThread extends Thread{

    private MyObject object;

    public SynchronizedMethodThread(MyObject object){
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        if(Thread.currentThread().getName().equals("A")){
            object.methodA();
        }else{
            object.methodB();
        }
    }
}
