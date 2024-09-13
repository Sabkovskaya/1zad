fun main() {
    println("Введите натуральное число:")

    val input = readLine()
    val n = input?.toIntOrNull()

    if (n == null || n <= 0) {
        println("Ошибка: введите натуральное число.")
        return
    }

    var b = ""
    var num = n

    while (num > 0) {
        b = (num % 2).toString() + b
        num /= 2
    }

    println("Двоичное представление: $b")
}
