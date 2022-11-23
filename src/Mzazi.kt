open class Mzazi {
var color="followed moms color"
    var height= " followed dads height"
}
class Njeri: Mzazi(){
    fun female(){
        println("Njeri ${color}")
    }
    }

class Peter: Mzazi(){
    fun male(){
        println("Peter ${height}")
    }

}

fun main(args: Array<String>) {
    val obj= Njeri()
   obj.female()
    val obj1= Peter()
    obj1.male()

}
