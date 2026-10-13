//Parte 5 Comprender las funciones anónimas (lambdas) y el parámetro implícito it al operar sobre colecciones.

val PreciosBase: List<Int> = listOf(30000,20000,60000)
var RecargoNocturnoLamb: (Int)->Double = {it+it*0.1}


PreciosBase.forEach {
    println("PreciosBase:$it  |   RecargoNocturnoLamb: " + RecargoNocturnoLamb(it))
}


