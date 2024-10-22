package org.example

import org.example.multiplicarAtaques

fun multiplicarAtaques(ataque: Int): Int {
    var ataqueMultiplicado: Int
    ataqueMultiplicado = ataque * 5
    ataqueMultiplicado = ataque * 3
    return ataqueMultiplicado
}

fun batallaDañoCritico(golpe: Int): Int {

    return if (golpe > 50) golpe * 2 else (golpe)

}

fun main() {
    var option: Int

    do {
        println("Menu:")
        println("1. Ejercicio 1")
        println("2. Ejercicio 2")
        println("3. Ejercicio 3")
        println("4. Ejercicio 4")
        println("5. Ejercicio 5")
        println("6. Ejercicio 6")
        println("7. Ejercicio 7")
        println("8. Ejercicio 8")
        println("9. Ejercicio 9")
        println("10. Ejercicio 10")
        println("11. Salir")
        print("Elige una opción: ")

        option = readLine()?.toIntOrNull() ?: 0

        when (option) {
            1 -> println("Hola mundo..")
            2 -> {
                var vida: Int = 100
                println("La vida del personaje es $vida")
            }
            3 -> {
                println("Introduce 1 un numero:")
                var numero: Int = readLine()?.toInt() ?: 0
                var resultado: Int = multiplicarAtaques(numero)
                println("Resultado: $resultado")
            }
            4 -> {
                println("Recogiendo moneditas ....")
                for (i in 0 until 10) {
                    println("Recogiendo ${i} monedas")
                }
            }
            5 -> {
                var nivel: Int
                println("Introduce el nivel del personaje:")
                nivel = readLine()?.toInt() ?: 0
                if (nivel < 10) {
                    println("Principiante")
                } else if (nivel in 11..20) {
                    println("Personaje intermedio")
                } else {
                    println("Personaje Avanzado")
                }
            }
            6 -> {
                var golpe: Int
                println("Introduce el daño que quieres mostrar")
                golpe = readLine()?.toInt() ?: 0
                var resultdo = batallaDañoCritico(golpe)
                if (resultdo > 50) {
                    println("Golpe Critico")
                } else {
                    println("Daño normal")
                }
            }
            7 -> {
                var nombre1 = "luis"
                var vida1: Int
                var ataque1 = 100

                var nombre2 = "pepe"
                var vida2: Int
                var ataque2 = 100

                println("Introduce vida del 1er personaje")
                vida1 = readLine()?.toInt() ?: 0

                println("Introduce vida del 2do personaje")
                vida2 = readLine()?.toInt() ?: 0
                while (vida1 != 0 && vida2 != 0) {
                    vida2 -= ataque1
                    println("$nombre1 ataca a $nombre2 y le queda ${vida2} de vida.")
                    if (vida2 <= 0) {
                        println("$nombre1 ha ganado!")
                        break
                    }
                    vida1 -= ataque2
                    println("$nombre2 ataca a $nombre1 y le queda ${vida1} de vida.")
                    if (vida1 <= 0) {
                        println("$nombre2 ha ganado!")
                    }
                }
            }
            8 -> {
                var inventario = mutableListOf<String>()
                var decision = 0
                while (decision != 4) {
                    println("Que quieres hacer??\n[1]Añadir\n[2]Eliminar\n[3]Mostrar\n[4]Salir")
                    decision = readLine()?.toInt() ?: 0
                    when (decision) {
                        1 -> {
                            println("Elemento a introducir")
                            val objeto: String = readLine() ?: "".trim()
                            inventario.add(objeto)
                        }
                        2 -> {
                            println("Elemento a borrar")
                            val objeto: String = readLine() ?: "".trim()
                            inventario.remove(objeto)
                        }
                        3 -> {
                            println("Lista de objetos")
                            println(inventario)
                        }
                        4 -> println("Saliendo...")
                        else -> println("Opción no válida, por favor elige de nuevo.")
                    }
                }
            }
            9 -> {
                var experiencia = 0
                var nivelJugador = 1
                while (true) {
                    println("Thor ha ganado la batalla, aumenta la experiencia 50")
                    experiencia += 50
                    println("Experiencia: $experiencia")
                    if (experiencia >= 200) {
                        nivelJugador += 1
                        experiencia -= 200
                        println("Sube de nivel: $nivelJugador")
                    }
                    println("Quieres seguir jugando? [s/n]")
                    var respuesta = readLine() ?: ""
                    if (respuesta == "n") {
                        break
                    }
                }
            }
            10 -> {
                val enemigoVidaInicial = 500
                var enemigoVida = enemigoVidaInicial
                val danoEquipo = listOf(30, 40, 50, 60, 70)
                while (enemigoVida > 0) {
                    println("El enemigo tiene $enemigoVida de vida")
                    enemigoVida -= danoEquipo.random()
                    println("El enemigo ha recibido un golpe ${danoEquipo.random()} de daño")
                }
                println("El enemigo ha sido derrotado")
            }
            11 -> println("Saliendo del menú...")
            else -> println("Opción no válida, por favor elige de nuevo.")
        }
    } while (option != 11)
}