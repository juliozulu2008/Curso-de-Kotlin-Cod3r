package Fundamentos
fun main(args: Array<String>) {
    // Declaração de variáveis
    var idade: Int = 27
    var nome: String = "Julio"
    var altura: Double = 1.75
    var peso: Float // declarando variável sem valor inicial
    peso = 80.5f // atribuindo valor a variável

    // Declaração de constantes
    val pi: Double = 3.1415
    val cidade: String = "São Paulo"

    // Impressão dos valores
    println("Nome: $nome, Idade: $idade, Altura: $altura")
    println("Valor de PI: $pi, Cidade: $cidade")
}