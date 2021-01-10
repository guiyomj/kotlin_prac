package ch3

fun main() {
    /* 지역 함수 */
    fun sum3(a:Int, b:Int) = println(a + b)  // return값이 없는 경우 Unit 반환

    val result1 = sum3(2,3)
    val result2 = max(2)
    val result3 = max(b = 2)

    println("result2 = $result2, result3 = $result3")

    func(1,2,3,4,5)

    // 지역변수 -> 스택에 저장, 전역변수+동적 객체체 ->힙에 저장
}

/* top-level(최상위) 함수 */
fun sum(a:Int, b:Int) = a + b  // return 생략

fun sum2(a:Int, b:Int) : Int {  // 함수 선언시 return값의 자료형을 꼭 선언해야 함
    return a + b
}

fun max(a:Int = 6, b:Int = 5) = if(a > b) a else b

fun func(vararg a:Int) {  // vararg 인자를 사용하면 같은 자료형 여러 개를 파라미터로 받을 수 있음
   for (num in a) print("$num ")
}