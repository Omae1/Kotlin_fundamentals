fun main(args: Array<String>) {
   println("Enter num1")
    var num1= readln()?.toDoubleOrNull()
    println("Enter num2")
    var num2= readln()?.toDoubleOrNull()

    if (num1 !=null && num2 !=null){
        println("Enter +, _,* or/: ")
        val o= readLine().toString()[0]
        var result: Double?=null
        when (o){
            '+' ->{
                result= num1 + num2
            }
            '-'->{
                result= num1 - num2
            }
            '*'->{
                result= num1 * num2
            }
            '/'-> {
                result= num1 / num2
            }
            else ->{
                println("Please enter valid operator")
            }
        }
        if (result!= null){
            println("$num1 $o $num2 = $result")
        }else{
            print("please enter valid inputs")
        }
    }


   }



