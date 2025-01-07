
fun printString( a: String, b: String , c: Int ){
    println("$a  + day la + $b + thi ra = $c")
}

fun tinhXacSuat(so1: Int , so2: Int, so3: Int, so4: Int ) {
    if (so2 == 0){
        return println("Loi he so mau") ;
    }

    val heso = so1/so2 ;
    println(heso) ;
}
// tra ve int w
fun findNumberLargest (so1: Int , so2: Int ,so3: Int ,so4: Int ,so5: Int  ): Int {
    val largestNumber = maxOf(so1, so2, so3, so4, so5)
    return largestNumber
}
fun khongThamSo(){
    println("1 + 1 = wtf")
}
fun main() {
    var name = "Nhat";
    val so = arrayOfNulls<Int>(5) ;
    val b = readln();
    val a = "mot" ; val c = 5 ;
    val printNumberLargest = findNumberLargest(so[0] ?: 0, so[1] ?: 0, so[2] ?: 0, so[3] ?: 0, so[4] ?: 0)
    val temp1 = khongThamSo();

    println(b) ;
    printString(a , name , c ) ;
    println(name)
    println("$temp1")
    println("$printNumberLargest")

    for (i in 0 until 5){
        println("Nhap so thu ${i+1}");
        so[i] = readln().toInt()
    }

    println("ok");
}
