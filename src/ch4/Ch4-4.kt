package ch4

fun main() {
    /* 중위 함수(infix): 클래스의 멤버 호출시 . 생략
     * 조건 1. 멤버 메서드 또는 확장 함수
     * 2. 하나의 매개변수를 가져야 함
     * 3. infix 키워드를 사용하여 정의
     */

    val multi = 3.multiply(10)  // 일반 표현법
    val multi2 = 3 multiply 10

    println()
}

infix fun Int.multiply(x:Int):Int = this * x