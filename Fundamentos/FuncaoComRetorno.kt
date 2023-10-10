package Fundamentos

// Função com retorno
fun soma(a: Int, b: Int): Int {
    return a + b
}

// Função recursiva
fun fatorial(n: Int): Int {
    return if (n == 0) {
        1
    } else {
        n * fatorial(n - 1)
    }
}


fun main(args: Array<String>) {
    println(soma(2, 3))

    // Função com retorno Unit (void)
    println(fatorial(5))
}