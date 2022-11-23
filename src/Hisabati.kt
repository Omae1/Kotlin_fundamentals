class Hisabati {
    //Data Members
    var num1:Int= 7
    var num2:Int= 9

    //member function
    fun calculate():Int{
        return num1* num2
    }
}

fun main(args: Array<String>) {
    val obj=Hisabati()
    println("the product of 9 and 7 is ${obj.calculate()}")
}