//Parte 2

var esUrgencia: Boolean = false
var Edad : Int = 10

val ClasificacionPerro: String=when(Edad){
    in 0..1 -> "Cachorro"
    in 2..7 -> "Adulto"
    in 8..Int.MAX_VALUE -> "Senior"
    else -> "Edad no valida"
}

if(esUrgencia || ClasificacionPerro=="Senior"){
    println("PRIORIDAD ALTA")
}else{
    println("Atencion Regular")
}