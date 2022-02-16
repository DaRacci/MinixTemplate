package dev.example.plugin

import dev.racci.minix.api.extension.Extension
import dev.racci.minix.api.extensions.event
import dev.racci.minix.api.extensions.msg
import dev.racci.minix.api.extensions.parse
import org.bukkit.event.player.PlayerJoinEvent

class EventService(override val plugin: Plugin) : Extension<Plugin>() {

    override val name = "Event Service"

    override suspend fun handleEnable() {
        event<PlayerJoinEvent> {
            player.msg("<red>Hello, <yellow>${player.name}!".parse()) // Parses the string with minimessage and sends it to the player, Note you must use msg instead of sendMessage due to the shaded adventure lib
        }
    }
}
