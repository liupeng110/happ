package com.happ.happ.util.thread.char02;

/**
 * Created by shiqifeng on 2017/1/3.
 * Mail byhieg@gmail.com
 */
public class SonSynTread extends Thread{
    @Override
    public void run() {
        super.run();
        SonSynService son = new SonSynService();
        son.operateISubMethod();
    }
}
