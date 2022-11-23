fun hesabu(){
    var num1= 48
    var num2 = 7
    println("the sum of $num1 and $num2 is " + (num1+ num2))
}
fun myname(){
    var name= "willys Omae"

    println(" my name is $name")
}
/*fun main(args: Array<String>) {

    myname()
    myName("willys", "Omae", 27)

}
//functions with parameters
fun myName(fName:String, lName: String, Age:Int){
    println("My name is " + fName + " " + lName + " " + "and i am " + Age)
}*/
//recursion function
fun fact(num:Int):Int{
    return if (num==2){
        num

    }else{
        num*fact(num-2)
    }
}
fun main(args: Array<String>) {
    println("enter number ")
    var num0:Int=Integer.valueOf(readLine())
    var factorial= fact(num0)
    println("the factorial of $num0 is $factorial")
}