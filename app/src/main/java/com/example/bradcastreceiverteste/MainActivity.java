package com.example.bradcastreceiverteste;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IntentFilter filter = new IntentFilter();
        filter.addAction("com.exemple.bradcastreceiverteste.MANDAR");
        Receiver receiver = new Receiver();
        registerReceiver(receiver, filter);

        Intent i = new Intent("com.exemple.bradcastreceiverteste.MANDAR");
        sendBroadcast(i);
    }
}
