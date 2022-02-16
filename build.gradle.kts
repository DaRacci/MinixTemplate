import net.minecrell.pluginyml.bukkit.BukkitPluginDescription.PluginLoadOrder

plugins {
    id("dev.racci.minix.kotlin")
    id("dev.racci.minix.copyjar")
    id("dev.racci.minix.purpurmc")
    id("dev.racci.minix.nms") // If you don't use NMS remove this
    id("org.jetbrains.dokka") // If you don't need docs remove this
    kotlin("plugin.serialization")
    id("net.minecrell.plugin-yml.bukkit") version "0.5.1"
}

bukkit {
    name = project.name
    prefix = project.name
    author = "Example"
    version = project.version.toString()
    main = "dev.racci.plugin.Plugin"
    load = PluginLoadOrder.STARTUP
    depend = listOf("Minix")
}

repositories {
    maven("https://oss.sonatype.org/content/repositories/snapshots/") // Adventure snapshot repo
}

dependencies {
    compileOnly(libs.kotlin.stdlib)
    compileOnly(libs.bundles.kyori) // Needed to use the newest version of kyori in Minix
    compileOnly("dev.racci:Minix:1.2.2")
}

tasks.shadowJar {
    relocate("net.kyori.adventure", "dev.racci.minix.libs.adventure") // Needed to use the shaded version in minix
}
