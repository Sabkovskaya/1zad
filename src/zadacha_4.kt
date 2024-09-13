fun main() {
    println("Введите два числа и операцию (например, 5 3 +):")

    val input = readLine()?.split(" ")

    if (input == null || input.size != 3) {
        println("Ошибка: введите два числа и операцию, разделенные пробелом.")
        return
    }

    val a = input[0].toDoubleOrNull()
    val b = input[1].toDoubleOrNull()
    val op = input[2]

    if (a == null || b == null) {
        println("Ошибка: введите корректные числа.")
        return
    }

    when (op) {
        "+" -> println("Результат: ${a + b}")
        "-" -> println("Результат: ${a - b}")
        "*" -> println("Результат: ${a * b}")
        "/" -> if (b != 0.0) {
            println("Результат: ${a / b}")
        } else {
            println("Ошибка: деление на ноль.")
        }
        else -> println("Ошибка: неизвестная операция.")
    }
}
