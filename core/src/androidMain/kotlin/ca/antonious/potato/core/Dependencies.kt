package ca.antonious.potato.core

actual fun getRegistry(): DependencyRegistry = AndroidDependencyRegistry

object AndroidDependencyRegistry : DependencyRegistry {
    override fun getLogger(): Logger {
        return AndroidLogger()
    }
}