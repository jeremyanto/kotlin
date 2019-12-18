class Animalerie{

    var allAnimals = mutableListOf<Animaux>()
    fun affiche() {
        for (a in allAnimals) {
            a.quiSuisJe()
        }
    }

    fun add(wichOne : Animaux){
        allAnimals.add(wichOne)
    }
}

interface Animaux {
    fun quiSuisJe()

    fun parler()
}

class Chat : Animaux{

    override fun parler() {
        println("Maou")
    }

    override fun quiSuisJe() {
        println("i'm a cat")
    }
}

class Chien : Animaux{

    override fun parler() {
        println("Woaf")
    }

    override fun quiSuisJe() {
        println("i'm a dog")
    }
}

class perroquet : Animaux{

    override fun parler() {
        println("jaco jaco my name is jaco")
    }

    override fun quiSuisJe() {
        println("i'm a parrot")
    }
}

fun main() {
    val Animalerie = Animalerie()
    Animalerie.add(Chien())
    Animalerie.add(Chat())
    Animalerie.add(perroquet())
    Animalerie.affiche()
}