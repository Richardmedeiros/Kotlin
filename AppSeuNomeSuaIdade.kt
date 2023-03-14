fun main () {

    print ("Por favor digite seu nome:")

    var nome:String = readLine()!!.toString()

    println ("Olá $nome seja bem-vindo!")
    println ("Agora digite sua idade por gentileza:")

    var idade:Int = readLine()!!.toInt()

    println ("Seu nome é $nome e sua idade é $idade.")
}