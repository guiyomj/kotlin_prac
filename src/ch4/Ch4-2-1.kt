package ch4

fun main() {
    val result = callByValue(Lambda())
    println(result)

    val result2 = callByName(otherLambda)
    println(result2)
}

// 값에 의한 호출로 람다식 사용
fun callByValue(b:Boolean):Boolean {
    println("callByValue function")
    return b
}

val Lambda: () -> Boolean = {
    println("lambda function")
    true
}

// 이름으로 람다식 호출
fun callByName(b: () -> Boolean):Boolean {
    println("callByName function")
    return b()  // 이 함수가 먼저 실행 -> 그 후에 람다식 실행
}

val otherLambda: () -> Boolean = {
    println("otherLambda function")
    true
}

// 일반 함수는 이름으로만 참조 불가능 -> 참조열 방식을 사용하면 가능(함수 이름 앞에 :: 붙이기)