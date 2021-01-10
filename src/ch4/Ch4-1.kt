package ch4

fun main() {
    val result:Int

    // 람다식 표현법 1
    // val multi = { a:Int,b:Int -> a*b }

    // 람다식 표현법 2
    val multi: (a:Int, b:Int) -> Int = { a,b ->
        println("a: $a, b: $b")
        a*b
    }  // 변수를 함수처럼 사용 가능
    // 표현식이 2줄 이상이면 마지막 표현식이 반환

    result = multi(10,20)
    println(result)

    // 람다식 안에 람다식 가능
    val nestedLambda: () -> () -> Unit = { { println("nested") } }
}