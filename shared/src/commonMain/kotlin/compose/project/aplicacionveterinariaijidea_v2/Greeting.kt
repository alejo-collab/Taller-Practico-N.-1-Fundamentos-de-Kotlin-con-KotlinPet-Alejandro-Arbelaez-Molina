package compose.project.aplicacionveterinariaijidea_v2

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return sayHello(platform.name)
    }
}