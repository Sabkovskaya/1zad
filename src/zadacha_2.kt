fun main() {
    println("Введите строку:")
    val s = readLine() ?: ""

    if (s.isEmpty()) {
        println("Ошибка: строка не может быть пустой.")
        return
    }

    val map = mutableMapOf<Char, Int>()

    for (ch in s) {
        map[ch] = map.getOrDefault(ch, 0) + 1
    }

    val sortedKeys = map.keys.sorted()
    for (ch in sortedKeys) {
        println("$ch - ${map[ch]}")
    }
}
