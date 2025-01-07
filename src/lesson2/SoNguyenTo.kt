package lesson2

fun main() {
    print("Nhập một số: ")
    val number = readLine()?.toIntOrNull() ?: 0

    if (isPrime(number)) {
        println("$number là số nguyên tố.")
    } else {
        println("$number không phải là số nguyên tố.")
    }
}

fun isPrime(n: Int): Boolean {
    if (n <= 1) return false
    for (i in 2..n / 2) {
        if (n % i == 0) {
            return false
        }
    }
    return true
}
