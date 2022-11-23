fun main() {
   try {

       var num= 10/0
       println(num)
   }catch (e:java.lang.ArithmeticException){
       println("Arithmetic Exemption")
   }catch (e:Exception){
       println(e)
   }

}