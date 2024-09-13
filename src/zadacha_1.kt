fun main() {
    println("Введите строку:")
    val s = readLine() ?: ""

    if (s.isEmpty()) {
        println("Ошибка: строка не может быть пустой.")
        return
    }

    val r = StringBuilder()
    var c = 1

    for (i in 1 until s.length) {
        if (s[i] == s[i - 1]) {
            c++
        } else {
            r.append(s[i - 1])
            if (c > 1) r.append(c)
            c = 1
        }
    }
    r.append(s.last())
    if (c > 1) r.append(c)

    println("Результат: $r")
}
