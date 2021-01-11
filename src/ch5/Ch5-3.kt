package ch5

fun main() {
    retFunc()
}

inline fun inlineLambda(a:Int, b:Int, out: (Int, Int) -> Unit) = out(a,b)

fun retFunc() {
    println("start of retFunc")
    inlineLambda(12,3) lit@{  // 1. 라벨 지정(라벨명@)
        a,b ->
        val result = a + b
        if (result > 10) return@lit  // 2. 지정한 라벨 반환(@라벨명), 특정 값을 함께 반환하려면 라벨명 뒤에 값을 붙임
        println("result: $result")
    }
    println("end of retFunc")  // 실행 X -> 비지역반환
}

// 암묵적 라벨: 라벨 지정 없이 함수 이름을 라벨명으로 사용
// 익명함수의 장점(람다식 제외): 비지역반환이 일어나지 않음
// 람다식은 return을 쓰지 않음 -> 라벨을 이용하면 return 가능

fun LambdaVSAnonymous() {
    val getMessage = lambda@ {  // 람다식
        num:Int -> if (num !in 1..100) return@lambda "Error"
        "Success"
    }

    val getMessage2 = fun(num:Int):String {  // 익명함수수
       if (num !in 1..100) return "Error"
        return "Success"
    }
}