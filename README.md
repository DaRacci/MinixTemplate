Minix plugin template

A simple example plugin for Minix.

To get started:

    Create a new repository from this template
    Change the project name in settings.gradle.kts
    Change the group and pluginPath / CopyJar in gradle.properties
    Move the example plugin to a package in your own namespace
    Update project plugin information in build.gradle.kts

Next steps:

To build a plugin, simply run `./gradlew build`.

To auto version, simply run `cog bump -a` (Requires [cocogitto](https://github.com/cocogitto/cocogitto) to be installed)
