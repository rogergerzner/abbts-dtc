import kotlin.random.Random

/**
 * Gibt beim Start einen Sinnspruch , ein Glückssymbol und eine Glückszahl
 * aus.
 *
 * Autor: Andreas Wassmer
 * Version: 20241120
 */

// Die Sprüche des Tages
val spells = listOf(
    "Nutze den Tag.",
    "Heute ist ein toller Tag.",
    "Glaube an dich selbst.",
    "Jeder Tag ist ein neuer Anfang.",
    "Das Leben ist schön.",
    "Folge deinem Herzen.",
    "Sei mutig und stark.",
    "Lächle und die Welt lächelt zurück."
)

// Todo: Hier die Liste mit den Glückssymbolen einfügen

val luckySymbols = listOf(
    "Kleeblatt",
    "Hufeisen",
    "Marienkäfer",
    "Glückspfennig",
    "Schornsteinfeger",
    "Glücksschwein",
    "Regenbogen",
    "Sternschnuppe"
)



fun main() {
    val random = Random
    val index = random.nextInt(spells.size)
    println("Dein Leitspruch heute: ${spells[index]}")

    // Todo: Hier das Glückssymbol ausgeben
    val index2 = random.nextInt(luckySymbols.size)
    println("Dein Glückssymbol heute: ${luckySymbols[index2]}")


    // Todo: Hier die Glückszahl berechnen und ausgeben
    val luckyNumber = random.nextInt(1, 100)
    println("Deine Glückszahl heute: $luckyNumber")

}