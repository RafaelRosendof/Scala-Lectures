

object loops:



  def main(params: Array[String]): Unit =

    val l = List[Int](1 , 2 , 3, 4 ,5 ,6 ,7 ,8, 9, 10)

    for i <- l do println(i)

    for i <- l do 
      println(i)
      println(i * 2)
      

    

    for i <- 0 until 10 do println(i)

    for i <- 0 to 10 do println(i)

    val l3 = 3 

    if l3 > 1 then println("true") else println("false")


    //fazer o capítulo de classes agora 

    //removido as pastas