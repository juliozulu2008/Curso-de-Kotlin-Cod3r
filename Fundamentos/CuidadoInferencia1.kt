package Fundamentos

fun main(args: Array<String>) {
    var a // nesse caso tinha que ser declarado como Int ou Double
    var b = 2

    a = 10
    println(a + b) // erro de compilação pois a não foi inicializada
}