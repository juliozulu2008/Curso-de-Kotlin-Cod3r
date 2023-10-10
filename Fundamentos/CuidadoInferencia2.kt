package Fundamentos

fun main(args: Array<String>) {
    var a = 1
    var b = 2
    a = 2.3 // erro de compilação pois a é Int

    println(a + b) //nao pode misturar tipos diferentes
}