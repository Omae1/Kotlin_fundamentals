fun main(args: Array<String>) {
    var num=64
    if (num>=65){
        println("proceed to the next level")

    }else{
        println("try again in the next three months")
    }

    var marks = 42
    if (marks>=0 && marks<=39 ){
        println("Fail")
    }else if(marks>=40 && marks<=59){
    println("pass")

    }else if (marks>=60 && marks<=79){
        println("Credit")

    } else if (marks>= 80 && marks<=100){
        println("Distinction")
    }else{
        println("Please input marks correctly")
    }
}