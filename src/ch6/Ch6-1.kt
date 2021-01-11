package ch6

fun main() {
    // val result1 = high("Sean", ::func)  // 함수 이름으로만 사용
    val result2 = high("Sean") {x -> x+1}  // 람다식
    val result3 = high("Sean") {it+1}  // 매개변수가 하나일 떄 it으로 함축
}

// 람다식
val sum: (Int, Int) -> Int = {
        x,y -> x+y
}
val mul = {x:Int, y:Int -> x*y}
val add: (Int) -> Int = {it + 1}

// 람다식의 반환
val isPositive: (Int) -> Boolean = {
    val isPositive = it > 0
    isPositive
}
val isPositiveLabel: (Int) -> Boolean = number@ {
    val isPositive = it > 0
    return@number isPositive
}

// 고차함수
fun high(name:String, body: (Int) -> Int):Int {
    println("name: $name")
    val x = 0
    return body(x)
}