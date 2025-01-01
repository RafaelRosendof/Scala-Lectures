object Up1:

    def main(params: Array[String]): Unit = 

        val x = 1
        val y = 2
        val z = 3

        println(x + y + z)

        println("Olá \n\n");

        params.map(s => s.toUpperCase).foreach(s => printf("%s ", s))
        println("")

        