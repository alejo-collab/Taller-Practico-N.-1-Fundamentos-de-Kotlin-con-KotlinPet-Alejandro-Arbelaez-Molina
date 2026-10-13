package compose.project.aplicacionveterinariaijidea_v2

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform