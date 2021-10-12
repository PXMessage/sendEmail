package com.slry.sendemail;

import android.app.Activity;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.slry.sendemail.util.SendMailUtil;

public class MainActivity extends Activity {
    private Handler mHandler;
    private long tonum=2214978l;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mHandler = new Handler();
    }
    public void btnStop(View view){
        mHandler.removeCallbacksAndMessages(null);
    }
    public void senTextMail(View view) {
      /*  String senTo=tonum+"@qq.com";
        SendMailUtil.send(senTo);*/


        mHandler.post(new Runnable() {
            @Override
            public void run() {
                // TODO Auto-generated method stub
                mHandler.postDelayed(this, 3000);
//                tonum=tonum+1;
                String senTo=tonum+"@qq.com";
                Log.e("发送到了:",senTo);
                SendMailUtil.send(senTo);
            }
        });
    }

   /* @Override
    protected void onDestroy() {
        super.onDestroy();
        mHandler.removeCallbacksAndMessages(null);
    }*/
}
