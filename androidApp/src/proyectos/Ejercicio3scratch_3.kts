var NombresMascotas=listOf("firulais","leopoldo","jose luis arcangel","Blanquito")
var i:Int=1;
for(nombre in NombresMascotas){
    println("Turno $i : $nombre")
    i++
}

println("\n--- APERTURA DE LA CLÍNICA ---")
for (minutosRestantes in 5 downTo 1) {
    println("Faltan $minutosRestantes minutos para la apertura...")
}
println("¡La clínica veterinaria está abierta!")