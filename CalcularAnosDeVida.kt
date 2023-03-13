fun main () {

    var anoDeNascimento = 1987
    var anoAtual = 2023
    var resultadoDoCalculo = calcularAnosDeVida(anoDeNascimento, anoAtual)

    imprimirResultados(anoDeNascimento, anoAtual, resultadoDoCalculo)

}

fun calcularAnosDeVida (anoDeNascimento: Int, anoAtual: Int): Int {

    var anosDeVida = anoAtual - anoDeNascimento

    return anosDeVida
}

fun imprimirResultados (anoDeNascimento: Int, anoAtual: Int, resultadoDoCalculo: Int) {

    print ("Este programa calcula sua idade atual:\n")
    print ("Data de Nascimento: $anoDeNascimento\n")
    print ("Ano Atual.........: $anoAtual\n")
    print ("Idade Atual.......: $resultadoDoCalculo Anos de vida.")

}