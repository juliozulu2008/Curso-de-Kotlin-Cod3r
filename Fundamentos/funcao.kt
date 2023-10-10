package Fundamentos

fun soma(a: Int, b: Int): Int {
    return a + b
}


fun imprimeSoma(a: Int, b: Int) {
    println(a + b)
}


fun main(args: Array<String>) {
    println(soma(2, 3))
    imprimeSoma(4, 5)
}

