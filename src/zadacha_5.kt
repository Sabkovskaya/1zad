fun main() {
    println("Введите целое число n:")

    val nInput = readLine()?.toIntOrNull()

    if (nInput == null) {
        println("Ошибка: введите корректное целое число.")
        return
    }

    println("Введите основание степени x:")

    val xInput = readLine()?.toIntOrNull()

    if (xInput == null || xInput <= 1) {
        println("Ошибка: основание степени должно быть больше 1.")
        return
    }

    var y = 0
    var power = 1

    while (power < nInput) {
        y++
        power *= xInput
    }

    if (power == nInput) {
        println("Целочисленный показатель степени y: $y")
    } else {
        println("Целочисленный показатель не существует.")
    }
}
