package ca.antonious.potato.core

actual fun getRegistry(): DependencyRegistry = IOSDependencies

object IOSDependencies : DependencyRegistry {
    override fun getLogger(): Logger {
        return IOSLogger()
    }
}