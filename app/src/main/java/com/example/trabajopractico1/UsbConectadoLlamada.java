package com.example.trabajopractico1;

import android.Manifest;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

import androidx.core.app.ActivityCompat;

public class UsbConectadoLlamada extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Llamando al 911", Toast.LENGTH_LONG).show();
        Intent i=new Intent(Intent.ACTION_CALL, Uri.parse("tel:911"));

    }


}
