fun main() {
    evenlySpaced(6, 2, 4)
    println(evenlySpaced(6,2,4))

    removeVowels("i am making progress")
    println(removeVowels("i am making progress"))

    loveFunc(24,12)
    println(loveFunc(24,12))

    reverseNumber()

}


fun evenlySpaced(a: Int, b: Int, c: Int): Boolean {
    var result: Boolean = false

    when {
        a > b && a > c && b > c -> result = a - b == b - c
        a > b && a > c && c > b -> result = a - c == c - b
        b > a && b > c && a > c -> result = b - a == a - c
        b > a && b > c && c > a -> result = b - c == c - a
        c > a && c > b && a > b -> result = c - a == a - b
        c > a && c > b && b > a -> result = c - b == b - a
    }
    return result
}
fun removeVowels (word: String): String {
    val newWord = StringBuilder()
    for (consonant in word) {
        if (consonant != 'A' && consonant != 'a'
            && consonant != 'E' && consonant != 'e'
            && consonant != 'U' && consonant != 'u'
            && consonant != 'O' && consonant != 'o'
            && consonant != 'I' && consonant != 'i') {
            newWord.append(consonant)
        }
    }
    return newWord.toString()
}

fun loveFunc (flower1: Int, flower2: Int): Boolean {
    return flower1 %2 != flower2 % 2;
}

fun reverseNumber () {
    var numb = 54321
    var reverse = 0
    while (numb != 0) {
        reverse = reverse * 10 + numb % 10
        numb /= 10

    }
    println("Reversed Number: $reverse")
}



