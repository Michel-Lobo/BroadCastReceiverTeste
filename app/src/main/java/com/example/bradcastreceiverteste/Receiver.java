package com.example.bradcastreceiverteste;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class Receiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast t = Toast.makeText(context, "Recebido", Toast.LENGTH_LONG);
        t.show();
        Log.i("Receiver", "Recebido");
    }
}
