package lesson2

fun main() {
    // Mảng ví dụ | Example array
    val array = arrayOf(12, 45, 67, 23, 89, 34, 56)

    println("Mảng: ${array.joinToString(", ")}")
    println("Array: ${array.joinToString(", ")}")

    println("Tổng các phần tử: ${calculateSum(array)}")
    println("Sum of elements: ${calculateSum(array)}")

    println("Điểm trung bình: ${calculateAverage(array)}")
    println("Average of elements: ${calculateAverage(array)}")

    println("Phần tử lớn nhất: ${findMaximum(array)}")
    println("Maximum element: ${findMaximum(array)}")

    println("Phần tử nhỏ nhất: ${findMinimum(array)}")
    println("Minimum element: ${findMinimum(array)}")

    print("Nhập giá trị cần tìm: ")
    print("Enter a value to search: ")
    val value = readLine()?.toIntOrNull()
    if (value != null) {
        val index = searchValue(array, value)
        if (index != -1) {
            println("Giá trị $value được tìm thấy tại vị trí: $index")
            println("Value $value found at index: $index")
        } else {
            println("Không tìm thấy giá trị $value trong mảng.")
            println("Value $value not found in the array.")
        }
    } else {
        println("Dữ liệu nhập không hợp lệ.")
        println("Invalid input.")
    }
}

fun calculateSum(array: Array<Int>): Int {
    return array.sum()
}

fun calculateAverage(array: Array<Int>): Double {
    return array.average()
}

fun findMaximum(array: Array<Int>): Int {
    return array.maxOrNull() ?: throw IllegalArgumentException("Array is empty")
}

fun findMinimum(array: Array<Int>): Int {
    return array.minOrNull() ?: throw IllegalArgumentException("Array is empty")
}

fun searchValue(array: Array<Int>, value: Int): Int {
    return array.indexOf(value)
}
