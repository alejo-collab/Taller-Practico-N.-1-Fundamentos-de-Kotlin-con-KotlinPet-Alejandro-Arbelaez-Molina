//Parte4 Evitar errores de puntero nulo (NullPointerException) mediante tipos nulables, llamadas seguras y valores por defecto.

var contactoEmergencia: String? = "321668"

println(contactoEmergencia?.length)

var contactoFinal: String? = null
println("Contacto Final: "+ (contactoFinal ?: "Sin contacto"))



