package ch4

fun main() {
    val multi = 3.multiply(10)  // 일반 표현법
    val multi2 = 3 multiply 10

    println("multi: $multi, multi2: $multi2")

    val num = 3
    val str = num.strPlus("Kotlin")
    val str2 = num strPlus "Kotlin"
    println("str: $str, str2: $str2")

    val number = 5
    println("Factorial: $number -> ${factorial(number)}")
}

/* 중위 함수(infix): 클래스의 멤버 호출시 . 생략
 * 조건 1. 멤버 메서드 또는 확장 함수
 * 2. 하나의 매개변수를 가져야 함
 * 3. infix 키워드를 사용하여 정의
 */

infix fun Int.strPlus(x:String) = "$x version $this"

infix fun Int.multiply(x:Int):Int = this * x

// 꼬리 재귀 함수: 스택에 계속 쌓이는 방식, tailrec 키워드 사용
tailrec fun factorial(n:Int, run:Int = 1):Long = if (n == 1) n.toLong() else n* factorial(n-1, run*n)