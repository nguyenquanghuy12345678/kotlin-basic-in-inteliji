package lesson2

fun main() {
    print("Nhập số nguyên thứ nhất: ")
    val num1 = readLine()?.toIntOrNull() ?: 0
    print("Nhập số nguyên thứ hai: ")
    val num2 = readLine()?.toIntOrNull() ?: 0

    println("Tổng: ${add(num1, num2)}")
    println("Hiệu: ${subtract(num1, num2)}")
    println("Tích: ${multiply(num1, num2)}")
    println("Thương: ${divide(num1, num2)}")
}

fun add(a: Int, b: Int): Int {
    return a + b
}

fun subtract(a: Int, b: Int): Int {
    return a - b
}

fun multiply(a: Int, b: Int): Int {
    return a * b
}

fun divide(a: Int, b: Int): String {
    return if (b != 0) {
        (a / b).toString()
    } else {
        "Không thể chia cho 0."
    }
}
