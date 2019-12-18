fun main(args: Array<String>) {
        val Nombre = 0
        var essais = 0
        println("Jeu du Plus ou Moins..")
        println("Choisir un nombre mystere entre 0 et 100 !")
        val NombreMystere = Integer.valueOf(readLine())
        do {
            println("Veuillez entrer un nombre...")
            val Nombre = Integer.valueOf(readLine())
            if (Nombre < NombreMystere) {
                println("C'est plus ! ")
                essais++
            } else if (Nombre > NombreMystere) {
                println("C'est moins !")
                essais++
            } else {
                println("Trouver en $essais essais ! Bien Joué !")
            }
        } while (Nombre != NombreMystere)
    }
