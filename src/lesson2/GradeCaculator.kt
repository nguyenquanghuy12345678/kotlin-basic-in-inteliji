package lesson2

fun main() {
    println("Nhập ít nhất 3 điểm, cách nhau bởi dấu cách (ví dụ: 85 90 78):")
    println("Enter at least 3 scores separated by spaces (e.g., 85 90 78):")

    val input = readLine() ?: ""
    val scores = input.split(" ").mapNotNull { it.toIntOrNull() }

    if (scores.size < 3) {
        println("Vui lòng nhập ít nhất 3 điểm.")
        println("Please enter at least 3 scores.")
        return
    }

    val average = scores.average()
    val grade = assignGrade(average)

    println("Điểm đã nhập: $scores")
    println("Average score: $scores")
    println("Điểm trung bình: %.2f".format(average))
    println("Average: %.2f".format(average))
    println("Xếp loại: $grade")
    println("Grade: $grade")
}

fun assignGrade(average: Double): String {
    return when {
        average >= 90 -> "A"
        average >= 80 -> "B"
        average >= 70 -> "C"
        average >= 60 -> "D"
        else -> "F"
    }
}
