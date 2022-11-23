class Staff(val name: String, val jobDescription:String, val DOE: Int) {





}

fun main(args: Array<String>) {
    val obj= Staff("Willys", "Software Engineer", 2022)
    println(" My name is ${obj.name} and i am  a ${obj.jobDescription} emplyed in ${obj.DOE}")
}