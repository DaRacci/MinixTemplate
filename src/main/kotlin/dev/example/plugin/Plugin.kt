package dev.example.plugin

import dev.racci.minix.api.extensions.KotlinListener
import dev.racci.minix.api.plugin.MinixPlugin

class Plugin : MinixPlugin(), KotlinListener {

    override val bStatsId = 12084 // Your bStats id

    override suspend fun handleEnable() {
        log.info { "Plugin enabled!" }

        extensions {
            add(::EventService)
        }
    }
}
