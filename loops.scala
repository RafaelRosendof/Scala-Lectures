

object loops:



  def main(params: Array[String]): Unit =

    val l = List[Int](1 , 2 , 3, 4 ,5 ,6 ,7 ,8, 9, 10)

    for i <- l do println(i)

    for i <- l do 
      println(i)
      println(i * 2)
      