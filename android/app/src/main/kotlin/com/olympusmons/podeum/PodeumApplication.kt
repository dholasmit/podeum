package com.olympusmons.podeum
import com.flutter.invitereferrals.InviteReferralsPlugin;

import android.content.Context
import android.util.Log
import androidx.multidex.MultiDex
import io.flutter.app.FlutterApplication
import io.flutter.plugin.common.PluginRegistry
import io.flutter.plugin.common.PluginRegistry.PluginRegistrantCallback
import io.flutter.plugins.GeneratedPluginRegistrant
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundService

class PodeumApplication : FlutterApplication(), PluginRegistrantCallback {

    override fun onCreate() {
        InviteReferralsPlugin.register(this);
        super.onCreate()
    }

    override fun registerWith(registry: PluginRegistry) {
        //registry?.registrarFor("io.flutter.plugins.firebasemessaging.FirebaseMessagingPlugin")
        FirebaseCloudMessagingPluginRegistrant.registerWith(registry);
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }
}
