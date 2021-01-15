package ch6

// let 함수: 함수를 호출하는 객체 T 입력 -> block의 인자로 넘김 -> 결과값인 R 반환
// 다른 매서드를 실행하거나 연산을 수행할 때 사용, block(T)=R
// this: 자기 자신, it: 복사

fun main() {
    val score:Int ?= 32

    fun checkScore() {
        if (score != null) {
            println("Score: $score")
        }
    }

    fun checkScoreLet() {
        score?.let { println("Score: $it") }
        val str = score.let { it.toString() }
        println(str)
    }

    checkScore()
    checkScoreLet()

    // 1. let()의 체이닝
    var a = 1
    val b = 2

    a = a.let{ it + 2 }.let{
        println("a = $a")
        val i = it + b
        i
    }

    println(a)

    // 2. let()의 중첩 사용
    var x = "Kotlin"
    println(
        x.let { outer ->
            outer.let { inner ->
                println("Inner is $inner and Outer is $outer")
                "Inner String"  // 반환 X
            }
            "Outer String"  // 반환 O
        }
    )

    // 3. null 검사: let과 세이프 콜(?.) 함께 사용 + 엘비스 연산자(?:) 사용

}