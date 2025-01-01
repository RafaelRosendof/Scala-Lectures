import scala.util.Random

case class Point(x: Double = 0.0, y: Double = 0.0)

abstract class Shape():
    def desenha(f: String => Unit): Unit = f(s"desenha: $this")


case class Circle(center: Point , radius: Double) extends Shape 

case class Rect(lowerF: Point , alt: Double , larg: Double) extends Shape 

case class Triang(p1: Point , p2: Point , p3 : Point) extends Shape 

object ex1:

    def mergeSort(esq: List[Int] , dir: List[Int]):List[Int] = (esq , dir) match
      case(Nil , _) => dir //lista esquerda vazia, retorna a dir
      case(_ , Nil) => esq //lista direita vazia, retorna a esq
      case(h1 :: t1 , h2 :: t2) =>
        if h1 < h2 then
          h1 :: mergeSort(t1 , dir)
        else
          h2 :: mergeSort(esq , t2)
      
    


    def merge(l1: List[Int]): List[Int] =

      if l1.length <= 1 then
        l1
  
      else
        val mid = l1.length / 2

        val(esq , dir) = l1.splitAt(mid)

        //merge(mergeSort(esq) , mergeSort(dir))
        mergeSort(merge(esq) , merge(dir))

    def map(lista: List[Int] , f: Int => Int): List[Int] =
        
      //lista.map(f)

      if lista.isEmpty then
          Nil 
      else
          f(lista.head) :: map(lista.tail , f)

    def ListaAleatoria(tam: Int): List[Int] =
        if tam == 0 then
            Nil 
        else
          Random.between(0 , 150) :: ListaAleatoria(tam - 1)
    
    def Reduce(lista: List[Int] , f: (Int , Int) => Int , acc: Int = 0): Int =

      if lista.isEmpty then
        acc 

      else
        Reduce(lista.tail , f , f(acc , lista.head))


    def main(params: Array[String]): Unit = 

        val c = Circle(Point(0.0 , 0.0) , 1.0)
        val r = Rect(Point(0.0 , 0.0) , 2.0 , 3.0)

        val t = Triang(Point(0.0 , 0.0) , Point(1.0 , 0.0) , Point(0.0 , 1.0))


        val shapes = List(c , r , t)

        shapes.foreach(s => s.desenha(println))

        println("Finalizado \n\n")

        val l = ListaAleatoria(120)

        l.foreach( i => print(s"$i "))

        println("")

        val l2 = map (l , x => x * 2)

        l2.foreach( i => print(s"$i "))

        println("")

        val l3 = Reduce(l2 , (x , y) => x + y )

        printf("O valor do Reduce foi: %d", l3)

        println("  \n\n")

        val l4 = merge(l2)

        l4.foreach( i => print(s"$i "))
