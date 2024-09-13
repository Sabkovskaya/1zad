fun main() {
    println("Введите первую цифру:")

    val a = readLine()?.singleOrNull()?.digitToIntOrNull()

    if (a == null || a < 0 || a > 9) {
        println("Ошибка: введите корректную цифру от 0 до 9.")
        return
    }

    println("Введите вторую цифру:")

    val b = readLine()?.singleOrNull()?.digitToIntOrNull()

    if (b == null || b < 0 || b > 9 || a == b) {
        println("Ошибка: введите корректную различную цифру от 0 до 9.")
        return
    }

    if (b % 2 == 1) {
        println("Нечетное число: $b$a")
    } else if (a % 2 == 1) {
        println("Нечетное число: $a$b")
    } else {        println("Создать нечетное число невозможно.")
    }
}
