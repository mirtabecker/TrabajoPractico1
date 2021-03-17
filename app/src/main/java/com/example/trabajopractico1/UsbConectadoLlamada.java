package com.example.trabajopractico1;

import android.Manifest;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.widget.Toast;

import androidx.core.app.ActivityCompat;

import java.net.URI;

public class UsbConectadoLlamada extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        boolean conectado = intent.getExtras().getBoolean("connected");

        if (conectado) {
           Toast.makeText(context, "Llamando", Toast.LENGTH_LONG).show();

        Intent i = new Intent(Intent.ACTION_CALL, Uri.parse("tel:12345"));
        context.startActivity(i);
        } else
            {Toast.makeText(context, "No se puede llamar", Toast.LENGTH_LONG).show();}
    }
}


