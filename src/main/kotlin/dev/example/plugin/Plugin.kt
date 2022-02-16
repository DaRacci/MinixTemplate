package dev.example.plugin

import dev.racci.minix.api.extensions.KotlinListener
import dev.racci.minix.api.extensions.event
import dev.racci.minix.api.extensions.msg
import dev.racci.minix.api.extensions.parse
import dev.racci.minix.api.plugin.MinixPlugin
import org.bukkit.event.player.PlayerJoinEvent

class Plugin : MinixPlugin(), KotlinListener {

    override val bStatsId = 12084 // Your bStats id

    override suspend fun handleEnable() {
        log.info { "Plugin enabled!" }

        event<PlayerJoinEvent>(this) {
            player.msg("<red>Hello, <yellow>${player.name}!".parse()) // Parses the string with minimessage and sends it to the player, Note you must use msg instead of sendMessage due to the shaded adventure lib
        }
    }
}
