package ch6

import sun.security.util.Length

// 클로저: 내부 함수에서 외부 변수에 접근할 수 있음 -> '포획' 개념
fun main() {
    val calc = Calc()
    var result = 0  // 외부 변수
    calc.addNum(2,3) {x,y -> result = x + y}
    println(result)

    println("filter result: ${filteredNames(3)}")
}

class Calc {
    fun addNum(a:Int, b:Int, add:(Int, Int) -> Unit) = add(a,b)
}

fun filteredNames(length: Int) {  // 길이가 일치하는 이름만 반환하는 함수
    val names = arrayListOf("Kim", "Hong", "Go", "Hwang", "Jeon")
    val filterResult = names.filter {
        it.length == length  // 바깥의 length에 접근
    }
    println(filterResult)
}