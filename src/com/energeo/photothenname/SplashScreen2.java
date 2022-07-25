package com.energeo.photothenname;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;

public class SplashScreen2 extends  Activity {

    private Thread mSplashThread;

 

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.splash_screen2);

        final SplashScreen2 SPlashScreen2 = this;

 

            mSplashThread =  new Thread(){

            @Override

            public void run(){

                try {

                    synchronized(this){

 

                        wait(7000);

                    }

                }

                catch(InterruptedException ex){

                }

 

                finish();

 

                Intent intent = new Intent();

                intent.setClass(SPlashScreen2, Chimp.class);

                startActivity(intent);

 

            }

        };

 

        mSplashThread.start();

    }

 

 

    @Override

 

    public boolean onTouchEvent(MotionEvent evt)

    {

        if(evt.getAction() == MotionEvent.ACTION_DOWN)

        {

            synchronized(mSplashThread){

                mSplashThread.notifyAll();

            }

        }

        return true;

    }

}