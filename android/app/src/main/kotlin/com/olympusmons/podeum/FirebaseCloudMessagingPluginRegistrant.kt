package com.olympusmons.podeum

import io.flutter.plugin.common.PluginRegistry
import io.flutter.plugins.GeneratedPluginRegistrant

object FirebaseCloudMessagingPluginRegistrant {
	fun registerWith(registry: PluginRegistry) {
		if (alreadyRegisteredWith(registry)) {
			return
		}
//        GeneratedPluginRegistrant.registerWith(registry.registrarFor("io.flutter.plugins.firebasemessaging.FirebaseMessagingPlugin"))
	}

	private fun alreadyRegisteredWith(registry: PluginRegistry): Boolean {
		val key: String = FirebaseCloudMessagingPluginRegistrant::class.java.canonicalName
		if (registry.hasPlugin(key)) {
			return true
		}
		registry.registrarFor(key)
		return false
	}
}