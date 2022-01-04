const val MAX_NUMBER = 22;
const val MAX_AGE = 70 
const val MIN_AGE = 18

fun main() {
    /*
    println(Int.MAX_VALUE);
    println("Hello, world!!!")
    println("Hello, world!!!")
    println("Hello, world!!!")
    var aluno = "Tudo bem "+MAX_NUMBER;
    println(aluno)
    var valor:Int? = null
    println(valor)
	*/
    
    /*
    val a = 200
    val b = 100
    println(a > b)
    println(a.compareTo(b))
    */
    
    // utilizando in
    /*
    val numbers = listOf(3,2,4,8,9)
    println(12 in numbers)
    
    print(12 in 0..15)
    */
    
    // utilizando random
    /*
    val age = (10..20).random()
    println(age)
    println(age in MIN_AGE..MAX_AGE)
    println(age <= MAX_AGE && age >= MIN_AGE)

    
  

   // Funçose de ordem superior
   
   val x:Int
   x = calculate(12,4){a,b -> a*b}
   //val y = calculate(12,4){a,b -> a*b}
   
   print("soma x: "+x)
  // print("soma y: "+y)
  */
   
  val grade = (0..10).random()
  println(grade.getStudentStatus())
  
  var x:Int
  var w:Int? = 10
  var t:String? = x.getStudentStatus()
  //t = x ?: w ?: -1
  println(t)
  
  // usando variaçoes do laço FOR
  
  for(i in 0..20 step 2){
      println(i)
  }
  
  for(i in 10 downTo 0){
      println(i)
  }
    
  for(i in 0 until 10){
      println(i)
  }
}

/*

  // funçoes
    private fun getFullname(name:String, LastName: String):String{
        val fullname = "$name $LastName"
        return fullname
    }
    
    // melhorando a funçao
        private fun getFullname(name:String, LastName: String):String{
        return "$name $LastName"
    }
        
    // melhorando a funçao
        private fun getFullname(name:String, LastName: String) = "$name $LastName"
    }
    
    fun sum(a1:Int,a2:Int){a1.plus(a2)}

    fun calculate(a1:Int,a2:Int, operation:(Int,Int) -> Int):Int{
        val result = operation(a1,a2)
        return result
    }
    

   // funçoes extensoes
   fun String.randomCapitalizedLetter() = 
    this[(0..this.length-1).random()].toUpperCase()
   */
   
   // utilizando when e elvis operator
   
   fun Int.getStudentStatus():String{
       println("nota $this")
        return when(this){
    	in 0..4 -> "reprovado"
        in 5..7 -> "mediano"
        in 8..9 -> "boa"
        10 -> "Excelente"
        else -> "indefinido"
    	}
   }
   