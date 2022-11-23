class fruits {
    //data member
    var price= 0
    var nameFruit=""
    var color=""
}

fun main(args: Array<String>) {
    //create an object
    val myObject= fruits()
    myObject.price=23
    myObject.nameFruit="banana"
    myObject.color="Yellow"

    println("my favorite fruit is ${myObject.nameFruit} which is  ${myObject.color} in color")
}